package javaTAU;

public class WeddingCake extends Cake {
    protected int tiers;

    public WeddingCake(){
        super("blueberry");
    }
    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    public int getTiers() {
        return tiers;
    }

}
