package arithmetic_number_format_exceptions;

import java.util.Scanner;

/**
 * The program that reads numbers and performs some calculations. It outputs the result to the standard output.
 * input : 6 5 2 0
 * output : Division by zero!
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        if (b + c == 0 || d == 0) {
            System.out.println("Division by zero!");
            return;
        }
        int result = a / ((b + c) / d);

        System.out.println(result);
    }
}
