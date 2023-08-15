package com.uyghur.java.algo.queue_310723.arrayQueue_headtail_030823.bitwise_operators_150823;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class ArrayQueueBitwiseOperatorUpdatedTest {

    private ArrayQueueBitwiseOperatorUpdated<Integer> arrayQueueBitwiseOperatorUpdated;

    @BeforeEach
    void setUp() {
        arrayQueueBitwiseOperatorUpdated = new ArrayQueueBitwiseOperatorUpdated<>(10);
    }

    @Test
    void testTheLengthDoseNotEqualTo2N() {
        System.out.println("Power of 2: " + arrayQueueBitwiseOperatorUpdated.getPowerOf2()); // 4 = > new capacity : 16
    }
    @Test
    void testTheLengthEqualsTo2N() {
        arrayQueueBitwiseOperatorUpdated = new ArrayQueueBitwiseOperatorUpdated<>(32);
        System.out.println("Power of 2: " + arrayQueueBitwiseOperatorUpdated.getPowerOf2()); // 4 = > new capacity : 6
    }
    @Test
    void offerShouldReturnTrue() {
        arrayQueueBitwiseOperatorUpdated.offer(1);
        arrayQueueBitwiseOperatorUpdated.offer(2);
        arrayQueueBitwiseOperatorUpdated.offer(3);
        arrayQueueBitwiseOperatorUpdated.offer(4);
        arrayQueueBitwiseOperatorUpdated.offer(5);
        arrayQueueBitwiseOperatorUpdated.offer(6);
        arrayQueueBitwiseOperatorUpdated.offer(7);

        assertThat(arrayQueueBitwiseOperatorUpdated.offer(8)).isTrue();
    }
    @Test
    void offerShouldReturnFalse() {
        arrayQueueBitwiseOperatorUpdated = new ArrayQueueBitwiseOperatorUpdated<>(8);
        arrayQueueBitwiseOperatorUpdated.offer(1);
        arrayQueueBitwiseOperatorUpdated.offer(2);
        arrayQueueBitwiseOperatorUpdated.offer(3);
        arrayQueueBitwiseOperatorUpdated.offer(4);
        arrayQueueBitwiseOperatorUpdated.offer(5);
        arrayQueueBitwiseOperatorUpdated.offer(6);
        arrayQueueBitwiseOperatorUpdated.offer(7);
        assertThat(arrayQueueBitwiseOperatorUpdated.offer(8)).isTrue();
        assertThat(arrayQueueBitwiseOperatorUpdated.offer(9)).isFalse();
    }

    @Test
    void poll() {
        arrayQueueBitwiseOperatorUpdated.offer(1);
        arrayQueueBitwiseOperatorUpdated.offer(2);
        arrayQueueBitwiseOperatorUpdated.offer(3);
        arrayQueueBitwiseOperatorUpdated.offer(4);
        arrayQueueBitwiseOperatorUpdated.offer(5);
        arrayQueueBitwiseOperatorUpdated.offer(6);
        arrayQueueBitwiseOperatorUpdated.offer(7);
        arrayQueueBitwiseOperatorUpdated.offer(8);

        assertThat(arrayQueueBitwiseOperatorUpdated.poll()).isEqualTo(1);
        assertIterableEquals(arrayQueueBitwiseOperatorUpdated, List.of(2,3,4,5,6,7,8));

    }

    @Test
    void peek() {
        arrayQueueBitwiseOperatorUpdated.offer(1);
        arrayQueueBitwiseOperatorUpdated.offer(2);
        arrayQueueBitwiseOperatorUpdated.offer(3);
        arrayQueueBitwiseOperatorUpdated.offer(4);
        assertThat(arrayQueueBitwiseOperatorUpdated.peek()).isEqualTo(1);

    }

    @Test
    void isFullReturnTrue() {
        arrayQueueBitwiseOperatorUpdated = new ArrayQueueBitwiseOperatorUpdated<>(8);
        arrayQueueBitwiseOperatorUpdated.offer(1);
        arrayQueueBitwiseOperatorUpdated.offer(2);
        arrayQueueBitwiseOperatorUpdated.offer(3);
        arrayQueueBitwiseOperatorUpdated.offer(4);
        arrayQueueBitwiseOperatorUpdated.offer(5);
        arrayQueueBitwiseOperatorUpdated.offer(5);
        arrayQueueBitwiseOperatorUpdated.offer(6);
        arrayQueueBitwiseOperatorUpdated.offer(7);
        arrayQueueBitwiseOperatorUpdated.offer(8);

        assertThat(arrayQueueBitwiseOperatorUpdated.isFull()).isTrue();
    }

    @Test
    void isFullReturnFalse() {
        arrayQueueBitwiseOperatorUpdated.offer(1);
        arrayQueueBitwiseOperatorUpdated.offer(2);
        arrayQueueBitwiseOperatorUpdated.offer(3);
        arrayQueueBitwiseOperatorUpdated.offer(4);
        arrayQueueBitwiseOperatorUpdated.offer(5);
        arrayQueueBitwiseOperatorUpdated.offer(6);
        arrayQueueBitwiseOperatorUpdated.offer(7);

        assertThat(arrayQueueBitwiseOperatorUpdated.isFull()).isFalse();
    }

    @Test
    void isEmpty() {
        assertThat(arrayQueueBitwiseOperatorUpdated.poll()).isNull();
    }

    @Test
    void iterator() {
        arrayQueueBitwiseOperatorUpdated.offer(1);
        arrayQueueBitwiseOperatorUpdated.offer(2);
        arrayQueueBitwiseOperatorUpdated.offer(3);
        arrayQueueBitwiseOperatorUpdated.offer(4);
        arrayQueueBitwiseOperatorUpdated.offer(5);

        assertIterableEquals(arrayQueueBitwiseOperatorUpdated, List.of(1,2,3,4,5));
    }

    @Test
    public void iteratorAllValue() {
        arrayQueueBitwiseOperatorUpdated.offer(5);
        arrayQueueBitwiseOperatorUpdated.offer(4);
        arrayQueueBitwiseOperatorUpdated.offer(3);
        arrayQueueBitwiseOperatorUpdated.offer(2);
        arrayQueueBitwiseOperatorUpdated.offer(1);

        for (Integer value : arrayQueueBitwiseOperatorUpdated) {
            System.out.println(value);
        }
    }

    @Test
    public void testOfBoundary() {
        arrayQueueBitwiseOperatorUpdated = new ArrayQueueBitwiseOperatorUpdated<>(8);
        arrayQueueBitwiseOperatorUpdated.head = 2147483640;
        arrayQueueBitwiseOperatorUpdated.tail = arrayQueueBitwiseOperatorUpdated.head;

        for (int i = 0; i < 8; i++) {
            // System.out.println("Tail: " + Integer.toUnsignedLong(arrayQueueHeadTailBoundaryUpdated.tail) + ", index: " + Integer.toUnsignedLong(arrayQueueHeadTailBoundaryUpdated.tail) % 10);
            arrayQueueBitwiseOperatorUpdated.offer(i);
        }

        for (Integer value : arrayQueueBitwiseOperatorUpdated) {
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