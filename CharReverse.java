// CharReverse.java
import java.util.Scanner;
  
   public class CharReverse {
       public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         System.out.print("Enter text or number: ");
        String input = scanner.nextLine(); 


        StringBuilder evenPositionChars = new StringBuilder();
        StringBuilder oddPositionChars = new StringBuilder(); 

         for (int i = 0; i < input.length(); i++) {
            int position = i + 1;  

            if (position % 2 == 0) {
                evenPositionChars.append(input.charAt(i));  
            } else {
                oddPositionChars.append(input.charAt(i));   
            }
        }

        evenPositionChars.reverse();
        oddPositionChars.reverse();

        String result = evenPositionChars.toString() + oddPositionChars.toString();

        System.out.println("Reversed Concatenation (Even + Odd): " + result);

        scanner.close();

     }
  }