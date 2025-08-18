// HarmonicSum.java
import java.util.Scanner;

public class HarmonicSum {
   public static void main(String[] args) {
    
   Scanner scanner = new Scanner(System.in);

   System.out.print("Enter N: ");
   int N = scanner.nextInt();

   double sumSeries = 0.0;
        int i = 1;

   while(i <= N) {
   sumSeries += 1.0 / i;
            i++;
        }
        
        System.out.printf("Sum of series = %.6f%n", sumSeries);
        
       
        scanner.close();
    }
}