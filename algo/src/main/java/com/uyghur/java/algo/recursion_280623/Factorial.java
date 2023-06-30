package com.uyghur.java.algo.recursion_280623;

/**
 * n! = n * (n-1) ... 1
 * 0! = 1
 */
public class Factorial {

    public int function(int n) {
        if (n < 0) {
            throw new RuntimeException("n should be positive number");
        }
        if (n == 1 || n == 0) {
            return 1;
        }

        return n * function(n-1);
    }

}
