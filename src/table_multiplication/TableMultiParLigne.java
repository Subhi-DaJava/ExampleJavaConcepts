package table_multiplication;

import java.util.Scanner;

public class TableMultiParLigne {
    public static void main(String[] args) {
        Scanner enterNum = new Scanner(System.in);
        System.out.println("Please enter a number for Multiplication: ");
        int num = enterNum.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < num; j++) {
                System.out.print(i + " x " + j + " = " + (i * j) + "    "); // i x j = i*j
            }
            System.out.println();
        }
    }

}
