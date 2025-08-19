import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 3, 5, 2, 1};
        inserction(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void inserction(int[] arr) {
        for(int i = 0; i < arr.length - 1; ++i) {
            for(int j = i + 1; j > 0 && arr[j] < arr[j - 1]; --j) {
                swap(arr, j, j - 1);
            }
        }

    }

    static void swap(int[] arr, int start, int second) {
        int temp = arr[start];
        arr[start] = arr[second];
        arr[second] = temp;
    }
}