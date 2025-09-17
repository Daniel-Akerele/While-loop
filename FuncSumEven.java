//FuncSumEven.java
import java.util.Scanner;

 public class FuncSumEven {
	
	public static int sumEvenDigits(int number) {
        int sum = 0;

 	while (number > 0) {
         int digit = number  % 10;
          if (digit % 2 == 0) {
          sum += digit;
       
	 }
       number /= 10;
       
	}
  
  
  return sum;
 }
 
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

   System.out.print("Enter numbers: ");
    int number = scanner.nextInt(); 
     

     int result = sumEvenDigits(number);
     System.out.println("Sum of even digits: " + result);

        scanner.close();
    }
}
