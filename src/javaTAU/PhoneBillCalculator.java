package javaTAU;

import java.util.Scanner;

/*
So, what you're going to do is allow the user to input the plan fee and the number of overage minutes.
And then you're going to charge 25 cents for every minute that they've gone over, and then a 15% tax on the subtotal.

I want you to create separate methods to calculate the tax, to calculate the overage fees, and to calculate and print the final total.

Please print this as an itemized bill. I have an example of the output expected down below.

Good luck.

Example Output:

Enter base cost of the plan:
82.45
Enter overage minutes:
9
Phone Bill Statement
Plan: $82.45
Overage: $2.25
Tax: $12.71
Total: $97.41

 */
public class PhoneBillCalculator {
    static double feePerMinuteOvertime = 0.25;
    static double tax = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        double plannedFee = getPlanFee();
        int minOvertime = getMinOvertime();
        scanner.close();

        double overageFee = calculateOverageFee(minOvertime);
        double subtotalTax = calculateTax(plannedFee, overageFee);
        calculateFinalTotal(plannedFee, minOvertime, overageFee, subtotalTax);

    }

    public static double getPlanFee(){
        System.out.println("Enter base of the plan:");
        double plannedFee = scanner.nextDouble();
        return plannedFee;
    }

    public static int getMinOvertime(){
        System.out.println("Enter overage minutes:");
        int minOvertime = scanner.nextInt();
        return minOvertime;
    }

    public static double calculateTax(double plannedFee, double overageFee){
        double subtotalTax = (plannedFee + overageFee) * tax;
        return subtotalTax;
    }

    public static double calculateOverageFee(int minOvertime){
        double overageFee = minOvertime * feePerMinuteOvertime;
        return overageFee;
    }
    public static void calculateFinalTotal(double plannedFee, int minOvertime, double overageFee, double subtotalTax){
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + plannedFee);
        System.out.println("Overage Time: " + minOvertime + "min");
        System.out.println("Overage Fee: $" + overageFee);
        System.out.println("Tax: $" + subtotalTax);
        double total = plannedFee + overageFee + subtotalTax;
        System.out.println("Total: $" + total);
    }
}
