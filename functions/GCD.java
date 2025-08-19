import java.util.*;
public class GCD {
  public static int findGCD(int n1, int n2){
    while(n1 != n2){
      if(n1>n2){
        n1 =n1-n2;
      }else{
        n2 = n2-n1;
      }
    }
    return n1;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int result = findGCD(n1, n2);
    System.out.println(result);
  }
}
