import java.util.*;
public class voterid {
  public static boolean isEligible(int age){
    return age>=18;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int age=sc.nextInt();
    if(isEligible(age)){
      System.out.println("is eligible to vote");
    }else{
      System.out.println("not eligible to vote");
    }
  }
}
