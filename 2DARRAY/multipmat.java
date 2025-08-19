import java.util.*;
public class multipmat {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no.of rows");
    int rowA = sc.nextInt();
    System.out.println("Enter no.of columns");
    int colA = sc.nextInt();
    int[][] matrix1 = new int[rowA][colA];


    System.out.println("Enter no.of rows");
    int rowB = sc.nextInt();
    System.out.println("Enter no.of columns");
    int colB = sc.nextInt();
    int[][] matrix2 = new int[rowB][colB];
    if (colA != rowB) {
      System.out.println("Matrix multiplication is not possible. The number of columns in the first matrix must equal the number of rows in the second matrix.");
      return;
  }

    int[][] productofmatrices = new int[rowA][colB];

    System.out.println("Enter elements of the first matrix:");
    for(int i=0; i<rowA; i++){
      for(int j=0; j<colA; j++){
        matrix1[i][j]=sc.nextInt();
      }
    }

    System.out.println("Enter elements of the second matrix:");
    for(int i=0; i<rowB; i++){
      for(int j=0; j<colB; j++){
        matrix2[i][j]=sc.nextInt();
      }
    }

    for(int i=0; i<rowA; i++){
      for(int j=0; j<colB; j++){
        productofmatrices[i][j]=0;
        for(int k=0; k<colA; k++){
          productofmatrices[i][j] = productofmatrices[i][j]+matrix1[i][k]*matrix2[k][j];
        }
      }
    }
    System.out.println("product of the matrices:");
    for(int i=0; i<rowA; i++){
      for(int j=0; j<colB; j++){
        System.out.print(productofmatrices[i][j]+" ");
      }
      System.out.println();
    }

  }
}