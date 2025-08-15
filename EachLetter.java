// EachLetter.java
import java.util.Scanner;

public class EachLetter {
	public static void main(String[] args){
	System.out.print("Enter a word: ");
	Scanner scanner = new Scanner(System.in);
	String word = scanner.nextLine(); 


       for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
	
	scanner.close();
   }
}
