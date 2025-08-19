import java.util.*;
public class boundary {

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

    for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
        if(i==0 || j==0 || i==row-1 || j==col-1){
          System.out.print(matrix1[i][j]+" ");
        }else{
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
