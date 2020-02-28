import java.util.ArrayList;
import java.util.List;

public class Selection_sort {
    private static int find_smallest(List<Integer> list) {
        int smallest = list.get(0);
        int smallest_index = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < smallest) {
                smallest = list.get(i);
                smallest_index = i;
            }
        }
        return smallest_index;
    }
    public static List<Integer> selectionSort(int[] arr) {
        List<Integer> copy_of_arr = new ArrayList<>();
        List<Integer> newArr = new ArrayList<>();
        for (int value : arr) {
            copy_of_arr.add(value);
        }
        for (int i = 0; i < arr.length; i++) {
            int smallest = find_smallest(copy_of_arr);
            newArr.add(copy_of_arr.get(smallest));
            copy_of_arr.remove(smallest);
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 6, 2, 10, 100, 12,15,17,1,3,122,1567};
        System.out.println(selectionSort(array));
        System.out.println("Hello world");  //iuhiuhiuhuiiuhui
    }
}
