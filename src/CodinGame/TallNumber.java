package CodinGame;

import java.util.Scanner;

public class TallNumber {
    // Program must output true if the given number n is a tall number or false if n is not a tall number
    // A tall number is a number for which every digit is bigger than or equal to the digit on its left
    // Example: 123 is a tall number. Note : The left-most digit can always be considered to be a 0.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean tallNumber = false;
        int temps = 0;
        System.out.println("Please enter an Integer ");

        int number = in.nextInt();
        String temp = Integer.toString(number);
        int[] numbers = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            numbers[i] = temp.charAt(i) - '0';
            if(temps < numbers[i]) {
                tallNumber = true;
                temps = numbers[i];
            }
            else {
                tallNumber = false;
            }
        }
       /* for (int i : numbers) {
            System.out.print(i +  " ");
        }*/

        System.out.println(tallNumber);
    }
}
