package agh.po.lab4.animals;

public class Parrot extends Animal {
    public Parrot() {
        legs = 2;
    }

    public String getDescription() {
        return "";
    }

    public void makeSound() {
        System.out.println("Prrrrr");

    }
}
