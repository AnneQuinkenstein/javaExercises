package javaTAU;

import java.util.Arrays;
import java.util.Random;

public class LotterieTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUM = 69;

    public static void main(String args[]) {
    int[] ticket = generateNumbers();
    Arrays.sort(ticket);
    printNumbers(ticket);

    }

    public static int[] generateNumbers(){
        int[] ticket =  new int[LENGTH];
        Random random = new Random();

        for(int i=0; i< LENGTH; i++){
            int randNumber;
            // loop again, when ticket already is in the loop -> no double tickets
            do {
                randNumber = random.nextInt(MAX_TICKET_NUM) + 1;
            } while(search(ticket, randNumber));

            ticket[i] = randNumber;
        }
        return ticket;
    }

    public static void printNumbers(int[] ticket){
        for(int i=0; i<LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }

    /**
     * Does a sequential search on the array to find a value.
     * @param array Array to search through.
     * @param numbertoSearchFor Number to search for.
     * @return true if found, false if not found.
     */

    public static boolean search( int[] array, int numberToSearchFor ){
    for (int value: array){
        if (value == numberToSearchFor) {
         return true;
        }
    }
    return false;
    }
}
