public class LeftRotateArray {
    static int[] leftRotateArray(int arr[]) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 3, 2, 1};

        arr = leftRotateArray(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
