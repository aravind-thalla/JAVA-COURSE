import java.util.*;
public class mulnumbers {
  public static int calculateMul(int a , int b){
    //int product=a*b;
    return a*b;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int answer=calculateMul(a, b);
    System.out.println("The answer is : "+answer);
    System.out.println("The answer is : "+calculateMul(a, b));
  }
}
