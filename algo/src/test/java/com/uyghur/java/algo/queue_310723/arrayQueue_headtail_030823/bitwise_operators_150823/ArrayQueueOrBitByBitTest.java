package com.uyghur.java.algo.queue_310723.arrayQueue_headtail_030823.bitwise_operators_150823;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ArrayQueueOrBitByBitTest {
    private ArrayQueueOrBitByBit<Integer> arrayQueueOrBitByBit;
    @BeforeEach
    void setUp() {
        arrayQueueOrBitByBit = new ArrayQueueOrBitByBit<>(9);
    }

    @Test
    void offerShouldReturnTrue() {
        arrayQueueOrBitByBit.offer(1);
        arrayQueueOrBitByBit.offer(2);
        arrayQueueOrBitByBit.offer(3);
        arrayQueueOrBitByBit.offer(4);
        arrayQueueOrBitByBit.offer(5);
        arrayQueueOrBitByBit.offer(6);
        arrayQueueOrBitByBit.offer(7);

        assertThat(arrayQueueOrBitByBit.offer(8)).isTrue();
    }
    @Test
    void offerShouldReturnFalse() {
        arrayQueueOrBitByBit = new ArrayQueueOrBitByBit<>(8);
        arrayQueueOrBitByBit.offer(1);
        arrayQueueOrBitByBit.offer(2);
        arrayQueueOrBitByBit.offer(3);
        arrayQueueOrBitByBit.offer(4);
        arrayQueueOrBitByBit.offer(5);
        arrayQueueOrBitByBit.offer(6);
        arrayQueueOrBitByBit.offer(7);
        assertThat(arrayQueueOrBitByBit.offer(8)).isTrue();
        assertThat(arrayQueueOrBitByBit.offer(9)).isFalse();
    }

    @Test
    void poll() {
        arrayQueueOrBitByBit.offer(1);
        arrayQueueOrBitByBit.offer(2);
        arrayQueueOrBitByBit.offer(3);
        arrayQueueOrBitByBit.offer(4);
        arrayQueueOrBitByBit.offer(5);
        arrayQueueOrBitByBit.offer(6);
        arrayQueueOrBitByBit.offer(7);
        arrayQueueOrBitByBit.offer(8);

        assertThat(arrayQueueOrBitByBit.poll()).isEqualTo(1);
        assertIterableEquals(arrayQueueOrBitByBit, List.of(2,3,4,5,6,7,8));

    }

    @Test
    void peek() {
        arrayQueueOrBitByBit.offer(1);
        arrayQueueOrBitByBit.offer(2);
        arrayQueueOrBitByBit.offer(3);
        arrayQueueOrBitByBit.offer(4);
        assertThat(arrayQueueOrBitByBit.peek()).isEqualTo(1);

    }

    @Test
    void isFullReturnTrue() {
        arrayQueueOrBitByBit = new ArrayQueueOrBitByBit<>(8);
        arrayQueueOrBitByBit.offer(1);
        arrayQueueOrBitByBit.offer(2);
        arrayQueueOrBitByBit.offer(3);
        arrayQueueOrBitByBit.offer(4);
        arrayQueueOrBitByBit.offer(5);
        arrayQueueOrBitByBit.offer(5);
        arrayQueueOrBitByBit.offer(6);
        arrayQueueOrBitByBit.offer(7);
        arrayQueueOrBitByBit.offer(8);

        assertThat(arrayQueueOrBitByBit.isFull()).isTrue();
    }

    @Test
    void isFullReturnFalse() {
        arrayQueueOrBitByBit.offer(1);
        arrayQueueOrBitByBit.offer(2);
        arrayQueueOrBitByBit.offer(3);
        arrayQueueOrBitByBit.offer(4);
        arrayQueueOrBitByBit.offer(5);
        arrayQueueOrBitByBit.offer(6);
        arrayQueueOrBitByBit.offer(7);

        assertThat(arrayQueueOrBitByBit.isFull()).isFalse();
    }

    @Test
    void isEmpty() {
        assertThat(arrayQueueOrBitByBit.poll()).isNull();
    }

    @Test
    void iterator() {
        arrayQueueOrBitByBit.offer(1);
        arrayQueueOrBitByBit.offer(2);
        arrayQueueOrBitByBit.offer(3);
        arrayQueueOrBitByBit.offer(4);
        arrayQueueOrBitByBit.offer(5);

        assertIterableEquals(arrayQueueOrBitByBit, List.of(1,2,3,4,5));
    }

    @Test
    public void iteratorAllValue() {
        arrayQueueOrBitByBit.offer(5);
        arrayQueueOrBitByBit.offer(4);
        arrayQueueOrBitByBit.offer(3);
        arrayQueueOrBitByBit.offer(2);
        arrayQueueOrBitByBit.offer(1);

        for (Integer value : arrayQueueOrBitByBit) {
            System.out.println(value);
        }
    }

    @Test
    public void testOfBoundary() {
        arrayQueueOrBitByBit = new ArrayQueueOrBitByBit<>(8);
        arrayQueueOrBitByBit.head = 2147483640;
        arrayQueueOrBitByBit.tail = arrayQueueOrBitByBit.head;

        for (int i = 0; i < 8; i++) {
            // System.out.println("Tail: " + Integer.toUnsignedLong(arrayQueueHeadTailBoundaryUpdated.tail) + ", index: " + Integer.toUnsignedLong(arrayQueueHeadTailBoundaryUpdated.tail) % 10);
            arrayQueueOrBitByBit.offer(i);
        }

        for (Integer value : arrayQueueOrBitByBit) {
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