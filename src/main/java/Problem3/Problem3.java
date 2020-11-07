package Problem3;

import Problem2.ListNode;

import java.io.PrintStream;

/*
This site was used as help in this code:
https://www.geeksforgeeks.org/print-reverse-of-a-linked-list-without-actually-reversing/
*/

public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print) {
        ListNode n1 = list;
        if (n1 == null) {
            return;
        }
        printListInReverse(n1.next, print);
        print.println(n1.val);
    }
}
