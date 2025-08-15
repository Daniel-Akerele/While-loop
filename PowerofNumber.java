// PowerofNumber
import java.util.Scanner;

public class PowerofNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base N: ");
        int N = scanner.nextInt();
        
        System.out.print("Enter integer K: ");
        int K = scanner.nextInt();
        
        if (K < 0) {
            System.out.println("Error: K must be non-negative.");
            scanner.close();
            return;
        }

        int i = 0;
        while (i <= K) {
            double result = calculatePower(N, i);
            System.out.println(N + "^" + i + " = " + (long) result);
            i++;
        }
        scanner.close();
    }
    
    private static double calculatePower(int N, int exponent) {
        double result = 1;
        for (int j = 1; j <= exponent; j++) {
            result *= N;
        }
        return result;
    }
}