package agh.po.lab4.animals;

public class Snake extends Animal {
    public Snake() {
        legs = 0;
    }

    public String getDescription() {
        return "";
    }

    public void makeSound()
    {
        System.out.println("SSSSSSssssss!");
    }

}
