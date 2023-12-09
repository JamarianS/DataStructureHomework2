/**Class: CustomListUtils
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: December 8, 2023
 *
 * This class – This method returns the element of the given
 * list at the specified index.
 *
 */
import java.util.List;

public class CustomListUtils {

    public static <E> E get(List<E> list, int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of range");
        }

        int i = 0;
        for (E element : list) {
            if (i == index) {
                return element;
            }
            i++;
        }

        // This line should never be reached if the input list behaves correctly.
        throw new IndexOutOfBoundsException("Index " + index + " is out of range");
    }

    public static void main(String[] args) {
        // Example usage:
        List<String> stringList = List.of("A", "B", "C", "D", "E");

        try {
            String element = get(stringList, 2);
            System.out.println("Element at index 2: " + element);

            // Uncomment the line below to test the exception handling
            // String invalidElement = get(stringList, 10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

