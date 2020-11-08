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
            //Removes first value
            stack.pop();
            //Calls the reverse method using the stack after the pop
            reverse(stack);
            //Calls the helper sending the stack and the n1 value
            reverseHelper(stack, n1);
        }
    }

    private static void reverseHelper(Stack<Integer> stack, int n1) {
        //Pushes n1 if the stack is empty
        if (stack.size() == 0) {
            stack.push(n1);
        }
        else {
            //Sets the first value to n2
            int n2 = stack.peek();
            //Removes top value
            stack.pop();
            //Calls back to helper with stack and n1
            reverseHelper(stack, n1);
            //Pushes n2 to the stack
            stack.push(n2);
        }
    }
}