package com.uyghur.java.algo.recursion_280623;

/**
 * Array should be sorted.
 */
public class BinarySearchWithRecursion {
    public int search(int[] arr, int target) {
        return binarySearch(arr, target, 0, arr.length - 1);
    }

    private static int binarySearch(int[] arr, int target, int low, int high) {
        int m = (low + high) >>> 1;

        if (low > high) {
            return -1;
        }
        if (target < arr[m]) {
            return binarySearch(arr, target, low, m - 1);
        } else if (arr[m] < target) {
            return binarySearch(arr, target, m + 1, high);
        } else {
            return m;
        }
    }
}
