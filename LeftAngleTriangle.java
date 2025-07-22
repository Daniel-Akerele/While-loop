// LeftAngleTriangle.java
import java.util.Scanner;

public class LeftAngleTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single character or digit: ");
        String input = scanner.nextLine();

        if (input.length() != 1) {
            System.out.println("Please enter only a single character.");
            scanner.close();
            return;
        }

        char symbol = input.charAt(0);

        System.out.print("Enter number of lines to print: ");
        int lines = scanner.nextInt();

        for (int i = 1; i <= lines; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(symbol);
            }
            System.out.println(); 
        }

        scanner.close();
    }
}
