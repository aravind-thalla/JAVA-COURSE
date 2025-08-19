import java.util.*;
public class addofmat {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no.of rows");
    int row = sc.nextInt();
    System.out.println("Enter no.of columns");
    int col = sc.nextInt();
    int[][] matrix1 = new int[row][col];
    int[][] matrix2 = new int[row][col];
    int[][] sumofmatrices = new int[row][col];

    System.out.println("Enter elements of the first matrix:");
    for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
        matrix1[i][j]=sc.nextInt();
      }
    }

    System.out.println("Enter elements of the second matrix:");
    for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
        matrix2[i][j]=sc.nextInt();
      }
    }

    for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
        sumofmatrices[i][j]=matrix1[i][j]+matrix2[i][j];
      }
    }

    System.out.println("Sum of the matrices:");
    for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
        System.out.print(sumofmatrices[i][j]+" ");
      }
      System.out.println();
    }

  }
}