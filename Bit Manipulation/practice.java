import java.util.*;
class main{
     public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int digits=0;
      for(int i=n; i>0; i=i/10){
        digits=digits+i%10;
      }
      System.out.println(digits);
     }
  }

  
