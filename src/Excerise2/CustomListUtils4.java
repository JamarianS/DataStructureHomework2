package Excerise2;
/**Class: CustomListUtils4
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: December 8, 2023
 *
 * This class – This method returns the index of the last occurrence
 * of the specified element in the
 * given list if the element is in the list, and -1 otherwise.
 *
 */
import java.util.List;

public class CustomListUtils4 {

    public static <E> int lastIndexOf(List<E> list, E element) {
        int lastIndex = -1;
        int index = 0;

        for (E currentElement : list) {
            if ((element == null && currentElement == null) || (element != null && element.equals(currentElement))) {
                lastIndex = index;
            }
            index++;
        }

        return lastIndex;
    }

    public static void main(String[] args) {
        // Example usage:
        List<String> stringList = List.of("A", "B", "C", "D", "E", "C");

        int lastIndexOfC = lastIndexOf(stringList, "C");
        int lastIndexOfX = lastIndexOf(stringList, "X");

        System.out.println("Last Index of 'C': " + lastIndexOfC); // Output: 5
        System.out.println("Last Index of 'X': " + lastIndexOfX); // Output: -1
    }
}

