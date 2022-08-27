package CodinGame;

import java.util.Scanner;

public class NinjaProblem {
    public static void main(String[] args) {
        // The first Shuriken is MMM, the second one is 2MMM, and so on
        // NNN is the total number of Shurikens.
        // AAA is the money has Bob
        // borrowMoney is the money borrowed from Alice
        Scanner in = new Scanner(System.in);
        System.out.println("Pleas enter on Shuriken price, the money of Bob and the total Shurikens that Bob buys :");
        int MMM = in.nextInt();
        int AAA = in.nextInt();
        int NNN = in.nextInt();
        while (MMM <= 0 || AAA <= 0 || NNN <= 0){
            System.out.println("Please reenter, all enters should be greater than 0 :");
            MMM = in.nextInt();
            AAA = in.nextInt();
            NNN = in.nextInt();
        }
        int borrowMoney = 0;
        int totalMoney = 0;
        for (int i = 1; i <= NNN; i++) {
            totalMoney += i*MMM;
        }
        borrowMoney = totalMoney - AAA;

        System.out.println("Bob should borrow " + borrowMoney + " from Alice for buying " + NNN + " Shurikens.");
    }
}
