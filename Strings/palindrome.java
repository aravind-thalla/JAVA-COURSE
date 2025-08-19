import java.util.*;
public class palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name : ");
    String name = sc.nextLine();

    boolean ispalindrome = true;
    for(int i=0; i<name.length()/2; i++){
      int left = i, right =name.length()-1-i;
      char leftchar = name.charAt(left);
      char rightchar = name.charAt(right);
      if(leftchar!=rightchar){
        ispalindrome=false;
        break;
      }
    }

    if(ispalindrome){
      System.out.println("The given name : "+name+" is a palindrome");
    }else{
      System.out.println("The given name : "+name+" is  not a palindrome");
    }

  }
}
