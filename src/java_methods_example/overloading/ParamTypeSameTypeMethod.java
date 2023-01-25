package java_methods_example.overloading;

import java.util.Scanner;

/**
 *  The type of result value must be the same as the type of the parameter.
 *   input: int
 *          150
 *   output: 2147483497
 *   ,
 *   input long
 *         150
 *   output: 9223372036854775657
 */

public class ParamTypeSameTypeMethod {
    // method that takes a long value and returns the max value of the long type minus the given number.
    public static long getMaxMinusCurrent(long val) {
        return Long.MAX_VALUE - val;
    }

    // method take an int and return the max value of the int type minus the given value.
    public static int getMaxMinusCurrent(int val) {
        return Integer.MAX_VALUE - val;
    }

    // Do not change code below

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String type = scanner.nextLine();
        switch (type) {
            case "long":
                final long longVal = Long.parseLong(scanner.nextLine());
                final long longResult = getMaxMinusCurrent(longVal);
                System.out.println(longResult);
                break;
            case "int":
                final int intVal = Integer.parseInt(scanner.nextLine());
                final int intResult = getMaxMinusCurrent(intVal);
                System.out.println(intResult);
                break;
            default:
                System.out.println("Unknown type found");
                break;
        }
    }
}
