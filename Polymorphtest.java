import java.util.Scanner;

// Base class
class Animal {
    public void speak() {
        System.out.println("I am just an Animal");
    }
}

// Subclasses
class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("I am a Cat");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("I am a Dog");
    }
}

class Elephant extends Animal {
    @Override
    public void speak() {
        System.out.println("I am an Elephant");
    }
}

public class Polymorphtest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Always print "I am a Dog" first
        Animal firstAnimal = new Dog();
        firstAnimal.speak();

        // Ask user for input
        System.out.print("Enter a number between 1 and 3: ");
        int choice = scanner.nextInt();

        // Declare base-class reference
        Animal animal;

        // Choose which object to create
        if (choice == 1) {
            animal = new Cat();
        } else if (choice == 2) {
            animal = new Dog();
        } else if (choice == 3) {
            animal = new Elephant();
        } else {
            animal = new Animal(); // fallback
        }

        // Call speak() polymorphically
        animal.speak();

        scanner.close();
    }
}
