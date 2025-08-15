// SumEvenDigits.java
import java.util.Scanner;

 public class SumEvenDigits 
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

   System.out.print("Enter numbers: ");
    int number = scanner.nextInt(); 
    int sum = 0;
     

      while (number > 0) {
         int digit = number  % 10;
          if (digit % 2 == 0) {
          sum += digit;
      }
       number /= 10;
  }


    System.out.println("Sum of even digit: " + sum);
        scanner.close();

   }
}