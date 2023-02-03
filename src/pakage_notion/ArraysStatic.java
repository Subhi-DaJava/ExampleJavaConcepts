package pakage_notion;
/**
 * Default Package
 * If we do not write a package statement before defining our class, it will be placed inside the default package.
 * This package has a big disadvantage — classes located here can't be imported to classes located inside named packages.
 *
 * Do not use the default package for real applications.
 * It is perfectly fine for simple, educational applications, like "Hello world", but more complex projects will be better in named packages.
 */

import static java.util.Arrays.*; // instead of the statement "import java.util.Arrays;"
public class ArraysStatic {
    public static void main(String[] args) {
        int[] numbers = { 10, 4, 5, 47, 5, 12 }; // an array

        sort(numbers); // instead of writing Arrays.sort(...)

        int[] copy = copyOf(numbers, numbers.length); // instead of writing Arrays.copyOf(...)
    }
    /**
     * org.demo.A
     * org.demo.B
     * org.demo.mypackage1.C
     * org.demo.mypackage2.D
     *
     * Select all classes that are accessible in the class "org.demo.A" by their short names without writing any imports.
     *
     * java.util.Scanner
     *
     * org.demo.mypackage2.D
     *
     * org.demo.B
     *
     * org.demo.mypackage1.C
     *
     * java.lang.String
     *
     * org.demo.A
     *
     * answer: String, A, B
     */
}
