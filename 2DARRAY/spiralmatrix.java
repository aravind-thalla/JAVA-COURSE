import java.util.*;
public class spiralmatrix {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no.of rows and columns");
    int r=sc.nextInt();
    int c=sc.nextInt();
    int[][] matrix=new int[r][c];
    int total=r*c;
    System.out.println("Enter "+total+" numbers in matrix");
    for(int i=0; i<r; i++){
      for(int j=0; j<c; j++){
        matrix[i][j]=sc.nextInt();
      }
    }
    int leftcol=0, rightcol=c-1, toprow=0, bottomrow=r-1;
    int totalelements=0;
    while (totalelements < r*c) {
      //toprow = leftcolumn to rightcolumn
      for(int j=leftcol; j<=rightcol && totalelements < r*c; j++){
        System.out.print(matrix[toprow][j]+" ");
        totalelements++;
      }
      toprow++;

      //rightcolumn = toprow to bottomrow
      for(int i=toprow; i<=bottomrow && totalelements < r*c; i++){
        System.out.print(matrix[i][rightcol]+" ");
        totalelements++;
      }
      rightcol--;

      //bottomrow = rightcolumn to leftcolumn
      for(int j=rightcol; j>=leftcol && totalelements < r*c;  j--){
        System.out.print(matrix[bottomrow][j]+" ");
        totalelements++;
      }
      bottomrow--;

      //leftcolumn = bottomrow to toprow
      for(int i=bottomrow; i>=toprow && totalelements < r*c; i--){
        System.out.print(matrix[i][leftcol]+" ");
        totalelements++;
      }
      leftcol++;
    }
  }
}