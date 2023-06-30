package com.uyghur.java.algo.recursion_280623;

/**
 * arr -> 3 2 4 1 5 6
 * iteration 1: 2 3 1 4 5 6
 * iteration 2: 2 1 3 4 5 6
 * iteration 3: 1 2 3 4 5 6
 */
public class BubbleSort {

    public void sortWithoutRecursion(int[] arr) {
        if (arr.length == 1 || arr.length == 0) {
            return;
        }

        bubbleWithoutRecursion(arr, arr.length - 1);
    }

    private void bubbleWithoutRecursion(int[] arr, int high) {
        for (int i = 0; i < high; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }

    public void sortWithRecursion(int[] arr) {
        if (arr.length == 1 || arr.length == 0) {
            return;
        }

        bubbleWithRecursion(arr, arr.length - 1);
    }

    private void bubbleWithRecursion(int[] arr, int high) {
        if (high == 0) {
            return;
        }
        for (int i = 0; i < high; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        bubbleWithRecursion(arr, high - 1);
    }

    public void sortWithRecursionUpdated(int[] arr) {
        if (arr.length == 1 || arr.length == 0) {
            return;
        }

        bubbleWithRecursionUpdated(arr, arr.length - 1);
    }

    /**
     * Input :
     *      [8,71,21,5,11,9,13,76,99,102,147]
     *      i leftmost index, high rightmost index, index last replaced index
     *      After exchanging values with the nearest index, then the index variable is updated to the current index. index is rightmost index
     * Output :
     *      5,8,9,11,13, 21, 71, 76, 99, 102, 147
     * @param arr Array not sorting
     * @param high rightmost index
     */
    private void bubbleWithRecursionUpdated(int[] arr, int high) {
        if (high == 0) {
            return;
        }
        int index = 0;
        for (int i = 0; i < high; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                index = i;
            }
        }
        bubbleWithRecursionUpdated(arr, index);
    }
}
