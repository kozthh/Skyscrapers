package childanimals;

import mainAnimal.Animal;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, boolean isAlive, String breed) {
        super(name, isAlive);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void breathe() {
        System.out.print(getName().trim() + " the dog is breathing");
    }

    @Override
    public void walk() {
        System.out.print(getName().trim() + " the dog is walking");
    }

    @Override
    public void running() {
        System.out.print(getName().trim() + " the dog is running");
    }
}
