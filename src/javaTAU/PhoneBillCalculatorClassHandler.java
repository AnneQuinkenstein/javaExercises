package javaTAU;

public class PhoneBillCalculatorClassHandler {

    public static void main(String args[]){
        PhoneBill bill = new PhoneBill(675876);
        bill.setMinutesUsed(5000);
        bill.printItemizedBill();
    }
}
