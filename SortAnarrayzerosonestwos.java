import java.util.ArrayList;
import java.util.Arrays;

public class SortAnarrayzerosonestwos {
    public static void sortArray(ArrayList<Integer> arr, int n) {
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (arr.get(mid) == 0) {
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);

                low++;
                mid++;
            } else if (arr.get(mid) == 1) {
                mid++;
            } else {
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int n = 5; // Update the size of the array
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[]{0, 2, 1, 2, 0}));
        sortArray(arr, n);

        // Printing sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
