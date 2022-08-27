package tableau_verifier_presence;

import java.util.Arrays;
import java.util.List;

/**
 * la solution utilise l'api j2se pour effectuer la recherche dichotomique
 */
public class MainCLass {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        int[] ints = {-9, 14, 37, 102};
        System.out.println("****************************** simple for **********************************");
        System.out.println(ClassA.exists(ints,102));
        System.out.println("1: " + (System.currentTimeMillis() - time));
        System.out.println(ClassA.exists(ints,33));
        System.out.println("2: " + (System.currentTimeMillis() - time));

        System.out.println("****************************** for loop **********************************");
        System.out.println(ClassA.checkWithForLoop(ints,14));
        System.out.println("3: " + (System.currentTimeMillis() - time));
        System.out.println(ClassA.checkWithForLoop(ints,32));
        System.out.println("4: " + (System.currentTimeMillis() - time));

        System.out.println("*********************************** stream *****************************************");
        System.out.println(ClassA.checkWithStream(ints,12));
        System.out.println("5: " + (System.currentTimeMillis() - time));
        System.out.println(ClassA.checkWithStream(ints,-9));
        System.out.println("6: " + (System.currentTimeMillis() - time));

        System.out.println("*********************************** Arrays Binary Search *****************************************");
        Integer[] integers = {-9, 14, 37, 102};
        List<Integer> l = Arrays.asList(integers);
        System.out.println(ClassA.checkWithArrayLists(l,12));
        System.out.println("7: " + (System.currentTimeMillis() - time));
        System.out.println(ClassA.checkWithArrayLists(l,-9));
        System.out.println("8: " + (System.currentTimeMillis() - time));
    }
}
