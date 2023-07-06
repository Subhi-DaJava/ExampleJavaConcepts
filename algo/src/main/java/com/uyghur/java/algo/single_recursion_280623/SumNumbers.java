package com.uyghur.java.algo.single_recursion_280623;

/**
 * f(n) = n + n-1 + ... + 1
 * StackOverFlowError
 * Two solution with Scala or Loop
 */
public class SumNumbers {
    public long sum(long n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public long sumUpdated(long n) {
        long accumulator = 0;
        return sumOptimized(n, accumulator);
    }

    private long sumOptimized(long n, long accumulator) {
        if (n == 1) {
            return 1 + accumulator;
        }
        return sumOptimized(n - 1, n + accumulator);
    }

    // with loop

    public long sumOfNNumbers(long n) {
        long sum = 0;

        for (long i = n; i >= 1; i--) {
            sum += i;
        }

        return sum;
    }
}
