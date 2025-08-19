public class fibanocci {
  public static int fibanocciNumbers(int n){
    if(n<2){
      return n;
    }
    return fibanocciNumbers(n-1)+fibanocciNumbers(n-2);
  }
  public static void main(String[] args) {
    int n=6;
    int result = fibanocciNumbers(n);
    System.out.println(result);
  }
}