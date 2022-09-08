package java_100_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Problem : Prime Number
 * Input : 7
 * Output : 7 is Prime number;
 * Input  8
 * Output : 8 not Prime number and divide by the [2,4]
 */
public class Day_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number :"); // Only a positive number
        int number = in.nextInt();
        primeNumber(number);
    }
    public static void primeNumber(int num){
        int count = 0;
        List<Integer> dividedNumbers = new ArrayList<>();

        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                count++;
                dividedNumbers.add(i);
            }
        }
        if (count == 0) {
            System.out.println("The number : " + num + " is a Prime Number !");
        }
        else {
            System.out.println("The number : " + num + " is not a prime number !");
            System.out.println("and the number could be divided by these numbers : " + dividedNumbers);
        }
    }
}
