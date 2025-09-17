public class MainCar {
    public static void main(String[] args) {
        try {
            Car myCar = new Car("BMW", "X4", 180.50);
            System.out.println(myCar);
	    myCar.setSpeed(60.0);

	    System.out.println(myCar);
	    myCar.accelerate();
	    System.out.println(myCar);

            Car invalidCar = new Car("Honda", "Civic", -10.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

