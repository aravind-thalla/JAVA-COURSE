import java.util.Arrays;

public class maxin2D {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        System.out.println(max(arr));
    }
    static int max(int[][] arr){
        int max = arr[0][0];
        for (int[] row : arr) {
            for (int col : row) {
                if (col > max) {
                    max = col;
                }
            }
        }
        return max;
    }
}