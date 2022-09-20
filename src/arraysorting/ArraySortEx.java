package arraysorting;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortEx {
    public static void main(String[] args) {
        int[] myArr = {21,0,56,3,14,38,42,19};
        System.out.println("Before sorting : " + Arrays.toString(myArr));

        System.out.println("********************** Sort Integer Array *********************");
        Arrays.sort(myArr);
        System.out.println("After soring: " +Arrays.toString(myArr));

        System.out.println("********************* String array *****************************");
        String[] strArr = {"B", "F", "G", "A", "C", "X", "O"};
        System.out.println("Before sorting : " + Arrays.toString(strArr));

        System.out.println("*********************** Sort String Array **********************************");
        Arrays.sort(strArr); //Ascending order
        System.out.println("After sorting : " + Arrays.toString(strArr));

        System.out.println("***************************** Soring by Descending order *********************************");
        Arrays.sort(strArr, Comparator.reverseOrder()); // Descending order
        System.out.println("After sorting : " + Arrays.toString(strArr));

        System.out.println("******************************* Sort Object ************************************");
        Person[] people = {
                new Person(10, 35,"Memet"),
                new Person(9, 32,"Memet"),
                new Person(6, 18,"Memet"),
                new Person(16, 22,"Memet"),
        };
        System.out.println("Before sorting : " + Arrays.toString(people));

        System.out.println("***************************** Sorting by Age **************************");
        Arrays.sort(people);
        System.out.println("After sorting by age : " + Arrays.toString(people));
        System.out.println();
        for (Person person : people) {
            System.out.println(person);
        }

    }
}
