public class sumof_row_col {
  public static void main(String[] args) {
    int[][] integers = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    int sum=0;
    //sum of rows
    for(int i=0; i<3; i++){
      sum=0;
      for(int j=0; j<4; j++){
        sum = sum+integers[i][j];
      }
      System.out.println("sum of row "+(i+1)+" is : "+sum);
    }

    for(int i=0; i<4; i++){
      sum=0;
      for(int j=0; j<3; j++){
        sum = sum+integers[j][i];
      }
      System.out.println("sum of column "+(i+1)+" is : "+sum);
    }
  }
}
