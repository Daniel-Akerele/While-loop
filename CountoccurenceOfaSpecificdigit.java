// OccurenceofaSpecificdigit.java
import java.util.Scanner;

public class OccurrenceofaSpecificdigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the digit to count (0-9): ");
        int target = scanner.nextInt();

        if (target < 0 || target > 9) {
            System.out.println("Error: Please enter a digit between 0 and 9.");
            scanner.close();
            return;
        }

        System.out.print("Enter the number to count occurrences in: ");
        int number = scanner.nextInt();
        int count = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit == target) {
                count++;
            }
            number /= 10;
        }
        System.out.println("The digit " + target + " appears " + count + " times.");
        scanner.close();
    }
}