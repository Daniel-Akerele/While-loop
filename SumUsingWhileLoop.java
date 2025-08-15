// SumUsingWhileLoop.java
import java.util.Scanner;

	public class SumUsingWhileLoop {
    public static void main(String[] args) {

        int i = 1;
        int sum = 0;

        while (i <= 15) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }

        System.out.println("Sum of even numbers from 1 to 15 is: " + sum);
    }
}
