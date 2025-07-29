// MultiplicationTable.java


  public class MultiplicationTable {
     public static void main(String[] args) {
       
         for (int outterLoop = 1; outterLoop <= 12; outterLoop++) {  

            for (int innerLoop = 1; innerLoop <= 12; innerLoop++) {
		int multiplyResult = innerLoop * outterLoop ; 

              System.out.print(innerLoop+"*"+outterLoop+" = "+multiplyResult+"   ");
       
        }

            System.out.println("");
      }
   }
}
     
