import java.util.*;
public class findx {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no.of rows : ");
    int rows = sc.nextInt();
    System.out.println("Enter no.of cols : ");
    int cols = sc.nextInt();
    int[][] numbers= new int[rows][cols];
    System.out.println("Input numbers in matrix");
    for(int i=0; i<rows; i++){
      for(int j=0; j<cols; j++){
        numbers[i][j]=sc.nextInt();
      }
    }
    System.out.println("Enter the value of x : ");
    int x = sc.nextInt();

    for(int i=0; i<rows; i++){
      for(int j=0; j<cols; j++){
        if(numbers[i][j]==x){
          System.out.println("x is found at location("+i+","+j+")");
        }
      }
      System.out.println();
    }
  }
}