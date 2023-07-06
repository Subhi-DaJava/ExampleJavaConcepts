package com.uyghur.java.algo.multi_recursion_300623;

/**
 * suppose that initially we have a pair of rabbits (one male and one female) in a population.
 * Rabbits breed when each pair of rabbits reaches breeding age (usually after two months, starting at 3 months)
 * and produces a new pair of rabbits. New rabbits also take two months to reach breeding age.
 * The question is how many pairs of rabbits there will be after n months,
 * using the breeding rules described above.
 * <p>
 * 1st month 1  pair
 * 2nd month 1  pair
 * 3rd month 2  pair
 * 4th month 3  pair
 * 5th month 5  pair
 * 6th month 8  pair
 * 7th month 13 pair
 */
public class FibonacciRabbit {

    public int rabbitNumber(int n) {

        if (n == 1) {
            return 1;
        }

        if (n == 0) {
            return 0;
        }

        return rabbitNumber(n - 1) + rabbitNumber(n - 2);
    }

}
