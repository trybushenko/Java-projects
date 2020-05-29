import java.lang.constant.Constable;

public class Binary_search {
    public Binary_search() {
    }
    public static Constable binary_search(int[] array, int item) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = array[mid];
            if (item == guess) return mid;
            else if (guess <= item) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        int[] my_array = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(binary_search(my_array, 6));
        System.out.println(binary_search(my_array, 7));

    }
}
