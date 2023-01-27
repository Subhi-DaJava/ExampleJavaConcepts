package array_notion.standard_input;

import java.util.Scanner;

/**
 * The program that reads an array of integers and finds the minimum value of the array.
 * input :
 * 5
 * 1 2 3 0 5
 * output : 0
 */
public class MinElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] numbers = new int[len];

        for (int i = 0; i < len; i++) {
            numbers[i] = scanner.nextInt();
        }
        int min = numbers[0];
        for (int i = 0; i < len; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(min);
    }
}
