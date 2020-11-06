package Problem2;

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
        int n = 0;
        return null;
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
