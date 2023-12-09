package Excerise1;

/**Class: ReverseArrayList
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: December 8, 2023
 *
 * This class – reverses the
 * order of the elements of a given array list in place,
 * that is, in the original list itself without
 * using any auxiliary data structure.
 *
 */
import java.util.ArrayList;

public class ReverseArrayList {
    public static <E> void reverseArrayListInPlace(ArrayList<E> list) {
        int size = list.size();
        int mid = size / 2;

        for (int i = 0; i < mid; i++) {
            int j = size - 1 - i;
            E temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }

    public static void main(String[] args) {
        // Test the reverseArrayListInPlace method with a String ArrayList
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");

        System.out.println("Original String ArrayList: " + stringList);
        reverseArrayListInPlace(stringList);
        System.out.println("Reversed String ArrayList: " + stringList);

        // Test the reverseArrayListInPlace method with an Integer ArrayList
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        System.out.println("\nOriginal Integer ArrayList: " + integerList);
        reverseArrayListInPlace(integerList);
        System.out.println("Reversed Integer ArrayList: " + integerList);
    }
}
