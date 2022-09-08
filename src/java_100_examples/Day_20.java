package java_100_examples;

import java.util.Scanner;

/**
 * Problem :  Find the largest number
 * Input : 10 32 24
 * Output : 32
 */
public class Day_20 {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt(); // 10
        int y = in.nextInt(); // 32
        int z = in.nextInt(); // 24
        if( x > y && x > z){
            System.out.println("Largest number : " + x);
        }
        else if(y > x && y > z) {
            System.out.println("Largest number : " + y);
        }
        else {
            System.out.println("Largest number : " + z);
        }
    }
    // largest number : 32
}
