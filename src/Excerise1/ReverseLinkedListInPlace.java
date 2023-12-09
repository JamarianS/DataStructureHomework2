/**Class: ReverseLinkedListInPlace
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: December 8, 2023
 *
 * This class – reverses the order of the e
 * lements of a given linked list in place.
 *
 */
package Excerise1;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedListInPlace {
    public static <E> void reverseLinkedListInPlace(LinkedList<E> list) {
        ListIterator<E> forwardIterator = list.listIterator();
        ListIterator<E> backwardIterator = list.listIterator(list.size());

        while (forwardIterator.nextIndex() < backwardIterator.previousIndex()) {
            E temp = forwardIterator.next();
            forwardIterator.set(backwardIterator.previous());
            backwardIterator.set(temp);
        }
    }

    public static void main(String[] args) {
        // Test the reverseLinkedListInPlace method with a String LinkedList
        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");

        System.out.println("Original String LinkedList: " + stringList);
        reverseLinkedListInPlace(stringList);
        System.out.println("Reversed String LinkedList: " + stringList);

        // Test the reverseLinkedListInPlace method with an Integer LinkedList
        LinkedList<Integer> integerList = new LinkedList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        System.out.println("\nOriginal Integer LinkedList: " + integerList);
        reverseLinkedListInPlace(integerList);
        System.out.println("Reversed Integer LinkedList: " + integerList);
    }
}

