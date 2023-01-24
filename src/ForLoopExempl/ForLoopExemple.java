package ForLoopExempl;

/**
 * The result is stored in the accumulator variable.
 * sum(the sum of integer numbers in the range from start to end (inclusively)) and multiplication(the multiplication of integer numbers in this range)
 */
public class ForLoopExemple {
    public static void main(String[] args) {
        int start = 1;
        int end = 8;
        int accumulator = 0;
        int multi = 1;

        for (int i = start; i <= end; i++) {
            accumulator += i;
        }

        System.out.println("Sum of numbers = " + accumulator);

        for (int i = start; i <= end; i++) {
            multi *= i;
        }

        System.out.println("Multi of numbers = " + multi);
    }
}
