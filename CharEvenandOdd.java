// CharEvenandOdd.java
import java.util.Scanner;

public class CharEvenandOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Text or number: ");
        String input = scanner.nextLine();

      StringBuilder evenPositionChars = new StringBuilder();
        StringBuilder oddPositionChars = new StringBuilder(); 

         for (int i = 0; i < input.length(); i++) {
            int position = i + 1;  // Convert from index to position

            if (position % 2 == 0) {
                evenPositionChars.append(input.charAt(i));  // Even positions
            } else {
                oddPositionChars.append(input.charAt(i));   // Odd positions
            }
        }

        String combined = evenPositionChars.toString() + oddPositionChars.toString();

        System.out.println("Concatenated Result: " + combined);

        scanner.close();
    }
}
