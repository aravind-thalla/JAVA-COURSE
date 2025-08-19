import java.util.*;
public class sumofdigits {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    int reverse=0;
    for(; n>0; n=n/10){
      sum=n%10;
      reverse=reverse*10+sum;
    }
    System.out.println(sum);
    System.out.println(reverse);
    while(n>0){
      sum=sum+n%10;
      n=n/10;
    }
    System.out.println(sum);
    do{
      sum=sum+n%10;
      n=n/10;
    }while(n>0);
    System.out.println(sum);
  }
}
