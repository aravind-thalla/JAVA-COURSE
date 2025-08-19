import java.util.Scanner;

public class uppertolower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter an uppercase string: ");
        String input = scanner.nextLine();

        // Convert uppercase to lowercase
        StringBuilder lowerCaseString = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is uppercase
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase by adding 32
                lowerCaseString.append((char) (ch + 32));
            } else {
                // Append non-uppercase characters as they are
                lowerCaseString.append(ch);
            }
        }

        // Output the converted string
        System.out.println("Lowercase string: " + lowerCaseString);

        scanner.close();
    }
}
