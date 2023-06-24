package com.uyghur.java.algo.binary_searche_230623.right_most;

/**
 * Steps:
 * Array (ordered or sorted)  a1 <= a2 <= a3 .....
 * Search target -> return index
 * 1. index: begin -> i = 0, end -> j = Array.length - 1
 * 2. i > j, stop
 * 3. Am -> middle = (i+j)/2 (i +j) >>> 1
 * 4. if target < Am -> j -> middle - 1
 * 5. if target > Am -> i -> middle + 1
 * 6. target = Am, stop
 * 7. return -1, no target
 */

public class BinarySearchRightMost {

    public int solution(int[] arr, int target) {

        int i = 0, j = arr.length - 1;
        int candidat = -1;

        while (i <= j) {

            //int middle = (i + j) / 2;
            int middle = (i + j) >>> 1; // Integer.MaxValue + 100 = -521321212 Décalage à droite non signé / Unsigned right shift

            if (target < arr[middle]) {
                j = middle - 1;
            } else if (arr[middle] < target) {
                i = middle + 1;
            } else {
                candidat = middle;
                i = middle + 1;
            }
        }

        return candidat;
    }

}
