// VowelCounter.java
import java.util.Scanner;

	public class VowelCounter {
    public int countVowels(String text) {
        int vowelCount = 0;
        String vowels = "AEIOUaeiou";
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (vowels.indexOf(c) != -1) {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a String: ");
        String userInput = input.nextLine();
        
        VowelCounter counter = new VowelCounter();
        int result = counter.countVowels(userInput);
        System.out.println("Number of vowels: " + result);
        
        input.close();
    }
}