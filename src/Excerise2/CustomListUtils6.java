package Excerise2;
/**Class: CustomListUtils6
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: December 8, 2023
 *
 * This class – This method returns true if the
 * two given list contains the same elements in the same order.
 *
 */

import java.util.List;
import java.util.Objects;

public class CustomListUtils6 {

    public static <E> boolean equals(List<E> list1, List<E> list2) {
        if (list1 == list2) {
            return true;
        }

        if (list1.size() != list2.size()) {
            return false;
        }

        for (int i = 0; i < list1.size(); i++) {
            E element1 = list1.get(i);
            E element2 = list2.get(i);

            if (!Objects.equals(element1, element2)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Example usage:
        List<String> list1 = List.of("A", "B", "C", "D");
        List<String> list2 = List.of("A", "B", "C", "D");
        List<String> list3 = List.of("A", "B", "C", "E");

        boolean result1 = equals(list1, list2); // Output: true
        boolean result2 = equals(list1, list3); // Output: false

        System.out.println("Lists are equal: " + result1);
        System.out.println("Lists are equal: " + result2);
    }
}

