/**Class: MyQueue
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: December 8, 2023
 *
 * This class – allowing elements to be added to the tail,
 * removed from the head,
 * and providing methods to peek at the head and
 * tail elements without removing them,
 * along with checking if the queue is empty.
 *
 */
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyQueue<E> {

    private LinkedList<E> backingList;

    // Constructor to create an empty queue
    public MyQueue() {
        backingList = new LinkedList<>();
    }

    // Add element to the tail of the queue
    public void add(E e) {
        backingList.addLast(e);
    }

    // Remove and return the element at the head of the queue
    public E remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return backingList.removeFirst();
    }

    // Return the element at the head of the queue without removing it
    public E peekHead() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return backingList.getFirst();
    }

    // Return the element at the tail of the queue without removing it
    public E peekTail() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return backingList.getLast();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return backingList.isEmpty();
    }

}

