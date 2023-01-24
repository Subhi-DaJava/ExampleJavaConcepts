package switchCase;

import java.util.Scanner;

public class Shapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose a number between 1 and 4: ");
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("You have chosen a square");
                break;
            case 2:
                System.out.println("You have chosen a circle");
                break;
            case 3:
                System.out.println("You have chosen a triangle");
                break;
            case 4:
                System.out.println("You have chosen a rhombus");
                break;
            default:
                System.out.println("There is no such shape!");
                break;
        }
    }
}
