import java.util.*;
public class xpowern {
  public static int xPowerN(int x, int n){
    int result = 1;
    for(int i=1; i<=n; i++){
      result = result*x;
    }
    return result;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter x value:");
    int x=sc.nextInt();
    System.out.println("Enter y value:");
    int n=sc.nextInt();
    int result = xPowerN(x, n);
    System.out.println(result);
  }
}
