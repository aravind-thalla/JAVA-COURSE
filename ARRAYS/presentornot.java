import java.util.*;
public class presentornot {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    float number[]=new float[size];

    for(int i=0; i<size; i++){
      number[i]=sc.nextFloat();
    }

    float x=sc.nextFloat();
    boolean isthere=false;
    for(int i=0; i<size; i++){
      if(x==number[i]){
        System.out.println("value x is present at index : "+i);
        isthere=true;
        break;
      }
    }
    if(!isthere){
      System.out.println("x is not there in the array");
    }
  }
}
