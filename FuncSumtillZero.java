// FuncSumtillZero.java

import java.util.Scanner;

  public class FuncSumtillZero {
	public static int FuncSumtillZero () {
 	 Scanner scanner = new Scanner(System.in);
	int sum = 0;
        int input;   
	
	while (true) { 
            System.out.print("Enter a number: ");
            input = scanner.nextInt();
	
	if (input == 0) { 
                break; 
	}

	 sum += input; 
 
	} 

 	return sum;
      }
       public static void main(String[] args) {
         int result = FuncSumtillZero();
        System.out.println("Sum of all numbers = " + result);
    }
}