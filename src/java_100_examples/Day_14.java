package java_100_examples;

import java.util.Scanner;

/**
 * Problem : Fibonacci Series
 * Input : 5
 * Output : 0 1 1 2 3
 */
public class Day_14 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println("Enter a number :");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Fibonacci series :");
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = num; i >= 3 ; i--) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
