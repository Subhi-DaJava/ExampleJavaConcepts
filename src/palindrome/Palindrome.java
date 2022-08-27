package palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int temp = number;
        int r, sum = 0;
        while ( temp > 0) { // calculate several times
             r= temp % 10;
            sum = (sum * 10) + r;
            temp = temp / 10;
        }
        if(sum == number) {
            System.out.println("This number : " + number + " is palindrome number.");
        }
        else {
            System.out.println("This number : " + number + " is not palindrome number.");
        }
    }
}
