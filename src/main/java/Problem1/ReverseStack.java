package Problem1;

import java.util.Stack;

/*
These sites were used as help in this code:
https://tutorialspoint.dev/data-structure/stack-data-structure/reverse-a-stack-using-recursion
https://www.geeksforgeeks.org/reverse-a-stack-using-recursion/
*/

public class ReverseStack {
    public static void reverseStack(Stack<Integer> stack) {
        if (stack == null) {
            return;
        }
        reverse(stack);
    }

    private static void reverse(Stack<Integer> stack) {
        if (stack.size() > 0) {
            int n1 = stack.peek();
            stack.pop();
            reverse(stack);
            reverseHelper(stack, n1);
        }
    }

    private static void reverseHelper(Stack<Integer> stack, int n1) {
        if (stack.isEmpty()) {
            stack.push(n1);
        }
        else {
            int n2 = stack.peek();
            stack.pop();
            reverseHelper(stack, n1);
            stack.push(n2);
        }
    }
}