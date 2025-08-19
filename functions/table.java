import java.util.*;
public class table {
  public static void  printTable(int n, int number){
    for(int i=1; i<=n; i++){
      System.out.println(number*i);
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=10;
    int number = sc.nextInt();
    printTable(n, number);
  }
}
