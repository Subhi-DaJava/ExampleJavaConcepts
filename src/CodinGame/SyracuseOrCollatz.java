package CodinGame;

import java.util.Scanner;

public class SyracuseOrCollatz {
    // The Syracuse / Collatz suite is defined as follows: given an initial integer greater than 0, apply the following operations while the integer is different that 1:
    // It is divided by 2 when even, it is multiplied by 3 and raised by 1 when odd
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter an Integer greater than 0 :");
        int n = in.nextInt();
        while ( n <= 0 || n > 100){
            System.out.println("Please reenter a number greater than 0 and less than 100 ");
            n = in.nextInt();
        }
        System.out.print(n + " ");
        while (n != 1){
            if(n % 2 != 0){
                n = n*3 +1;
                System.out.print(n + " ");
            }
            else {
                n/=2;
                System.out.print(n + " ");
            }
        }
    }
}
