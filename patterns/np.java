public class np {
  public static void main(String[] args) {
      int n = 4; // Number of rows

      for (int i = 1; i <= n; i++) {
          // Print the number i, (n - i + 1) times
          for (int j = 1; j <= (n - i + 1); j++) {
              System.out.print(i);
          }
          // Move to the next line
          System.out.println();
      }
  }
}
