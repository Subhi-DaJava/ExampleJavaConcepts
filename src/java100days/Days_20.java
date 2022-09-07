package java100days;

import java.util.Scanner;

/**
 * Program name - Find largest number using java.
 */
public class Days_20 {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt(); // 7
        int y = in.nextInt(); // 8
        int z = in.nextInt(); // 5
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
    // largest number : 8
}
