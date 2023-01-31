package arithmetic_number_format_exceptions;

import java.util.Scanner;

/**
 * Some errors in your code do not prevent the program from running. In this case,
 * the program will only crash while trying to execute a "broken" line: a line with an error called an exception.
 * Thus, exceptions are the errors detected during the program execution (at runtime),
 * whereas syntax errors are those detected during compiling the program into byte-code.
 * An exception interrupts the normal execution of a program.
 */
public class ArithmeticNumberFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b == 0) {
            System.out.println("Division by zero!");
        } else {
            System.out.println(a / b);
        }
        System.out.println("finished");

        System.out.println("**************************************************");

        Scanner scannerF = new Scanner(System.in);
        String input = scannerF.nextLine();

        int number = Integer.parseInt(input); // an exception is possible here!
        System.out.println(number + 1);

        System.out.println("***********************************************************");
        Scanner scannerR = new Scanner(System.in);
        String inputR = scannerR.nextLine();

        if (inputR.matches("\\d+")) { // it checks if the input line contains only digits
            int numberR = Integer.parseInt(input);
            System.out.println(numberR + 1);
        } else {
            System.out.println("Incorrect number: " + inputR);
        }
    }

}
