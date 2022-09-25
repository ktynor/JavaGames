package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LottoGame {
    public static void main(String[] args) {
        Set<Integer> userNumbers=UserNumbers.getUserNumbers();
        RandomNumbers randomNumbers = new RandomNumbers();
        Set<Integer> drawNumbers=randomNumbers.getRandomNumbers();
        yourResult(userNumbers, drawNumbers);

    }
    public static void yourResult(Set<Integer> userNumbers, Set<Integer> drawNumbers){
        int hits=0;
        List<Integer> hitNumbers=new ArrayList<>();
        for (Integer num:userNumbers
             ) {
            if(drawNumbers.contains(num)){
                hits++;
                hitNumbers.add(num);
            }
        }
        if(hits>0){
            System.out.println("Congratulations! You hit "+hits+" numbers");
            System.out.println(hitNumbers.toString());
        }else{
            System.out.println("Sorry, you didn't hit any number");
        }
    }
}
