// VowelCounter.java
import java.util.Scanner;

	public class VowelCounter {
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

		System.out.print("Enter a String: ");
		String userInput = input.nextLine();

		
		int vowelCount = 0;
	        String vowels = "AEIOUaeiou";
		
		for (int i = 0; i < userInput.length(); i++) {
                char c = userInput.charAt(i);
                if (vowels.indexOf(c) != -1) {
                vowelCount++;

	}
 }
		System.out.println("Number of vowels: " + vowelCount);
    }
}