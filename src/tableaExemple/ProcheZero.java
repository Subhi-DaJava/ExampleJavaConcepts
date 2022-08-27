package tableaExemple;

import java.util.Arrays;

import static java.lang.Math.abs;
import static java.lang.Math.max;

public class ProcheZero {
    public static void main(String[] args) {
        int[] ints = new int[10];
        double[] arr = new double[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 10 - 6;
        }
        for (int i = 0; i < 10; i++) {
            ints[i] = (int) (Math.random()*(10) - 5);
        }
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + "    ");
        }

        System.out.println();
        System.out.println("************************************************ sort ********************************************");
        Arrays.sort(ints);

        int num = ints[0];
        int closeToZero = 0;

        for (int i = 0; i < ints.length; i++) {

            // for négative
            if(ints[i] < closeToZero && ints[i] > num){
                num = ints[i];
            }

            // for positive
            if(ints[i] > closeToZero && -num >= ints[i]){
                num = ints[i];
            }
        }

        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + "    ");
        }

        System.out.println();
        System.out.println("Le nombre est plus proche du zéro : " + num);
        System.out.println("***************************************** stream **********************************");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "    ");
        }
        System.out.println();

        System.out.print("Le nombre est plus proche du zéro : ");
        Arrays.stream(arr).filter(i -> i != 0)
                .reduce((a, b) -> abs(a) < abs(b) ? a : (abs(a) == abs(b) ? max(a, b) : b))
                .ifPresent(System.out::println);

    }

}
