import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string and the character to find
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter a character to find its frequency: ");
        char targetChar = scanner.next().charAt(0);

        // Initialize frequency count
        int frequency = 0;

        // Loop through the string and count occurrences of targetChar
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == targetChar) {
                frequency++;
            }
        }

        // Output the frequency
        System.out.println("The character '" + targetChar + "' appears " + frequency + " times in the string.");

        scanner.close();
    }
}
