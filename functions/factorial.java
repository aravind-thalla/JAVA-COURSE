import java.util.*;
public class factorial {
  public static int printFacorial(int n){
    if(n<0){
      System.out.println("invalid number");
    }
    int factorial=1;
    for(int i=n; i>=1; i--){
      factorial= factorial*i;
    }
    return factorial;
  }
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int factorial =printFacorial(n);
    System.out.println(factorial);
  }
}
