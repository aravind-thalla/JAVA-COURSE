/*public class printNum {
  public static int num(int n){//if we use int it will return a value 
    if(n==0){
      return 0;
    }
    System.out.println(n);
    return num(n-1);
  }
  public static void main(String[] args) {
    int n=5;
    num(n);
  }
}*/
public class printNum {
  public static void num(int n){//if we use int it will return a value 
    if(n>5){
      return;
    }
    System.out.println(n);
    num(n+1);
    
  }
  public static void main(String[] args) {
    num(1);
  }
}              
