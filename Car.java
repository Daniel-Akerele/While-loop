public class Car {

 private String brandName;
 private String model;
 private double speed;

public Car(String brandName, String model, double speed) {

   if(speed < 0.0) {
    System.out.print("speed must be >= 0.0");
    this.speed = 0.0;
   } else {
    this.speed = speed;
   }

  this.brandName = brandName;
  this.model = model;

 }

  public void setSpeed(double speed) {
   if(speed < 0.0) {
    System.out.print("speed must be >= 0.0");
    this.speed = 0.0;
   } else {
    this.speed = speed;
   }
  }

  public void accelerate() {
   this.speed += 10.0;
  }

  public String getBrandName() {return brandName;}
  public String getModel() {return model;}
  public double getSpeed() {return speed;}
 
  @Override
   public String toString() {
      return String.format("%s: %s%n%s: %s%n%s: %.2f",
      "BrandName", brandName,
      "Model", model,
      "Speed", speed);
  }
}