// SumthreeInputloop.java
import java.util.Scanner;

public class SumthreeInputsloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.print("Enter first number: ");
            } else if (i == 1) {
                System.out.print("Enter second number: ");
            } else {
                System.out.print("Enter third number: ");
            }

            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println("Sum = " + sum);
    }
}
