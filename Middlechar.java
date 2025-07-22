// MiddleChar.java
import java.util.Scanner;

  public class Middlechar {
     public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Text or number: ");
          String input = scanner.nextLine();

     
          int length = input.length();
           String middle;

           if (length % 2 == 0) {
              int mid1 = (length / 2) - 1;
              int mid2 = length / 2;
              middle = input.substring(mid1, mid2 + 1);
           } else {
              int mid = length / 2;
             middle = String.valueOf(input.charAt(mid));
          }

          System.out.println("Middle character(s): " + middle);

          scanner.close();
       }  
     }
