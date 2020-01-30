package examples.games;
import java.util.Random;

public class Dice {
    private int top;  // number on the top of the dice
    private Random generator;   // for the random number generator
    public static final int NUMBER_OF_FACES = 6;
    public static final int SUM_OF_SIDES = 7;

    public Dice() {  // set up dice by rolling it
        generator = new Random();
        roll();
    }

    public void roll(){   // roll dice
        top = generator.nextInt(6) + 1;   //generator.nextInt gives a number between 0 and 5
    }

    public int getTop(){  //returns number on the top of the dice
         return top;
    }

    public int getBottom(){  //returns the number on the bottom of the dice
        return SUM_OF_SIDES - getTop();
    }
}
