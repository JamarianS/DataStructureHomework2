/**Class: MyStack
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: December 8, 2023
 *
 * This class –  providing methods
 * to push elements onto the stack, pop elements from
 * the stack, peek at the top element without removing it
 *
 */
import java.util.LinkedList;
import java.util.EmptyStackException;

public class MyStack<E> {
    private LinkedList<E> backingList;

    // Constructor that creates a new, empty stack
    public MyStack() {
        backingList = new LinkedList<>();
    }

    // Method to add the specified element to the top of the stack
    public void push(E e) {
        backingList.addFirst(e);
    }

    // Method to remove and return the element at the top of the stack
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return backingList.removeFirst();
    }

    // Method to return the element at the top of the stack without removing it
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return backingList.getFirst();
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return backingList.isEmpty();
    }

    public static void main(String[] args) {
        // Test the MyStack class
        MyStack<Integer> myStack = new MyStack<>();

        // Push elements onto the stack
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        // Peek at the top element
        System.out.println("Peek: " + myStack.peek());

        // Pop elements from the stack
        System.out.println("Pop: " + myStack.pop());
        System.out.println("Pop: " + myStack.pop());

        // Check if the stack is empty
        System.out.println("Is Empty: " + myStack.isEmpty());

        // Pop remaining element
        System.out.println("Pop: " + myStack.pop());

        // This will throw an EmptyStackException
        // System.out.println("Pop: " + myStack.pop());
    }
}

