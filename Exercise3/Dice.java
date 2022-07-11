package Exercise3;

import java.util.Random;

public class Dice {
    Random number = new Random();
    int sides = 6;
    boolean rolled = true;

    public int rollDice(){
        return number.nextInt(1,6);
    };

}
