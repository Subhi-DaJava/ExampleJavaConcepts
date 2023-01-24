package while_scanner.hasNext;

import java.util.Scanner;

/**
 * The program gets a sequence of non-negative integers; each integer is written on a separate line.
 * The sequence ends with an integer 0; when the program reads 0, it should end its work and output the length of the sequence (not counting the final 0).
 * Don’t read numbers following the number 0.
 */
public class CountNotAfterZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int number = scanner.nextInt();
        while (number != 0) {
            number = scanner.nextInt(); // 1 2 5 6 0 7 8 5 -> count = 4
            count++;
        }
        System.out.println(count);
    }
}
