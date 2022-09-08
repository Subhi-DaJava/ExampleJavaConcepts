package java_100_examples;

import java.util.Scanner;

/**
 * Problem : Reverse a string
 * Input : abc
 * Output : cba
 */
public class Day_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = in.next();
        String strReverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            strReverse += str.charAt(i);
        }
        System.out.println("String original : " + str);
        System.out.println("String reversed : " + strReverse);
    }
}
