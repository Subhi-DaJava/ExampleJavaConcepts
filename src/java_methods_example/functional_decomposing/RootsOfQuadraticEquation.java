package java_methods_example.functional_decomposing;

import java.util.Scanner;

/**
 * a simple program for calculating the real roots of a quadratic equation : the equation is ax^2 + bx + c = 0
 */
public class RootsOfQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt(); // 2 6 8 no real roots, 4 6 8 no real roots, 1 4 4: x = -2.0, 1 8 16: x=-4.0,1 -12 20: x1 = 10.0 x2 = 2.0

        double discriminant = calculateDiscriminant(a, b, c);

        if (discriminant < 0) {
            System.out.println("No real roots!");
        } else {
            calculateRoots(a, b, discriminant);
        }
    }
    /**
     * Method original
     */
    public static void findRoots(double a, double b, double c) {
        // the equation is ax^2 + bx + c = 0
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("No real roots!");
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            double x1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            double x2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }

    // decomposing this code and creating additional methods

    // 1. discriminant
    public static double calculateDiscriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    // 2. calcul of roots
    public static void calculateRoots(double a, double b, double discriminant) {
        double x1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
        double x2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
        if (x1 == x2) {
            System.out.println("x = " + x1);
        } else {
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }

}
