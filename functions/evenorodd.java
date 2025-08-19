import java.util.*;
public class evenorodd {
  public static String primeNumber(int n){
    if(n%2==0){
      return "even";
    }else{
      return "odd";
    }
  }
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    String result = primeNumber(n);
    System.out.println(result);
  }
}
