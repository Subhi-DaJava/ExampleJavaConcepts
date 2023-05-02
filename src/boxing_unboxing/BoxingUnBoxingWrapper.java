package boxing_unboxing;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

/**
 * Boxing and unboxing
 * Boxing is the conversion of primitive types to objects of corresponding wrapper classes. Unboxing is the reverse process.
 * The following code illustrates both processes:
 *
 * int primitive = 100;
 * Integer reference = Integer.valueOf(primitive); // boxing
 * int anotherPrimitive = reference.intValue();    // unboxing
 *
 * Autoboxing and auto-unboxing are automatic conversions performed by the Java compiler.
 * double primitiveDouble = 10.8;
 * Double wrapperDouble = primitiveDouble; // autoboxing
 * double anotherPrimitiveDouble = wrapperDouble; // auto-unboxing
 *
 * ou can mix both automatic and manual boxing/unboxing processes in your programs.
 *
 * Autoboxing works only when the left and the right parts of an assignment have the same type.
 * In other cases, you will get a compilation error.
 *
 * Long n1 = 10L; // OK, assigning long to Long
 * Integer n2 = 10; // OK, assigning int to Integer
 *
 * Long n3 = 10; // WRONG, assigning int to Long
 * Integer n4 = 10L; // WRONG, assigning long to Integer
 *
 * Constructing wrappers based on other types
 * The wrapper classes have constructors for creating objects from other types. For instance, an object of a wrapper class can be created from a string (except for the Character class).
 *
 * Integer number = new Integer("10012"); // an Integer from "10012"
 * Float f = new Float("0.01");           // a Float from "0.01"
 * Long longNumber = new Long("100000000"); // a Long from "100000000"
 * Boolean boolVal = new Boolean("true");   // a Boolean from "true"
 *
 * You can also create wrapper objects using special methods:
 *
 * Long longVal = Long.parseLong("1000");      // a Long from "1000"
 * Long anotherLongVal = Long.valueOf("2000"); // a Long from "2000"
 */
public class BoxingUnBoxingWrapper {
    /**
     * Implement a method for converting a Long value to int (primitive type) according to the following rules:
     *
     * if the given value is null the method should return the default value for ints;
     * if the given value is greater than Integer.MAX_VALUE the method should return the max value for ints;
     * if the given value is lesser than Integer.MIN_VALUE the method should return the min value for ints;
     * otherwise, the method should return the same value as the passed argument.
     * @param val
     * @return
     */
    public static int convert(Long val) {
        if(val == null) {
            return 0;
        } else if(Long.valueOf(val) > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if(Long.valueOf(val) < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return val.intValue();
        }
    }
    /*
    public static int convert(Long val) {
        // write your code here
        return val == null ? 0
                : val > Integer.MAX_VALUE ? Integer.MAX_VALUE
                : val < Integer.MIN_VALUE ? Integer.MIN_VALUE
                : val.intValue();
    }

     */

/*    public static int convert(Long val) {
        if (val == null) {
            return 0;
        }
        return (int) Math.max(Integer.MIN_VALUE, Math.min(val, Integer.MAX_VALUE));
    }*/

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        Long longVal = "null".equals(val) ? null : parseLong(val);
        System.out.println(convert(longVal));
    }
}
