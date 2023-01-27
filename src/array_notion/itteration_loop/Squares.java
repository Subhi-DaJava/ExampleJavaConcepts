package array_notion.itteration_loop;

import java.util.Arrays;

/**
 * In this code below, an array of size 10 is created and filled with zeros.
 * Then, the value of each element of the array is set to the square of the element's index.
 * Then the program converts the array to the string representation that lists all elements inside square brackets, and prints it to the standard output.
 */
public class Squares {
    public static void main(String[] args) {
        int n = 10; // the size of an array
        int[] squares = new int[n]; // creating an array with the specified size

        System.out.println(Arrays.toString(squares)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        /* iterating over the array */
        for (int i = 0; i < squares.length; i++) {
            squares[i] = i * i; // set the value by the element index
        }

        System.out.println(Arrays.toString(squares)); // [0, 1, 4, 9, 16, 25, 36, 49, 64, 8
    }

}
