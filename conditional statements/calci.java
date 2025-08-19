import java.util.*;

public class calci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //calculater
    int a = sc.nextInt();
    int b = sc.nextInt();
    int opearter = sc.nextInt();

    switch (opearter) {
      case 1: System.out.println(a+b);
      break;
      case 2: System.out.println(a-b);
      break;
      case 3: System.out.println(a*b);
      break;
      case 4: if(b==0){
        System.out.println("invalid");
      }else {
        System.out.println(a/b);
      }
      break; 
      case 5: if(b==0){
        System.out.println("invalid");
      }else {
        System.out.println(a % b);
      }
      break;
      default: System.out.println("invalid input");
      break;
    }
  }
}
