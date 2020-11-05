package Problem3;

import Problem2.ListNode;

import java.io.PrintStream;

/*
This site ws used as help in this code:
https://www.geeksforgeeks.org/print-reverse-of-a-linked-list-without-actually-reversing/
*/

public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print) {
        if (list == null) {
            return;
        }
        printListInReverse(list.next, print);
        print.println(list.val);
    }
}
