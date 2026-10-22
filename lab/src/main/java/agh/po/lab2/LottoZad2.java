package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class LottoZad2 {
    public static void main(String[] args) {
        if (args.length != 6) {
            System.out.println("Podaj dokładnie 6 liczb w argumentach.");
            return;
        }

        ArrayList<Integer> userGuesses = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            if(Integer.parseInt(args[i])>49 || Integer.parseInt(args[i])<0 ){
                System.out.println("Podaj liczby z przedzialu 0-49.");
                return;

            }
            userGuesses.add(Integer.parseInt(args[i]));
        }
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        Random generator = new Random();

        long attempts = 0;
        long timeStart = System.currentTimeMillis();

        while (true) {
            attempts++;
            randomNumbers.clear();

            while (randomNumbers.size() < 6) {
                int generatedNumber = generator.nextInt(49) + 1;
                if (!randomNumbers.contains(generatedNumber)) {
                    randomNumbers.add(generatedNumber);
                }
            }

            if (randomNumbers.containsAll(userGuesses)) {
                break;
            }
        }

        long timeStop = System.currentTimeMillis();
        long totalTime = timeStop - timeStart;

        System.out.println("Liczba losowań: " + attempts);
        System.out.println("Czas: " + totalTime + " ms (" + (totalTime / 1000.0) + " s)");
    }
}
