package javaTAU;

public class PhoneBill {
    /*
    ID, a base class, a number of allotted minutes and a number of minutes used.
    And then, it should also be able to calculate the overage, calculate the tax, and calculate the total.
     */
    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;

    public PhoneBill(){
        id = 0;
        baseCost = 79.99;
        allottedMinutes = 800;
        minutesUsed = 800;
    }

    public PhoneBill(int id){
        this.id = id;
        baseCost = 79.99;
        allottedMinutes = 800;
        minutesUsed = 800;
    }

    public PhoneBill(int id, double baseCost, int allottedMinutes, int minutesUsed){
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }

    public double getBaseCost(){
        return baseCost;
    }


    public void setAllottedMinutes(int allottedMinutes){
        this.allottedMinutes = allottedMinutes;
    }

    public int getAllottedMinutes(){
        return allottedMinutes;
    }

    public void setMinutesUsed(int minutesUsed){
        this.minutesUsed = minutesUsed;
    }

    public int getMinutesUsed(){
        return minutesUsed;
    }


    public double calculateOverage() {
        if (minutesUsed > allottedMinutes) {
            double overageRate = 0.25;
            return (minutesUsed - allottedMinutes) *  overageRate;
        } else {
            return 0;
        }
    }

    public double calculateTax(){
        double tax = 0.15;
        double subtotalTax = (baseCost + calculateOverage()) * tax;
        return subtotalTax;
    }

    public double calculateTotal(){
        return calculateTax() + calculateOverage() +baseCost;
    }

    public void printItemizedBill(){
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage Fee: $"
                + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $"
                + String.format("%.2f", calculateTax()));
        System.out.println("Total: $"
                + String.format("%.2f", calculateTotal()));
    }
}
