/**Class: ReverseLinkedList
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: December 8, 2023
 *
 * This class – returns another linked list
 * that contains the elements of the
 * original list in the reverse order.
 *
 */
package Excerise1;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedList {
    public static <E> LinkedList<E> reverseLinkedList(LinkedList<E> list) {
        LinkedList<E> reversedList = new LinkedList<>();

        ListIterator<E> iterator = list.listIterator(list.size());

        while (iterator.hasPrevious()) {
            reversedList.add(iterator.previous());
        }

        return reversedList;
    }

    public static void main(String[] args) {
        // Test the reverseLinkedList method with a String LinkedList
        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");

        System.out.println("Original String LinkedList: " + stringList);
        LinkedList<String> reversedStringList = reverseLinkedList(stringList);
        System.out.println("Reversed String LinkedList: " + reversedStringList);

        // Test the reverseLinkedList method with an Integer LinkedList
        LinkedList<Integer> integerList = new LinkedList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        System.out.println("\nOriginal Integer LinkedList: " + integerList);
        LinkedList<Integer> reversedIntegerList = reverseLinkedList(integerList);
        System.out.println("Reversed Integer LinkedList: " + reversedIntegerList);
    }
}

