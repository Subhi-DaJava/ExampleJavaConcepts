package array_notion.standard_input;
/**
 * Sum array elements greater than a given value
 *
 * a program that reads an array of ints and an integer number n. The program must sum all the array elements greater than n.
 *
 * input :
 * 5
 * 5 6 3 4 8
 * 4
 * output:
 * 19
 *
 */

import java.util.Scanner;

public class SumArrayGreaterThanGivenValue {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] numbers = new int[len];
        for (int i = 0; i < len; i++) {
            numbers[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        for (int elt:numbers) {
            if (elt > n) {
                sum += elt;
            }
        }
        System.out.println(sum);
    }
}
