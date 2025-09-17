import java.util.Scanner;

  public class FuncHarmonicSum {
  
   public static double FuncHarmonicSum(int N) {

   double sumSeries = 0.0;
        int i = 1;

   while(i <= N) {
     sumSeries += 1.0 / i;
            i++;
   }
   return sumSeries;
 }
  
   public static void main(String[] args) {
    
   Scanner scanner = new Scanner(System.in);
   
      System.out.print("Enter N: ");
      int N = scanner.nextInt();
    
      double result = FuncHarmonicSum(N);
        
        System.out.printf("Sum of series = %.6f%n", result);
        
       
        scanner.close();
    }
 } 

