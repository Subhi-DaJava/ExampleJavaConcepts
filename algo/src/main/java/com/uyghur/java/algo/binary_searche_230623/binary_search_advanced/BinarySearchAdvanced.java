package com.uyghur.java.algo.binary_searche_230623.binary_search_advanced;

/**
 * Steps:
 * Array (ordered or sorted)  a1 <= a2 <= a3 .....
 * Search target -> return index
 * 1. index: begin -> i = 0, end -> j = Array.length - 1
 * 2. i > j, stop
 * 3. Am -> middle = (i+j)/2 (i +j) >>> 1
 * 6. target = Am
 * 7. return -1, no target
 */
public class BinarySearchAdvanced {

    public int solution(int[] arr, int target) {

        int i = 0, j = arr.length;

        while (1 < j - i) {
            //int middle = (i + j) / 2;
            int middle = (i + j) >>> 1; // Integer.MaxValue + 100 = -521321212 Décalage à droite non signé / Unsigned right shift

            if (target < arr[middle]) {
                j = middle;
            } else {
                i = middle;
            }
        }

        if (arr[i] == target) {
            return i;
        } else {
            return -1;
        }

    }
}
