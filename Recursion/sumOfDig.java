public class sumOfDig {
  public static void main(String[] args) {
    int ans = sumOfDig(1342);
    System.out.println(ans);
    
  }
  static int sumOfDig(int n){
    if(n==0){
      return 0;
    }
    return n%10 + sumOfDig(n/10);
  }
}
