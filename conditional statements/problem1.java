import java.util.*;
public class problem1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input;
    do{
      int marks = sc.nextInt();
      if(marks >=90 && marks <=100){
        System.out.println("This is good");
      }else if(marks <=89 && marks >= 60){
        System.out.println("This is also good");
      }else if(marks <=59 && marks >=0){
        System.out.println("marks does not decide your life");
      }else{
        System.out.println("invalid input");
      }

      System.out.println("press 1 to enter new marks 0 to stop");
      input = sc.nextInt();
    }while(input == 1);
  }
}
