package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class LottoZad2 {
    public static void main(String[] args) {
        boolean flag = true;
        float time_start = System.currentTimeMillis();
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        ArrayList<Integer> userGuests = new ArrayList<>();
        Random generator = new Random();
        for(int i=0; i<args.length; i++){
            userGuests.add(Integer.parseInt(args[i]));
        }
        while(flag){
            while(randomNumbers.size()!=6){
                int generated_number = generator.nextInt(50)+1;
                if(!randomNumbers.contains(generated_number)){
                    randomNumbers.add(generated_number);
                }
            }
            randomNumbers.retainAll(userGuests);
            if(randomNumbers.size()==6){
                flag = false;
            }



        }
        float time_stop = System.currentTimeMillis();
        System.out.println(time_stop-time_start);






    }
}
