package com.uyghur.java.algo.multi_recursion_300623;

import java.util.Arrays;

/**
 * Memorization
 * Array : 0 1 1 2 3 5 8 13 21 34 55 89 144 233
 * find the number of the given index
 * index == 0 -> 0
 * index == 1 -> 1
 * else return the value of the index
 *                  f(3) = 2
 *                  /     \
 *                 /       \
 *               f(2) = 1      f(1) = 1
 *               / \
 *              /   \
 *           f(1) = 1  f(0) = 0
 *  Big (O), time complexity :
 *   f(0) = 1 time
 *   f(1) = 1 time
 *   f(2) = 2 times
 *   f(3) = 5 times
 *   f(4) = 9 times
 *   f(5) = 15 times
 *   2 * f(n+1) -1 times -> 2 * f(6 + 1) - 1 = 2 * f(7) + 1 = 2 * 13 - 1 = 25 times
 *  ~ zita(1.618)^n
 * */
public class FibonacciUpdated {

    public int fibonacci(int index) {
        int [] cache = new int[index + 1];
        Arrays.fill(cache, -1); // [-1, -1, -1, -1, -1, -1] for 5
        cache[0] = 0;
        cache[1] = 1; // [0, 1, -1, -1, -1, -1]

        return findNumberWithIndex(index, cache);
    }

    // Time Complexity BigO(N) and Space Complexity BigO(N)
    private int findNumberWithIndex(int index, int[] cache) {

        if(cache[index] != -1) {
            return cache[index];
        }
        int index_1 = findNumberWithIndex(index - 1, cache);
        int index_2 = + findNumberWithIndex(index - 2, cache);
        cache[index] = index_1 + index_2;

        return cache[index]; // [0, 1, 1, 2, cache[index], -1], when index = 4
    }


    // Time Complexity zita(1.618^n)
    public int fibonacciOriginal(int index) {
        if (index == 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }

        return fibonacciOriginal(index - 1) + fibonacciOriginal(index - 2);
    }
}
