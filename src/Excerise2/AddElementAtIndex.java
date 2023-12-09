/**Class: AddElementAtIndex
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: December 8, 2023
 *
 * This class – This method adds the given element to the
 * given list at the specified index
 *
 */
import java.util.List;

public class AddElementAtIndex {
    public static <E> void add(List<E> list, int index, E element) {
        if (index < 0 || index > list.size()) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }

        // Shift elements to make room for the new element
        for (int i = list.size() - 1; i >= index; i--) {
            list.add(i + 1, list.get(i));
        }

        // Add the new element at the specified index
        list.set(index, element);
    }

    public static void main(String[] args) {
        // Test the add method with a String list
        List<String> stringList = new java.util.ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");

        System.out.println("Original String List: " + stringList);

        try {
            add(stringList, 1, "Grapes");
            System.out.println("After adding 'Grapes' at index 1: " + stringList);

            // This will throw an exception since the index is out of range
            // add(stringList, 5, "Mango");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

