import java.util.*;
public class sum_of_N {
  public static int sum(int n){
    if(n>0){
      return n+sum(n-1);
    }else{
      return 0;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int result = sum(n);
    System.out.println(result);
  }
}