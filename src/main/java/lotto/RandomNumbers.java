package lotto;

import java.util.HashSet;
import java.util.Set;


public class RandomNumbers {
    private Set<Integer> randomNumbers = new HashSet<>();

    private void setRandomNumbers(Set<Integer> randomNumbers) {
        this.randomNumbers = generateRandomNumbers();
    }

    public Set<Integer> getRandomNumbers() {
        return  generateRandomNumbers();

    }
    private Set<Integer> generateRandomNumbers() {
        Set<Integer> randomNumbers=new HashSet<>();
        int number;

        while (randomNumbers.size() < 6) {
            number = getRandomNumber(UserNumbers.MIN, UserNumbers.MAX);
            randomNumbers.add(number);
        }
        System.out.println("Drawn numbers: " + randomNumbers.toString());
        return randomNumbers;
    }
    private static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max+1 - min)) + min);// without +1 a range does not include max number!!!
    }
}
