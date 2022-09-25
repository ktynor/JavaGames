package lotto;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> userNumbers=UserNumbers.getUserNumbers();
        RandomNumbers randomNumbers = new RandomNumbers();
        System.out.println(randomNumbers.getRandomNumbers());
        System.out.println(randomNumbers.getRandomNumbers());

    }
}
