package agh.po.lab4.animals.zadania;

import agh.po.lab4.animals.Animal;
import agh.po.lab4.animals.Dog;
import agh.po.lab4.animals.Snake;
import agh.po.lab4.animals.Parrot;

import java.util.Random;

public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[100];
        Random random = new Random();

        for (int i = 0; i < animals.length; i++) {
            int los = random.nextInt(3);
            if (los == 0) animals[i] = new Dog();
            else if (los == 1) animals[i] = new Parrot();
            else animals[i] = new Snake();
            }

        int wynik = countTotalLegs(animals);
        System.out.println("Suma nóg wszystkich zwierząt: " + wynik);

        System.out.println("\nDźwięki zwierząt:");
        for (Animal animal : animals) {
            if (animal != null) {
                animal.makeSound();
            }
        }

    }
    public static int countTotalLegs(Animal[] animalsArray) {
        int sum =0;
        for (Animal animal : animalsArray) {
            if (animal != null) {
                sum += animal.legs;
            }
        }
        return sum;
    }



}
