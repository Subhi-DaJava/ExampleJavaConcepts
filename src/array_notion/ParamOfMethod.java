package array_notion;

import java.util.Arrays;

/**
 * When you pass a value of a primitive type to a method,
 * a copy of the value is created. When you pass an array to a method,
 * a copy of the reference is created, but the value is the same.
 * It means that if you change the actual value (elements of an array) in the body of a method, you will see these changes outside the method.
 *
 * If a method has more than one parameter, the vararg parameter must be the last one in the declaration of the method.
 * public static void method(int a, double... varargs)
 */
public class ParamOfMethod {
    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5 }; // numbers
        // before passing method
        System.out.println(Arrays.toString(numbers)); // before swapping

        swapFirstAndLastElements(numbers); // swapping
        // after passing the method
        System.out.println(Arrays.toString(numbers)); // after swapping

        // Varargs
        printNumberOfArguments(numbers);

        // a special syntax ... is used here to specify a vararg parameter.
        // invoke the method by passing several integer numbers or an array of ints.
        // This example also demonstrates the difference between the arguments and parameters of a method.
        // The method has only a single parameter, but it can be called with several arguments.
        System.out.println("varargs....");
        printNumberOfArguments(1);
        printNumberOfArguments(1, 2);
        printNumberOfArguments(1, 2, 3);
        printNumberOfArguments(new int[] { }); // no arguments here
        printNumberOfArguments(new int[] { 1, 2 });
        printNumberOfArguments();
       // printNumberOfArguments(null); // java.lang.NullPointerException
        printNumberOfArguments(0);

        // test
        System.out.println(test(new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 }));
        System.out.println(test(new int[] { 1, 2, 3 }));
        System.out.println(test(new int[] { 1, 2, 3 }, 4, 5));


    }
    // The method has only a single parameter, but it can be called with several arguments.
    public static void swapFirstAndLastElements(int[] nums) { // nums is an array
        if (nums.length < 1) {
            return; // it returns nothing, i.e. just exits the method
        }

        int temp = nums[nums.length - 1]; // save the last element in a temporary local variable
        nums[nums.length - 1] = nums[0];  // now, the last element becomes the first
        nums[0] = temp;                   // now, the first element becomes the former last
    }

    /*
    It's possible to pass an arbitrary number of the same type of arguments to a method using a special syntax named varargs (variable-length arguments).
    These arguments are specified by three dots after the type. I
     */
    public static void printNumberOfArguments(int... numbers) {
        System.out.println(numbers.length);
    }

    // test
    public static int test(int[] array, int... vararg) { return 1; }
}
