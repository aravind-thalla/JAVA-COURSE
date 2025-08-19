import java.util.*;
public class ovelsandconso {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = sc.nextLine().toLowerCase();

    int vowels = 0, consonants = 0;

    for (char ch : input.toCharArray()) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            vowels++;
        } else if (ch >= 'a' && ch <= 'z') {
            consonants++;
        }
    }

    System.out.println("Number of vowels: " + vowels);
    System.out.println("Number of consonants: " + consonants);
   }
  }

