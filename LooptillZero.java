// LooptillZero.java
import java.util.Scanner; 
public class LooptillZero {
   spublic static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);         
        int sum = 0;
        int input;   
        
        while (true) { 
            System.out.print("Enter a number: ");
            input = scanner.nextInt(); 
            
            if (input == 0) { 
                break;            }
            
            sum += input; 
        }
        
        System.out.println("Sum of all numbers = " + sum);         
        scanner.close(); 
    }
}