public class Pet {
    private String petName;
    private int age;
    private boolean isHungry;

    public Pet(String petName, int age, boolean isHungry) {
        this.petName = petName;
        this.age = age;
        this.isHungry = isHungry;
    }

    public void feedPet() {
        if (isHungry) {
            isHungry = false;
            System.out.println(petName + " has been fed and is no longer hungry!");
        } else {
            System.out.println(petName + " is not hungry right now.");
        }
    }
} 