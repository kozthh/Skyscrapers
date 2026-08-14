package mainAnimal;

public class Animal {
    private String name;
    private boolean isAlive;

    public Animal(String name, boolean isAlive) {
        this.name = name;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public void breathe() {
        System.out.print(getName().trim() + " is breathing");
    }

    public void walk() {
        System.out.print(getName().trim() + " is walking");
    }

    public void running() {
        System.out.print(getName().trim() + " is running");
    }
}
