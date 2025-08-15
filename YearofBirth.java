// YearofBirth.java
import java.util.Scanner;

	public class YearofBirth {
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Enter your age between the range of 1-100: ");
			int age = scanner.nextInt();
		
		
			if ( age >=1 && age <= 100) {
				int currentYear = 2025;
				int yearofBirth = currentYear - age;
				 System.out.println("You're born in the year: " + yearofBirth);
				break;
        		} else {
          			  System.out.println("Invalid age.Please enter an valid age between 1 and 100 ");
	} 
	  	
   }
          

	scanner.close();
  }
}

		