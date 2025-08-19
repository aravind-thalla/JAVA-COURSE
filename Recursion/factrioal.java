public class factrioal {
  public static int factoriall(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * factoriall(n - 1);
    }
  }  public static void main(String[] args) {
    int n = 5;
    int result = factoriall(n);
    System.out.println("factorial of " + n + " is " + result);
  }
}
