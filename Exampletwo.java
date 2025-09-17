import java.util.Scanner;

 public static int addNumbers(int a, int b) {
 int sum = (a + b);
 return sum;
}
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
  System.out.print("Enter A: ");
   int A = scanner.nextInt();
 
  System.out.print("Enter B: ");
  int B = scanner.nextInt();
 
  int result= addNumbers(A, B);
  System.out.println("The sum is: " + result);

   scanner.close();
    }

