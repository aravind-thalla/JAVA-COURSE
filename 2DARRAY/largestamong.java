import java.util.*;
public class largestamong {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no.of rows");
    int row = sc.nextInt();
    System.out.println("Enter no.of columns");
    int col = sc.nextInt();
    int[][] matrix1 = new int[row][col];

    for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
        matrix1[i][j]=sc.nextInt();
      }
    }

    int largest = matrix1[0][0];

    for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
        if(matrix1[i][j]>largest){
          largest=matrix1[i][j];
        }
      }
    }
    System.out.println("The largest number in matrix is : "+largest);
  }
}