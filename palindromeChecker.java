// PalindromeChecker.java
import java.util.Scanner;

   public class PalindromeChecker {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word or sentence: ");
        String input = scanner.nextLine();

        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();
  
        String reversed = new StringBuilder(cleanedInput).reverse().toString();

        boolean isPalindrome = cleanedInput.equals(reversed);

        System.out.println("Is palindrome? " + isPalindrome);

        scanner.close();
     }
  }