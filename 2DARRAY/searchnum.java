import java.util.*;
public class searchnum {

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

    int search = 9;
    boolean found = false;

    for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
        if(search==matrix1[i][j]){
          System.out.println("it is found at index ("+i+","+j+" )");
          found = true;
          break;
        }
      }
    }
    if(!found){
      System.out.println("number not found in the matrix");
    }
  }
}