/**Class: CustomListUtils3
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: December 8, 2023
 *
 * This class – This method returns the index of the first occurrence
 * of the specified element in the given list if
 * the element is in the list, and -1 otherwise.
 *
 */
import java.util.List;

public class CustomListUtils3 {

    public static <E> int indexOf(List<E> list, E element) {
        int index = 0;
        for (E currentElement : list) {
            if ((element == null && currentElement == null) || (element != null && element.equals(currentElement))) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static void main(String[] args) {
        // Example usage:
        List<String> stringList = List.of("A", "B", "C", "D", "E");

        int indexOfC = indexOf(stringList, "C");
        int indexOfX = indexOf(stringList, "X");

        System.out.println("Index of 'C': " + indexOfC); // Output: 2
        System.out.println("Index of 'X': " + indexOfX); // Output: -1
    }
}

