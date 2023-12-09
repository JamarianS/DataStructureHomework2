package Excerise2;
/**Class: CustomListUtils5
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: December 8, 2023
 *
 * This class – This method returns the index of the last occurrence of the specified
 * element in the given list
 * if the element is in the list, and -1 otherwise.
 *
 */

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

public class CustomListUtils5 {

    public static <E> boolean remove(List<E> list, E element) {
        ListIterator<E> iterator = list.listIterator();
        while (iterator.hasNext()) {
            E currentElement = iterator.next();
            if ((element == null && currentElement == null) || (element != null && element.equals(currentElement))) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Example usage:
        List<String> stringList = new ArrayList<>(List.of("A", "B", "C", "D", "E", "C"));

        boolean removedC = remove(stringList, "C");
        boolean removedX = remove(stringList, "X");

        System.out.println("List after removing 'C': " + stringList); // Output: [A, B, D, E, C]
        System.out.println("Element 'C' removed: " + removedC);      // Output: true
        System.out.println("Element 'X' removed: " + removedX);      // Output: false
    }
}

