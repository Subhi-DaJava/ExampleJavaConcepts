package array_notion.standard_input;

import java.util.Arrays;
import java.util.Scanner;

/**
 * use a loop to read all the elements of an array from the standard input.
 * input :
 * 6
 * 5 64 78 63 64 3
 * output : [5, 64, 78, 63, 64, 3]
 */
public class ReadArrayFromInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // optional
        System.out.println("please insert the length of array");
        int len = scanner.nextInt(); // reading a length
        int[] array = new int[len];  // creating an array with the specified length
        // optional
        System.out.println("please, insert the elements");
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt(); // read the next number of the array
        }

        System.out.println(Arrays.toString(array)); // output the array
    }
}
