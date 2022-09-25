package lotto;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UserNumbers {
    final public static int MIN = 20;
    final public static int MAX = 40;

    public int getMIN() {
        return MIN;
    }

    public int getMAX() {
        return MAX;
    }

    public UserNumbers() {
    }

    public static Set<Integer> getUserNumbers() {
        Set<Integer> newNumbers = new HashSet<>();
        int number;
        System.out.println("Enter six numbers from " + MIN + " to " + MAX);

        while (newNumbers.size() < 6) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input a number and press Enter");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (isInRange(number))
                    newNumbers.add(number);
            } else {
                System.out.println("That is not a number, please try again");
                System.out.println("Input a number from " + MIN + " to " + MAX);
            }
        }
        System.out.println("Your numbers: " + newNumbers.toString());
        return newNumbers;
    }

    private static boolean isInRange(int number) {
        if (number < MIN || number > MAX) {
            System.out.println("Not in range " + MIN + "-" + MAX + ", try again");
            return false;
        }
        return true;
    }

}
