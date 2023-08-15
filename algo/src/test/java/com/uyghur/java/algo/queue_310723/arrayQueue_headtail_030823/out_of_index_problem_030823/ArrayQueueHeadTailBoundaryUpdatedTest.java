package com.uyghur.java.algo.queue_310723.arrayQueue_headtail_030823.out_of_index_problem_030823;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ArrayQueueHeadTailBoundaryUpdatedTest {

    private ArrayQueueHeadTailBoundaryUpdated<Integer> arrayQueueHeadTailBoundaryUpdated;

    @BeforeEach
    public void setUp() {
        arrayQueueHeadTailBoundaryUpdated = new ArrayQueueHeadTailBoundaryUpdated<>(5);
    }

    @Test
    void offerShouldReturnTrue() {
        arrayQueueHeadTailBoundaryUpdated.offer(1);
        arrayQueueHeadTailBoundaryUpdated.offer(2);
        arrayQueueHeadTailBoundaryUpdated.offer(3);
        arrayQueueHeadTailBoundaryUpdated.offer(4);
        assertThat(arrayQueueHeadTailBoundaryUpdated.offer(5)).isTrue();
    }
    @Test
    void offerShouldReturnFalse() {
        arrayQueueHeadTailBoundaryUpdated.offer(1);
        arrayQueueHeadTailBoundaryUpdated.offer(2);
        arrayQueueHeadTailBoundaryUpdated.offer(3);
        arrayQueueHeadTailBoundaryUpdated.offer(4);
        assertThat(arrayQueueHeadTailBoundaryUpdated.offer(5)).isTrue();
        assertThat(arrayQueueHeadTailBoundaryUpdated.offer(5)).isFalse();
    }

    @Test
    void poll() {
        arrayQueueHeadTailBoundaryUpdated.offer(1);
        arrayQueueHeadTailBoundaryUpdated.offer(2);
        arrayQueueHeadTailBoundaryUpdated.offer(3);
        arrayQueueHeadTailBoundaryUpdated.offer(4);

        assertThat(arrayQueueHeadTailBoundaryUpdated.poll()).isEqualTo(1);
        assertIterableEquals(arrayQueueHeadTailBoundaryUpdated, List.of(2,3,4));

    }

    @Test
    void peek() {
        arrayQueueHeadTailBoundaryUpdated.offer(1);
        arrayQueueHeadTailBoundaryUpdated.offer(2);
        arrayQueueHeadTailBoundaryUpdated.offer(3);
        arrayQueueHeadTailBoundaryUpdated.offer(4);
        assertThat(arrayQueueHeadTailBoundaryUpdated.peek()).isEqualTo(1);

    }

    @Test
    void isFullReturnTrue() {
        arrayQueueHeadTailBoundaryUpdated.offer(1);
        arrayQueueHeadTailBoundaryUpdated.offer(2);
        arrayQueueHeadTailBoundaryUpdated.offer(3);
        arrayQueueHeadTailBoundaryUpdated.offer(4);
        arrayQueueHeadTailBoundaryUpdated.offer(5);

        assertThat(arrayQueueHeadTailBoundaryUpdated.isFull()).isTrue();
    }

    @Test
    void isFullReturnFalse() {
        arrayQueueHeadTailBoundaryUpdated.offer(1);
        arrayQueueHeadTailBoundaryUpdated.offer(2);
        arrayQueueHeadTailBoundaryUpdated.offer(3);
        arrayQueueHeadTailBoundaryUpdated.offer(4);

        assertThat(arrayQueueHeadTailBoundaryUpdated.isFull()).isFalse();
    }
    @Test
    void isEmpty() {
        assertThat(arrayQueueHeadTailBoundaryUpdated.poll()).isNull();
    }

    @Test
    void iterator() {
        arrayQueueHeadTailBoundaryUpdated.offer(1);
        arrayQueueHeadTailBoundaryUpdated.offer(2);
        arrayQueueHeadTailBoundaryUpdated.offer(3);
        arrayQueueHeadTailBoundaryUpdated.offer(4);
        arrayQueueHeadTailBoundaryUpdated.offer(5);

        assertIterableEquals(arrayQueueHeadTailBoundaryUpdated, List.of(1,2,3,4,5));
    }

    @Test
    public void iteratorAllValue() {
        arrayQueueHeadTailBoundaryUpdated.offer(5);
        arrayQueueHeadTailBoundaryUpdated.offer(4);
        arrayQueueHeadTailBoundaryUpdated.offer(3);
        arrayQueueHeadTailBoundaryUpdated.offer(2);
        arrayQueueHeadTailBoundaryUpdated.offer(1);

        for (Integer value : arrayQueueHeadTailBoundaryUpdated) {
            System.out.println(value);
        }
    }

    @Test
    public void testOfBoundary() {
        arrayQueueHeadTailBoundaryUpdated = new ArrayQueueHeadTailBoundaryUpdated<>(10);
        arrayQueueHeadTailBoundaryUpdated.head = 2147483640;
        arrayQueueHeadTailBoundaryUpdated.tail = arrayQueueHeadTailBoundaryUpdated.head;

        for (int i = 0; i < 10; i++) {
           // System.out.println("Tail: " + Integer.toUnsignedLong(arrayQueueHeadTailBoundaryUpdated.tail) + ", index: " + Integer.toUnsignedLong(arrayQueueHeadTailBoundaryUpdated.tail) % 10);
            arrayQueueHeadTailBoundaryUpdated.offer(i);
        }

        for (Integer value : arrayQueueHeadTailBoundaryUpdated) {
            System.out.println(value);
        }
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