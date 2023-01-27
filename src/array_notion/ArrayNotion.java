package array_notion;

import java.util.Arrays;

/**
 * An array is a collection of elements of the same type.
 * <p>
 * Declaration, instantiation, initialization
 * By default, an array of a primitive type is initialized with default values.
 * <p>
 * For other values, you need to fill values explicitly or use the utility class Arrays.
 * It provides a convenient way to fill a whole array or a part of it with some values.
 * <p>
 * To obtain the length of an existing array, access the special property arrayName.length.
 * <p>
 * Indexes of an array have numbers from 0 to length – 1 inclusive.
 */
public class ArrayNotion {
    public static void main(String[] args) {
        int[] array; // declaration form 1

        int arrayOne[]; // declaration form 2: less used in practice

        int[] numbers = {1, 2, 3, 4}; // instantiating and initializing an array of 1, 2, 3, 4

        int a = 1, b = 2, c = 3, d = 4;
        int[] numbersA = {a, b, c, d}; // instantiating and initializing an array of 1, 2, 3, 4

        int n = 5; // n is a length of an array
        int[] numbersB = new int[n];

        int[] numbersC; // declaration
        numbersC = new int[n]; // instantiation and initialization with default values

        float[] floatNumbers; // declaration
        floatNumbers = new float[]{1.02f, 0.03f, 4f}; // instantiation and initialization

        /*
        For other values, you need to fill values explicitly or use the utility class Arrays.
        It provides a convenient way to fill a whole array or a part of it with some values.
         */
        int size = 10;
        char[] characters = new char[size];

        // It takes an array, start index, end index (exclusive) and the value for filling the array
        Arrays.fill(characters, 0, size / 2, 'A');
        Arrays.fill(characters, size / 2, size, 'B');

        System.out.println(Arrays.toString(characters)); // it prints [A, A, A, A, A, B, B, B, B, B]

        // Array length
        int[] arrayD = {1, 2, 3, 4}; // an array of numbers

        int length = arrayD.length; // number of elements of the array

        System.out.println(length); // 4

        // Set and Get elements
        System.out.println("Set and Get elements from an Array");
        int[] numbersE = new int[3]; // numbers: [0, 0, 0]
        // In the first line, the array of integers named numbers with three elements in it is created.
        // It is initialized with default values, which is 0 for the int type.
        for (int number : numbersE) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(numbersE));

        numbersE[0] = 1; // numbers: [1, 0, 0]
        numbersE[1] = 2; // numbers: [1, 2, 0]
        // the sum of the first two elements is assigned to the third element by its index.
        numbersE[2] = numbersE[0] + numbersE[1]; // numbers: [1, 2, 3]

        System.out.println();
        for (int number : numbersE) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(numbersE));

        // If we try to access a non-existing element by an index then a runtime exception occurs.
        // The program throws an ArrayIndexOutOfBoundsException.
        //int elem = numbersE[3];
    }
}
