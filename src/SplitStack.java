/**Class: SplitStack
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: December 8, 2023
 *
 * This class –  takes a stack of integers as a parameter and
 * splits it into negatives and non-negatives.
 **/
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class SplitStack {
    public static void splitStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        Stack<Integer> positiveStack = new Stack<>();
        Stack<Integer> negativeStack = new Stack<>();
        int size = stack.size();

        for (int i = 0; i < size; i++) {
            int num = stack.pop();
            if (num >= 0) {
                positiveStack.push(num);
            } else {
                negativeStack.push(num);
            }
        }

        while (!negativeStack.isEmpty()) {
            stack.push(negativeStack.pop());
        }

        while (!positiveStack.isEmpty()) {
            stack.push(positiveStack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(5);
        stack1.push(-5);
        stack1.push(67);
        stack1.push(-45);
        stack1.push(67);
        stack1.push(9);
        stack1.push(0);
        stack1.push(-42);
        stack1.push(56);
        stack1.push(-7);

        System.out.println("Input stack 1: " + stack1);
        splitStack(stack1);
        System.out.println("Split stack 1: " + stack1);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1);
        stack2.push(-2);
        stack2.push(-3);
        stack2.push(4);
        stack2.push(-5);
        stack2.push(6);
        stack2.push(-7);
        stack2.push(8);
        stack2.push(-9);

        System.out.println("\nInput stack 2: " + stack2);
        splitStack(stack2);
        System.out.println("Split stack 2: " + stack2);
    }
}