package javaTAU;

public class BirthdayCake extends Cake {
    protected int candles;

    public BirthdayCake(){
        super("vanilla");
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

    public int getCandles() {
        return candles;
    }
}
