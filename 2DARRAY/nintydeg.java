import java.util.*;

public class nintydeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input the matrix 
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Create a new matrix for the rotate
        int[][] rotate = new int[cols][rows];

        // Fill the transpose matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotate[j][i] = matrix[i][j];
            }
        }

        // rotate the matrix
        for(int i=0; i<cols; i++){
            int left=0, right = rows-1;
            while (left<right) {
                int temp = rotate[i][left];
                rotate[i][left]=rotate[i][right];
                rotate[i][right]=temp;
                left++;
                right--;
            }
        }

        System.out.println("The 90-degree rotated matrix is:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(rotate[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
