public class practice {
  public static void main(String[] args) {
    int n=4;
    pattern(n);
    //int m=5;
    /*for(int i=1; i<=n; i++){
      for(int j=1; j<=n-i; j++){
        System.out.print(" ");
      }
      for(int j=1; j<=i; j++){
        int sum = i+j;
        if(sum % 2==0){
          System.out.print("1");
        }else{
          System.out.print("0");
        }
        }
      System.out.println();
    }*/

    /*for(int i=1; i<=n; i++){
      for(int j=1; j<=n-i; j++){
        System.out.print(" ");
      }
      for(int j=1; j<=i; j++){
        System.out.print(i+" ");
      }
      System.out.println();
    }
    for(int i=1; i<=n; i++) {
      for(int j=1; j<=n-i; j++) {
          System.out.print(" ");
      }
      for(int j=i; j>=1; j--) {
          System.out.print(j);
      }
      
      for(int j=2; j<=i; j++) {
          System.out.print(j);
      }
      System.out.println();
  }
  for(int i=1; i<=n; i++){
    for(int j=1; j<=n-i; j++){
      System.out.print(" ");
    }
    for(int j=i; j>=1; j--){
      System.out.print(j);
    }
    System.out.println();
  }*/
  }
  static void pattern(int n){
    int originalN = n;
    n = 2 * n;
    for (int i = 1; i < n; i++) {
      for (int j = 1; j < n; j++) {
        int ateveryIndex = originalN - Math.min(Math.min(i, j), Math.min(n - i, n - j)) + 1;
        System.out.print(ateveryIndex + " ");
      }
      System.out.println();
    }
  }

}

