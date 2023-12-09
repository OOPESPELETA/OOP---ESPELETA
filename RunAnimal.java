import java.util.Scanner;

abstract class Animal {
    abstract void eat();
    abstract void sleep();
    abstract void makeSound();
}
class Bird extends Animal {
    void eat() {
        System.out.print("Birds love to eat seeds");
    }

    void sleep() {
        System.out.println (" and sleep for 10-12 hours.");
            }

    void makeSound() {
        System.out.println("Tweet tweet");
    }
}
class Cat extends Animal {
    void eat() {
        System.out.println("Cats love to eat fish ");
    }

    void sleep() {
        System.out.println("and sleep for 12-16 hours.");
    }

    void makeSound() {
        System.out.println("Meow");
    }
}
class Dog extends Animal {
    void eat() {
        System.out.println("Dogs love to eat bones");
    }

    void sleep() {
        System.out.println("and sleep for 10-14 hours a day.");
    }

    void makeSound() {
        System.out.println("Woof woof");
   }

}
public class RunAnimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
        String choice = sc.nextLine();

        Animal selectedAnimal;

        switch (choice.toUpperCase()) {
            case "B":
                selectedAnimal = new Bird();
                break;
            case "C":
                selectedAnimal = new Cat();
                break;
            case "D":
                selectedAnimal = new Dog();
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println();
        selectedAnimal.eat();
        selectedAnimal.sleep();
        selectedAnimal.makeSound();
    }
}
