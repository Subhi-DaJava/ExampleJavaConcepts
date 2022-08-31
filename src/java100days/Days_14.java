package java100days;

import java.util.Scanner;

public class Days_14 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println("Enter the value of n :");
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
