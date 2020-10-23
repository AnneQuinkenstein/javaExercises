package javaTAU;

import java.util.Scanner;

/*
To qualify for a loan there are two conditions that must be met. The person must make at least $30,000 and they must have also been at their job for 2 or more years.
 */
public class LoanQualifier {

    public static void main(String args[]) {

        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        if (salary >= requiredSalary) {
            System.out.println("Enter your years at work:");
            double yearsEmployed = scanner.nextInt();
            scanner.close();
            if (yearsEmployed >= requiredYearsEmployed) {
                System.out.println("You are qualified for a loan.");

            } else {
                System.out.println("Sorry, you are not qualified for a loan.  Your need 2 years with your current employer.");
            }

        } else {
            System.out.println("Sorry, you are not qualified for a loan. Not enough money.");
        }
        scanner.close();
    }
}
