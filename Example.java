import java.util.Scanner;
 
public class Example {


public static int addNumbers(int firstNumber, int secondNumber){
 int sum =  firstNumber + secondNumber;
  return sum;
}
 

 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

   System.out.print("Enter A: " );
     int A = scanner.nextInt();

   System.out.print("Enter B: ");
     int B = scanner.nextInt();
  
  int result = addNumbers(A, B);

  System.out.println("The sum is: "+ result);

   scanner.close();

   }
}
