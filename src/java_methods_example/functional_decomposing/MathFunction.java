package java_methods_example.functional_decomposing;

import java.util.Scanner;

/**
 * f(x) = x² + 1 if x <= 0, = 1 / x² if 0 < x < 1, = x² - 1 if x >= 1
 */
public class MathFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your number:");
        double x = scanner.nextDouble(); // 0,5 -> 4.0
        System.out.println(f(x));
    }

    public static double f(double x) {
        //call your implemented methods here.
        if (x <= 0) {
            return f1(x);
        } else if (x < 1) {
            return f2(x);
        } else {
            return f3(x);
        }
    }


    //implement your methods here
    public static double f1(double x) {
        return x * x + 1;
    }

    public static double f2(double x) {
        return 1 / (x * x);
    }

    public static double f3(double x) {
        return x * x - 1;
    }
}
