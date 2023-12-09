/**Class: GenericSorting
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: December 8, 2023
 *
 * This class – Implement a generic version of Selection Sort, Insertion Sort, Bubble Sort, Heap Sort,
 * Merge Sort and Quick Sort for sorting an array of
 * objects from a generic class that implements Comparable
 *
 */
import java.util.Arrays;

public class GenericSorting {

    public static <T extends Comparable<? super T>> void selectionSort(T[] A) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (A[j].compareTo(A[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            T temp = A[minIndex];
            A[minIndex] = A[i];
            A[i] = temp;
        }
    }

    public static <T extends Comparable<? super T>> void insertionSort(T[] A) {
        int n = A.length;
        for (int i = 1; i < n; i++) {
            T key = A[i];
            int j = i - 1;
            while (j >= 0 && A[j].compareTo(key) > 0) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
    }

    public static <T extends Comparable<? super T>> void bubbleSort(T[] A) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (A[j].compareTo(A[j + 1]) > 0) {
                    T temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
    }

    public static <T extends Comparable<? super T>> void heapSort(T[] A) {
        int n = A.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(A, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            T temp = A[0];
            A[0] = A[i];
            A[i] = temp;
            heapify(A, i, 0);
        }
    }

    private static <T extends Comparable<? super T>> void heapify(T[] A, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && A[left].compareTo(A[largest]) > 0) {
            largest = left;
        }
        if (right < n && A[right].compareTo(A[largest]) > 0) {
            largest = right;
        }
        if (largest != i) {
            T temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;
            heapify(A, n, largest);
        }
    }

    public static <T extends Comparable<? super T>> void mergeSort(T[] A) {
        if (A.length > 1) {
            int mid = A.length / 2;
            T[] left = Arrays.copyOfRange(A, 0, mid);
            T[] right = Arrays.copyOfRange(A, mid, A.length);

            mergeSort(left);
            mergeSort(right);

            merge(A, left, right);
        }
    }

    private static <T extends Comparable<? super T>> void merge(T[] A, T[] left, T[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                A[k++] = left[i++];
            } else {
                A[k++] = right[j++];
            }
        }
        while (i < left.length) {
            A[k++] = left[i++];
        }
        while (j < right.length) {
            A[k++] = right[j++];
        }
    }

    public static <T extends Comparable<? super T>> void quickSort(T[] A) {
        quickSort(A, 0, A.length - 1);
    }

    private static <T extends Comparable<? super T>> void quickSort(T[] A, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(A, low, high);
            quickSort(A, low, partitionIndex - 1);
            quickSort(A, partitionIndex + 1, high);
        }
    }

    private static <T extends Comparable<? super T>> int partition(T[] A, int low, int high) {
        T pivot = A[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (A[j].compareTo(pivot) <= 0) {
                i++;
                T temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        T temp = A[i + 1];
        A[i + 1] = A[high];
        A[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        // Test with an array of strings
        String[] arr = {"banana", "apple", "orange", "grape", "kiwi"};

        System.out.println("Original array: " + Arrays.toString(arr));

        // Test each sorting method
        selectionSort(arr.clone());
        System.out.println("Selection Sort: " + Arrays.toString(arr));

        insertionSort(arr.clone());
        System.out.println("Insertion Sort: " + Arrays.toString(arr));

        bubbleSort(arr.clone());
        System.out.println("Bubble Sort: " + Arrays.toString(arr));

        heapSort(arr.clone());
        System.out.println("Heap Sort: " + Arrays.toString(arr));

        mergeSort(arr.clone());
        System.out.println("Merge Sort: " + Arrays.toString(arr));

        quickSort(arr.clone());
        System.out.println("Quick Sort: " + Arrays.toString(arr));

        // Test with Arrays.sort
        Arrays.sort(arr.clone());
        System.out.println("Arrays.sort: " + Arrays.toString(arr));

        // Test with Arrays.parallelSort
        Arrays.parallelSort(arr.clone());
        System.out.println("Arrays.parallelSort: " + Arrays.toString(arr));
    }
}

