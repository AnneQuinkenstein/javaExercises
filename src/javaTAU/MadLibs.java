package javaTAU;

import java.util.Scanner;

public class MadLibs {
    public static void main(String arg[]){
        System.out.println("Give me a season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println("Give me a whole number");
        int num = scanner.nextInt();

        System.out.println("Give me an adjective");
        String adj = scanner.next();

        System.out.println("On a " + adj + " " + season + " day, I drink a minimum of " + num + " cups of coffee.");
    }
}
