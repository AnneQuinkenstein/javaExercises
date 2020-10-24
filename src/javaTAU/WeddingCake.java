package javaTAU;

public class WeddingCake extends Cake {
    protected int tiers;

    public int getTiers() {
        return tiers;
    }

    public WeddingCake(){
        super("blueberry");
    }
    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
