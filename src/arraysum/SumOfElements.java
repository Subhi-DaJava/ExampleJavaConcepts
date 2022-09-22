package arraysum;

import java.util.Arrays;

public class SumOfElements {
    public static void main(String[] args) {
        System.out.println("For Loop");
        int arr[] = new int[]{12, 34, 45, 21, 33, 4};
        int sumForLoop = 0;
        int sumForEachLoop = 0;

        for (int i = 0; i < arr.length; i++) {
            sumForLoop += arr[i];
        }
        System.out.println("Array Sum = " + sumForLoop);

        System.out.println("For Each Loop");
        for (int elt : arr) {
            sumForEachLoop += elt;
        }
        System.out.println("Array Sum = " + sumForEachLoop);

        System.out.println("Java Stream Reduce");
        int sumJavaStreamReduce = Arrays.stream(arr).parallel().reduce(0,(a, b)->  a + b);
        System.out.println("Array Sum = " + sumJavaStreamReduce);

        System.out.println("Reduce");
        int sumReduce = Arrays.stream(arr).reduce(0,(a,b)->  a + b);
        System.out.println("Array Sum = " + sumReduce);

        System.out.println("Stream Sum");
        int sumStreamSum = Arrays.stream(arr).sum();
        System.out.println("Array Sum = " + sumStreamSum);

    }
}
