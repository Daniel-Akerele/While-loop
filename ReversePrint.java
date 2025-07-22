// ReversePrint.java
import java.util.Scanner;

  public class ReversePrint {
     public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter text or number : ");
     String input = scanner.nextLine();

       for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }

        scanner.close();
   }
 }