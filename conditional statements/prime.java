import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else if (n == 2) {
            isPrime = true; // 2 is the only even prime number
        } else if (n % 2 == 0) {
            isPrime = false; // Exclude other even numbers
        } else {
            for (int i = 3; i <=n/2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
