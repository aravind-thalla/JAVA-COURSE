import java.util.*;
public class noofdigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int number = 0;
    /*while(n>0){
      n=n/10;
      number++;
    }
    System.out.println(number);*/
    for(int i=n; i>0;){
      number=number;
      i=i/10;
    }
    System.out.println(number);

    /*do{
      number++;
      n=n/10;
    }while(n>0);
    System.out.println(number);*/
  }
}
