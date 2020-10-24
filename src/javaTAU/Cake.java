package javaTAU;

public class Cake {
     protected String flavor;
     protected double price;


    public Cake(String flavor){
        setFlavor(flavor);
        setPrice(9.99);
    }

    public double getPrice() {
        return price;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
