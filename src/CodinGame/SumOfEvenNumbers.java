package CodinGame;

import java.util.Scanner;

public class SumOfEvenNumbers {
    // Give a number N sum up all even numbers from 2 to N.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter an Integer that is greater than 2 :");
        int N = in.nextInt();
        while (N < 2) {
            System.out.println("Please reenter the N, it should be greater than 2 : ");
            N = in.nextInt();
        }
        int K = 0;
        for (int i = 2; i <= N; i++) {
         if(i%2 == 0){
             K+=i;
         }
        }
        System.out.println("The sum up of all even numbers between 2 and " + N +  " is : "  + K);
    }
}
