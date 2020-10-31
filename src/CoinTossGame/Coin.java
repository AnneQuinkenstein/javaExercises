package CoinTossGame;
/*
It should contain a field called side, encapsulation,
constant variables for heads and tails,
a method called flip(),
which randomly chooses heads or tails and assigns that value to side.
 */

import java.util.Random;

public class Coin {
    private String side;
    public static String HEADS = "Heads";
    public static String TAILS = "Tails";

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String flip(){
        if (new Random().nextBoolean()){
            setSide(HEADS) ;
        } else {
            setSide(TAILS);
        }
        return side;
    }
}
