public class pascalstriangle {
  public static void main(String[] args) {
      int n = 5; // Number of rows

      for (int i = 0; i < n; i++) {
          // Print leading spaces
          for (int j = 0; j < n - i - 1; j++) {
              System.out.print(" ");
          }
          int number = 1;
          for (int j = 0; j <= i; j++) {
              // Print the number and a space
              System.out.print(number + " ");
              // Compute the next number in the row
              number = number * (i - j) / (j + 1);
          }
          System.out.println();
      }
  }
}
