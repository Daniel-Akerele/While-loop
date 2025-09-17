import java.util.Scanner;
  
   public class FuncSumodd {
 	
	public  int sumodd(int number) {
        int sum = 0;

 	while (number > 0) {
         int digit = number  % 10;
          if (digit % 2 != 0) {
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
     
	FuncSumodd sum = new FuncSumodd();
     int result = sum.sumodd(number);
     System.out.println("Sum of odd digits: " + result);

        scanner.close();
    }
}
