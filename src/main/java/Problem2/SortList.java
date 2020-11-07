package Problem2;

import java.util.List;

/*
This site was used as help:
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
        ListNode n1 = head;
        ListNode n2 = head;
        int size = getCount(head);
        int middle = 0 + (size + 0) / 2;
        for (int i = 1; i < middle; i++) {
            head = head.next;
        }
        n2 = head.next;
        head.next = null;
        return n2;
    }
    
    private static int getCount(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
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
