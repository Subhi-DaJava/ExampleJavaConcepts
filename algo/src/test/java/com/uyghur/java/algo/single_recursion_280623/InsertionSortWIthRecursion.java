package com.uyghur.java.algo.single_recursion_280623;

/**
 * input : [9, 13, 71, 76, 8, 21, 5, 11]  index : 0, 1, 2, 3 sorted, index: 4, 5, 6, 7 not sorted yet; index 4 is start point
 */
public class InsertionSortWIthRecursion {

    public void sort(int[] arr) {
        if (arr.length == 0) {
            throw new RuntimeException("Array should not be empty");
        }
        insertionRecursion(arr, 1);
    }

    private void insertionRecursion(int[] arr, int low) {

        if (low == arr.length) {
            return;
        }

        int temp = arr[low];
        int i = low - 1;

        while (i >= 0 && arr[i] > temp) { // no place to insert
            arr[i + 1] = arr[i];
            i--;
        }
        arr[i + 1] = temp;

        insertionRecursion(arr, low + 1);
    }

    public void sortUpdated(int[] arr) {
        if (arr.length == 0) {
            throw new RuntimeException("Array should not be empty");
        }
        insertionRecursionUpdated(arr, 1);
    }

    // [9, 13, 71, 76, 8, 21, 5, 11]
    private void insertionRecursionUpdated(int[] arr, int low) {

        if (low == arr.length) {
            return;
        }

        int temp = arr[low];
        int i = low - 1;

        while (i >= 0 && arr[i] > temp) { // no place to insert
            arr[i + 1] = arr[i];
            i--;
        }

        if (i + 1 != low) {
            arr[i + 1] = temp;
        }

        insertionRecursionUpdated(arr, low + 1);
    }


    public void sortBadPractice(int[] arr) {
        if (arr.length == 0) {
            throw new RuntimeException("Array should not be empty");
        }
        insertionRecursionBadPractice(arr, 1);
    }

    private void insertionRecursionBadPractice(int[] arr, int low) {

        if (low == arr.length) {
            return;
        }

        int i = low - 1;

        while (i >= 0 && arr[i] > arr[i + 1]) { // no place to insert
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
            i--;
        }

        insertionRecursionBadPractice(arr, low + 1);
    }

}
