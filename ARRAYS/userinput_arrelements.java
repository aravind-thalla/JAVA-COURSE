import java.util.*;
public class userinput_arrelements {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size=sc.nextInt();
    int number[]= new int[size];
    //loop for imput
    System.out.println("Enter array elements");
    for(int i=0; i<size; i++){
      number[i]=sc.nextInt();
    }

    //loop for output
    for(int i=0; i<size; i++){
      System.out.println(number[i]);
    }
    System.out.println(number.length);

  }
}
