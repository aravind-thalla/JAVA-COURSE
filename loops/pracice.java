import java.util.Scanner;

public class pracice {
  public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int lineNumber = 1;
        
            // Read input until EOF
            while (sc.hasNextLine()) {
                String s = sc.nextLine();  // Read the entire line
                System.out.println(lineNumber + " " + s);  // Print line number and content
                lineNumber++;
            }  
    }
  }

