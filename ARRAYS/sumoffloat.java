import java.util.*;
public class sumoffloat {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    float sum=0;
    int size=sc.nextInt();
    float number[]=new float[size];

    for(int i=0; i<size; i++){
      number[i]=sc.nextFloat();
    }

    for(int i=0; i<size; i++){
      sum=sum+number[i];
    }
    System.out.println("sum of float values is : "+sum);
  }
}
