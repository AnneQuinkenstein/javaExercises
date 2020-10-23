package javaTAU;

import java.util.Random;

public class DiceGame {
    public static void main(String args[]) {

        int spaces = 20;
        int rolls = 5;
        Random random = new Random();
        int die;
        int positionSpaces = 0;

        while (rolls > 0) {
            die = random.nextInt(6) + 1;
            positionSpaces = positionSpaces + die;
            System.out.println("The dice is rolling: " + die);
            rolls = rolls - 1;
            if (positionSpaces < 20) {
                int leftSpaces = 20 - positionSpaces;
                System.out.println("You are now on Space " + positionSpaces + ". " + leftSpaces + " Spaces are left.");
            } else {
                int outjumped = positionSpaces - 20;
                System.out.println("You jumped very high and are now " + outjumped + " Spaces behind 20 Spaces." );
                break;
            }
        }
    }
}
