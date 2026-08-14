package main;

import childanimals.Dog;
import mainAnimal.Animal;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", true);
        animal.breathe();
        System.out.println();
        animal.walk();
        System.out.println();
        animal.running();

        System.out.println();

        Dog dog = new Dog("Dog", true, "Buddy");
        dog.breathe();
        System.out.println();
        dog.walk();
        System.out.println();
        dog.running();
    }
}
