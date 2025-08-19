import java.util.*;
public class sumofodd {
  public static int sumofOdd(int n){
    int result=0;
    for(int i=0; i<=n; i++){
      if(i%2 != 0){
        result = result+i;
      }
    }
    return result;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(sumofOdd(n));
  }
}
