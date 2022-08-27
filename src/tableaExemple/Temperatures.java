package tableaExemple;

import java.util.Arrays;
import java.util.Scanner;

public class Temperatures {

        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number (Integer) :");
            int N = in.nextInt();
            int min = 0 ;

            while ( N < 0  ){
                System.out.println("N should be greater than 0 or equal to 0 and must be integer, please reenter :");
                N = in.nextInt();
            }
            int[] temps = new int[N];
            System.err.println("Declare un Array");

            for (int i = 0; i < N; i++) {
                System.out.println("The number " + (i+1) + " :");
                int t = in.nextInt();
                temps[i] = t;
            }

            if( N != 0 ) {
                Arrays.sort(temps);
                min = temps[0];
                System.err.println("The Array is sorted.");
                System.out.print("The array after sorting : " );
                for (int i : temps) {
                    System.out.print( i + " ");
                }
            }

            System.out.println();

            for(int i = 0; i < temps.length; i++) {

                if(temps[i] < 0 && temps[i] > min) {
                    System.err.println("Check the negative number");
                    min = temps[i];
                }
                if(temps[i] > 0 && (-1 * min) >= temps[i] ){
                    System.err.println("Check the positive number");
                    min = temps[i];

                }

            }
            if(temps.length == 0) {
                System.out.println("No temperature");
            } else {
                System.out.println("The close to zero is " + min);
            }

        }

}
