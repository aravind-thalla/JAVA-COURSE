public class primenumber {

  // Function to check if a number is prime
  public static boolean primeNumber(int number) {
      if (number <= 1) {
          return false;
      }
      for (int i = 2; i <= number/2; i++) {
          if (number % i == 0) {
              return false;
          }
      }
      return true;
  }

  // Main function to test prime numbers
  public static void main(String[] args) {
      int number = 29; // Example number to check
      

      if (primeNumber(number)) {
          System.out.println(number + " is a prime number.");
      } else {
          System.out.println(number + " is not a prime number.");
      }
  }
}
