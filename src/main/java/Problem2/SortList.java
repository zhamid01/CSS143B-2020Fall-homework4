package Problem2;

import java.util.List;

/*
This site was used as help:
https://www.geeksforgeeks.org/find-length-of-a-linked-list-iterative-and-recursive/
https://www.geeksforgeeks.org/merge-two-sorted-lists-place/
*/

public class SortList {
    private static final int SENTRY = Integer.MAX_VALUE;
    // DO NOT ADD ANY NEW MEMBER VARIABLE AND MEMBER FUNCTION

    // DO NOT CHANGE ANYTHING IN THIS FUNCTION
    public static ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode mid = findMidAndBreak(head);
        return mergeLists(sortList(head), sortList(mid));
    }

    public static ListNode findMidAndBreak(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        int length = 0;
        ListNode n1 = head;
        while (head != null) {
            length++;
            head = head.next;
        }
        while (n1.next !=null) {
            int middle = 0 + (length - 0) / 2;
            for (int i = 0; i <= length; i++) {
                if (i >= middle) {
                    return n1;
                }
                n1 = n1.next;
            }
            n1.next = null;
        }
        return n1;
    }

    public static ListNode mergeLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        else if (list2 == null) {
            return list1;
        }
        if (list1.val > list2.val) {
            list2.next = mergeLists(list1, list2.next);
            return list2;
        }
        else {
            list1.next = mergeLists(list1.next, list2);
            return list1;
        }
    }
}
