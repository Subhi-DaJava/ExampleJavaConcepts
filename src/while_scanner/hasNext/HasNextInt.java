package while_scanner.hasNext;

import java.util.Scanner;
/**
 The method returns true if the next element is an integer number and false otherwise.
 */
public class HasNextInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (scanner.hasNextInt()) { // 1 2 3 k -> result 6
            int elem = scanner.nextInt();
            sum += elem;
        }

        System.out.println(sum);
    }
}
