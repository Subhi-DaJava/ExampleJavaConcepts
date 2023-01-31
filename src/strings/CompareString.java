package strings;

import java.util.Objects;

/**
 * Since String is a reference type you shouldn't compare strings using the == or != operators.
 * In this case, only addresses will be compared, but not actual values.
 * The "equals" compares the characters inside a string object whereas "==" compares two objects references to see whether they refer to the same instance.
 */
public class CompareString {
    public static void main(String[] args) {
        String first = "first";
        String second = "second";

        String anotherFirst = "first";
        String secondInUpperCase = "SECOND";

        System.out.println(first.equals(second)); // false, the strings have different values
        System.out.println(first.equals(anotherFirst)); // true, the strings have the same value

        System.out.println(second.equals(secondInUpperCase)); // false, the strings have different cases
        System.out.println(second.equalsIgnoreCase(secondInUpperCase)); // true, it ignores cases
        System.out.println(!second.equals(secondInUpperCase)); // true

        System.out.println("**********************************************************");
        String strNull = "null";

        if (strNull.equals("abc")) { // it throws an NPE when strNull = null
            System.out.println("The same");
        }

        System.out.println("*****************************************************************");
        String str = null;

        if ("abc".equals(str)) { // no NPE here
            System.out.println("The same");
        }

        System.out.println("********************************************************************");
        //  if we have two variables of the type String? Any of them may happen to be null.
        //  In this case, we can use the special auxiliary class java.util.Objects.
        // This approach is recommended in modern Java programming since it is easy for reading and does not throw an NPE.
        String s1 = null;
        String s2 = null;

        if (Objects.equals(s1, s2)) { // no NPE here
            System.out.println("Strings are the same");
        }
    }
}
