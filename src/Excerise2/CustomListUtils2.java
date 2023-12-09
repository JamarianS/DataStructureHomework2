/**Class: CustomListUtils2
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: December 8, 2023
 *
 * This class – This method replaces the element of the given list at
 * the specified index with the given element.
 *
 */
package Excerise2;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

public class CustomListUtils2 {

    public static <E> void set(List<E> list, int index, E element) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of range");
        }

        int i = 0;
        for (ListIterator<E> iterator = list.listIterator(); iterator.hasNext(); ) {
            if (i == index) {
                iterator.next();
                iterator.set(element);
                return;
            }
            iterator.next();
            i++;
        }

        // This line should never be reached if the input list behaves correctly.
        throw new IndexOutOfBoundsException("Index " + index + " is out of range");
    }

    public static void main(String[] args) {
        // Example usage:
        List<String> stringList = new ArrayList<>(List.of("A", "B", "C", "D", "E"));

        try {
            set(stringList, 2, "X");
            System.out.println("Modified list: " + stringList);

            // Uncomment the line below to test the exception handling
            // set(stringList, 10, "Y");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

