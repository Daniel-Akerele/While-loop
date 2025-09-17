import java.util.Scanner;
 
 public class FVowelCounter {
  
	public static int countVowels(String words) {
          int count = 0;
        String vowels = "aeiouAEIOU";
   
     for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (vowels.indexOf(c) != -1) { 
                count++;
            }
        }

        return count;
       }

    
       public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
  	

   	System.out.print("Please enter a word: ");
        String word = scanner.nextLine();

	 int result = countVowels(word);;

       System.out.println("The number of vowels in the word is: " + result);
        
   scanner.close();
  
   }
}