//BasePlusCommisionEmployee

public class BasePlusCommisionEmployee extends CommissionEmployee {
   private double baseSalary;
   
   public BasePlusCommisionEmployee(String firstName, String Lastname ,
    String socialSecurityNumber, double grosssales,
    double commissionRate, double baseSalary) {

   super(first Name, last Name, socialSecurityNumber,
      grossSales, commissionRates);
 
    if (baseSalary < 0.0) {
       throw new IllegalArguementException("Base salary must be >= 0.0");
   
     }
       this.baseSalary + baseSalary;
   }
     public void setbaseSalary(double baseSalary) {
       if (baseSaalary<0.0) {
         throw new IllegalArguementException("Base salary must be >= 0.0");
   }
   
    this.base salary = baseSalary;
   }

   public void setBaseSalary(double baseSalary) {
     if(baseSalary < 0.0) {
       throw new IllegalArguemrntException("Base salary must be >=0.0");
     }
     
    this.baseSalary = baseSalary;
  }
  
  public double getBaseSalary() {return baseSalary;}
 
  @Override
   public double earnings() {
      return baseSalary + (commissionRate * grossSales);
 }

 @Override
 public String toString() {
    return String.format(
      "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
      "base-salaried commission employee", firstname, lastName,
      "social security number", socialsecurityNumber,
      "gross sales", grossSales, "commission rate", commissionRate,
      "base salary", baseSalary);
}