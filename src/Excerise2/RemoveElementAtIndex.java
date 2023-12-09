import java.util.List;
/**Class: RemoveElementAtIndex
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: December 8, 2023
 *
 * This class – This method removes the element at the
 * specified index from the given list.
 *
 */

public class RemoveElementAtIndex {
    public static <E> E remove(List<E> list, int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }

        // Retrieve the element to be removed
        E removedElement = list.get(index);

        // Shift elements to fill the gap left by the removed element
        for (int i = index; i < list.size() - 1; i++) {
            list.set(i, list.get(i + 1));
        }

        // Remove the last element (which is now a duplicate of the one before)
        list.remove(list.size() - 1);

        return removedElement;
    }

    public static void main(String[] args) {
        // Test the remove method with a String list
        List<String> stringList = new java.util.ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");

        System.out.println("Original String List: " + stringList);

        try {
            String removedElement = remove(stringList, 1);
            System.out.println("Removed element at index 1: " + removedElement);
            System.out.println("After removal: " + stringList);

            // This will throw an exception since the index is out of range
            // remove(stringList, 3);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
