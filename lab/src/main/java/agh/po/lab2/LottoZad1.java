package agh.po.lab2;
import java.util.ArrayList;
import java.util.Random;

public class LottoZad1 {
    public static void main(String[] args) {

        ArrayList<Integer> randomNumbers = new ArrayList<>();
        ArrayList<Integer> userGuests = new ArrayList<>();
        Random generator = new Random();
        while(randomNumbers.size()!=6){
            int generated_number = generator.nextInt(50)+1;
            if(!randomNumbers.contains(generated_number)){
                randomNumbers.add(generated_number);
            }
        }
        for(int i=0; i<args.length; i++){
            userGuests.add(Integer.parseInt(args[i]));
        }
        System.out.println(randomNumbers);
        randomNumbers.retainAll(userGuests);
        System.out.println(randomNumbers);
        System.out.println(randomNumbers.toArray().length);



    }
}
