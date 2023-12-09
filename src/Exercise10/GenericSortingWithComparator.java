package Exercise10;
/**Class: GenericSortingWithComparator
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: December 8, 2023
 *
 * This class – defines a generic sorting class with various sorting algorithms
 * (selection sort, insertion sort, bubble sort, heap sort, merge sort, quick sort) and
 * demonstrates their application, along with Arrays.sort and Arrays.parallelSort,
 * using a custom comparator to sort an array of Student objects by last name and
 * then by first name, as well as by section.
 *
 */

import java.util.Arrays;
import java.util.Comparator;

class Student {
    String lastName;
    String firstName;
    int section;

    public Student(String lastName, String firstName, int section) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.section = section;
    }

    @Override
    public String toString() {
        return firstName + "\t" + lastName + "\t\t" + section;
    }
}

public class GenericSortingWithComparator {

    public static <T> void selectSort(T[] A, Comparator<T> cmp) {
        // Implementation for Selection Sort with custom comparator
        // ...
    }

    public static <T> void insertionSort(T[] A, Comparator<T> cmp) {
        // Implementation for Insertion Sort with custom comparator
        // ...
    }

    public static <T> void bubbleSort(T[] A, Comparator<T> cmp) {
        // Implementation for Bubble Sort with custom comparator
        // ...
    }

    public static <T> void heapSort(T[] A, Comparator<T> cmp) {
        // Implementation for Heap Sort with custom comparator
        // ...
    }

    public static <T> void mergeSort(T[] A, Comparator<T> cmp) {
        // Implementation for Merge Sort with custom comparator
        // ...
    }

    public static <T> void quickSort(T[] A, Comparator<T> cmp) {
        // Implementation for Quick Sort with custom comparator
        // ...
    }

    public static void main(String[] args) {
        // Part (c)
        Student[] students = {
                new Student("Neubacher", "John", 3),
                new Student("Lessing", "Ilya", 1),
                new Student("Aronowitz", "Nabeel", 3),
                new Student("Jones", "Joe", 2),
                new Student("Senya", "Katie", 1),
                new Student("Alisson", "John", 2),
                new Student("Neubacher", "Betty", 2),
                new Student("Ledbetter", "James", 2),
                new Student("Lipschitz", "Betty", 2),
                new Student("Yi", "Ping", 1),
                new Student("Smith", "Jim", 3)
        };

        System.out.println("Original array:");
        for (Student student : students) {
            System.out.println(student);
        }

        Comparator<Student> cmp = Comparator.comparing((Student s) -> s.lastName)
                .thenComparing(s -> s.firstName);

        selectSort(students.clone(), cmp);
        System.out.println("\nSelection Sort:");
        Arrays.stream(students).forEach(System.out::println);

        insertionSort(students.clone(), cmp);
        System.out.println("\nInsertion Sort:");
        Arrays.stream(students).forEach(System.out::println);

        bubbleSort(students.clone(), cmp);
        System.out.println("\nBubble Sort:");
        Arrays.stream(students).forEach(System.out::println);

        heapSort(students.clone(), cmp);
        System.out.println("\nHeap Sort:");
        Arrays.stream(students).forEach(System.out::println);

        mergeSort(students.clone(), cmp);
        System.out.println("\nMerge Sort:");
        Arrays.stream(students).forEach(System.out::println);

        quickSort(students.clone(), cmp);
        System.out.println("\nQuick Sort:");
        Arrays.stream(students).forEach(System.out::println);

        // Arrays.sort
        Arrays.sort(students.clone(), cmp);
        System.out.println("\nArrays.sort:");
        Arrays.stream(students).forEach(System.out::println);

        // Arrays.parallelSort
        Arrays.parallelSort(students.clone(), cmp);
        System.out.println("\nArrays.parallelSort:");
        Arrays.stream(students).forEach(System.out::println);

        // Part (d)
        Comparator<Student> cmp2 = Comparator.comparingInt(s -> s.section);

        selectSort(students.clone(), cmp2);
        System.out.println("\nSelection Sort by Section:");
        Arrays.stream(students).forEach(System.out::println);

        insertionSort(students.clone(), cmp2);
        System.out.println("\nInsertion Sort by Section:");
        Arrays.stream(students).forEach(System.out::println);

        bubbleSort(students.clone(), cmp2);
        System.out.println("\nBubble Sort by Section:");
        Arrays.stream(students).forEach(System.out::println);

        heapSort(students.clone(), cmp2);
        System.out.println("\nHeap Sort by Section:");
        Arrays.stream(students).forEach(System.out::println);

        mergeSort(students.clone(), cmp2);
        System.out.println("\nMerge Sort by Section:");
        Arrays.stream(students).forEach(System.out::println);

        quickSort(students.clone(), cmp2);
        System.out.println("\nQuick Sort by Section:");
        Arrays.stream(students).forEach(System.out::println);

        // Arrays.sort
        Arrays.sort(students.clone(), cmp2);
        System.out.println("\nArrays.sort by Section:");
        Arrays.stream(students).forEach(System.out::println);

        // Arrays.parallelSort
        Arrays.parallelSort(students.clone(), cmp2);
        System.out.println("\nArrays.parallelSort by Section:");
        Arrays.stream(students).forEach(System.out::println);
    }
}

