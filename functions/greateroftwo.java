import java.util.*;
public class greateroftwo {
  public static int greatestAmong(int a,int b){
    if(a>b){
      return a ;
    }else if(a==b){
      return -1;
    }else{
      return b;
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int greatest = greatestAmong(a, b);
    if(greatest == -1){
      System.out.println("both are equal");
    }else{
      System.out.println("The greatest number is : "+greatest);
    }
  }
}
