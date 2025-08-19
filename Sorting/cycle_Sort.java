package cycleSort;

import java.util.Arrays;

public class cycle_Sort {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 4, 3, 2, 1};
        cycle(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void cycle(int[] arr) {
        int i = 0;

        while(i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                ++i;
            }
        }

    }

    static void swap(int[] arr, int start, int second) {
        int temp = arr[start];
        arr[start] = arr[second];
        arr[second] = temp;
    }
}