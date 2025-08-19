import java.util.*;

public class isasscending {

   public static void main(String args[]) {

      Scanner sc = new Scanner(System.in);

      // Input array size
      int size = sc.nextInt();
      int numbers[] = new int[size];

      // Input array elements
      for (int i = 0; i < size; i++) {
          numbers[i] = sc.nextInt();
      }

      // Assume the array is sorted initially
      boolean isAscending = true;

      // Check consecutive elements
      for (int i = 0; i < size-1; i++) { // Note the condition
          if (numbers[i] > numbers[i + 1]) { // Check for descending order
              isAscending = false;
              break; // Exit loop early if not sorted
          }
      }

      // Output the result
      if (isAscending) {
          System.out.println("The array is sorted in ascending order");
      } else {
          System.out.println("The array is not sorted in ascending order");
      }
   }
}
