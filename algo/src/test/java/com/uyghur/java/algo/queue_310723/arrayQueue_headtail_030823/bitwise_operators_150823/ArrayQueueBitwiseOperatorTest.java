package com.uyghur.java.algo.queue_310723.arrayQueue_headtail_030823.bitwise_operators_150823;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

/**
 * This operator is a binary operator, denoted by ‘&.’
 * It returns bit by bit AND of input values, i.e., if both bits are 1, it gives 1, else it shows 0.
 * Divisor, Dividend (2^n - 1, array-length), Quotient and remainder
 */
public class ArrayQueueBitwiseOperatorTest {
    private ArrayQueueBitwiseOperator<Integer> arrayQueueBitwiseOperator;

    @BeforeEach
    public void setUp() {
        arrayQueueBitwiseOperator = new ArrayQueueBitwiseOperator<>(8);
    }

    @Test
    void offerShouldReturnTrue() {
        arrayQueueBitwiseOperator.offer(1);
        arrayQueueBitwiseOperator.offer(2);
        arrayQueueBitwiseOperator.offer(3);
        arrayQueueBitwiseOperator.offer(4);
        arrayQueueBitwiseOperator.offer(5);
        arrayQueueBitwiseOperator.offer(6);
        arrayQueueBitwiseOperator.offer(7);

        assertThat(arrayQueueBitwiseOperator.offer(8)).isTrue();
    }
    @Test
    void offerShouldReturnFalse() {
        arrayQueueBitwiseOperator.offer(1);
        arrayQueueBitwiseOperator.offer(2);
        arrayQueueBitwiseOperator.offer(3);
        arrayQueueBitwiseOperator.offer(4);
        arrayQueueBitwiseOperator.offer(5);
        arrayQueueBitwiseOperator.offer(6);
        arrayQueueBitwiseOperator.offer(7);
        assertThat(arrayQueueBitwiseOperator.offer(8)).isTrue();
        assertThat(arrayQueueBitwiseOperator.offer(9)).isFalse();
    }

    @Test
    void poll() {
        arrayQueueBitwiseOperator.offer(1);
        arrayQueueBitwiseOperator.offer(2);
        arrayQueueBitwiseOperator.offer(3);
        arrayQueueBitwiseOperator.offer(4);
        arrayQueueBitwiseOperator.offer(5);
        arrayQueueBitwiseOperator.offer(6);
        arrayQueueBitwiseOperator.offer(7);
        arrayQueueBitwiseOperator.offer(8);

        assertThat(arrayQueueBitwiseOperator.poll()).isEqualTo(1);
        assertIterableEquals(arrayQueueBitwiseOperator, List.of(2,3,4,5,6,7,8));

    }

    @Test
    void peek() {
        arrayQueueBitwiseOperator.offer(1);
        arrayQueueBitwiseOperator.offer(2);
        arrayQueueBitwiseOperator.offer(3);
        arrayQueueBitwiseOperator.offer(4);
        assertThat(arrayQueueBitwiseOperator.peek()).isEqualTo(1);

    }

    @Test
    void isFullReturnTrue() {
        arrayQueueBitwiseOperator.offer(1);
        arrayQueueBitwiseOperator.offer(2);
        arrayQueueBitwiseOperator.offer(3);
        arrayQueueBitwiseOperator.offer(4);
        arrayQueueBitwiseOperator.offer(5);
        arrayQueueBitwiseOperator.offer(5);
        arrayQueueBitwiseOperator.offer(6);
        arrayQueueBitwiseOperator.offer(7);
        arrayQueueBitwiseOperator.offer(8);

        assertThat(arrayQueueBitwiseOperator.isFull()).isTrue();
    }

    @Test
    void isFullReturnFalse() {
        arrayQueueBitwiseOperator.offer(1);
        arrayQueueBitwiseOperator.offer(2);
        arrayQueueBitwiseOperator.offer(3);
        arrayQueueBitwiseOperator.offer(4);
        arrayQueueBitwiseOperator.offer(5);
        arrayQueueBitwiseOperator.offer(6);
        arrayQueueBitwiseOperator.offer(7);

        assertThat(arrayQueueBitwiseOperator.isFull()).isFalse();
    }

    @Test
    void isEmpty() {
        assertThat(arrayQueueBitwiseOperator.poll()).isNull();
    }

    @Test
    void iterator() {
        arrayQueueBitwiseOperator.offer(1);
        arrayQueueBitwiseOperator.offer(2);
        arrayQueueBitwiseOperator.offer(3);
        arrayQueueBitwiseOperator.offer(4);
        arrayQueueBitwiseOperator.offer(5);

        assertIterableEquals(arrayQueueBitwiseOperator, List.of(1,2,3,4,5));
    }

    @Test
    public void iteratorAllValue() {
        arrayQueueBitwiseOperator.offer(5);
        arrayQueueBitwiseOperator.offer(4);
        arrayQueueBitwiseOperator.offer(3);
        arrayQueueBitwiseOperator.offer(2);
        arrayQueueBitwiseOperator.offer(1);

        for (Integer value : arrayQueueBitwiseOperator) {
            System.out.println(value);
        }
    }

    @Test
    public void testOfBoundary() {
        arrayQueueBitwiseOperator = new ArrayQueueBitwiseOperator<>(8);
        arrayQueueBitwiseOperator.head = 2147483640;
        arrayQueueBitwiseOperator.tail = arrayQueueBitwiseOperator.head;

        for (int i = 0; i < 8; i++) {
            // System.out.println("Tail: " + Integer.toUnsignedLong(arrayQueueHeadTailBoundaryUpdated.tail) + ", index: " + Integer.toUnsignedLong(arrayQueueHeadTailBoundaryUpdated.tail) % 10);
            arrayQueueBitwiseOperator.offer(i);
        }

        for (Integer value : arrayQueueBitwiseOperator) {
            System.out.println(value);
        }
    }

/*      Tail: 2147483640, index: 0
        Tail: 2147483641, index: 1
        Tail: 2147483642, index: 2
        Tail: 2147483643, index: 3
        Tail: 2147483644, index: 4
        Tail: 2147483645, index: 5
        Tail: 2147483646, index: 6
        Tail: 2147483647, index: 7
        Tail: -2147483648, index: -8

       java.lang.ArrayIndexOutOfBoundsException: Index -8 out of bounds for length 10
 */

    @Test
    public void isFullOrNot() {
        int head = 2147483645;
        int tail = Integer.MAX_VALUE ; // 2147483647
        tail += 5;

        System.out.println(tail); // -2147483644

        System.out.println(tail - head); // 7
    }
}
