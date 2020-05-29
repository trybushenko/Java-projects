import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public void quickSort(int[] A) { /*here we call a method that calls another method with the same name, but it
    takes on input three values: an array, low bound and high bound of this array. For example, the first case we
    stack with is low = 0 because 0 is low bound of an array, high equals length of an array minus one because
    the count starts from zero so A.length - 1 means all indexes in this array*/
        quickSort(A, 0, A.length - 1);
    }
    private void quickSort(int[] A, int low, int high) {
        if (low < high + 1) {
            int p = partition(A, low, high);
            quickSort(A, low, p - 1);
            quickSort(A, p + 1, high);
        }
        /*previous function checks if length of an array is greater than low. If "true" we start "quicksort" method and
         * */
    }
    private void swap(int[] A, int index1, int index2) {
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }
    private int getPivot(int low, int high) {
        Random rand = new Random();
        return rand.nextInt((high - low) + 1) + low;
    }
    private int partition(int[] A, int low, int high) {
        swap(A, low, getPivot(low, high));
        int border = low + 1;
        for (int i = border; i <= high; i++) {
            if (A[i] < A[low]) {
                swap(A, i, border++);
            }
        }
        swap(A, low, border - 1);
        return border - 1;
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] A = {9, 0, 1, 3, 4, 5, 2, 9, 8, 7, 6, 5, 9, 1, 0, 9};
        System.out.println(Arrays.toString(A));
        qs.quickSort(A);
        System.out.println(Arrays.toString(A));
    }
}