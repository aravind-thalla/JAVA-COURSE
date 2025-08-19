import java.util.*;
public class arrsize_byuser {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter size of the array: ");
    int size=sc.nextInt();
    int number[]=new int[size];
    for(int i=0; i<size; i++){
      System.out.println(number[i]);
    }
  }
}
