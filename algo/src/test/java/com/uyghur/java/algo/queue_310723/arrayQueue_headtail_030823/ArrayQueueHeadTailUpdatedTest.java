package com.uyghur.java.algo.queue_310723.arrayQueue_headtail_030823;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ArrayQueueHeadTailUpdatedTest {
    
    private ArrayQueueHeadTailUpdated<Integer> arrayQueueHeadTailUpdated;
    @BeforeEach
    void setUp() {
        arrayQueueHeadTailUpdated = new ArrayQueueHeadTailUpdated<>(5);
    }

    @Test
    void offerShouldReturnTrue() {
        arrayQueueHeadTailUpdated.offer(1);
        arrayQueueHeadTailUpdated.offer(2);
        arrayQueueHeadTailUpdated.offer(3);
        arrayQueueHeadTailUpdated.offer(4);
        assertThat(arrayQueueHeadTailUpdated.offer(5)).isTrue();
    }
    @Test
    void offerShouldReturnFalse() {
        arrayQueueHeadTailUpdated.offer(1);
        arrayQueueHeadTailUpdated.offer(2);
        arrayQueueHeadTailUpdated.offer(3);
        arrayQueueHeadTailUpdated.offer(4);
        assertThat(arrayQueueHeadTailUpdated.offer(5)).isTrue();
        assertThat(arrayQueueHeadTailUpdated.offer(5)).isFalse();
    }

    @Test
    void poll() {
        arrayQueueHeadTailUpdated.offer(1);
        arrayQueueHeadTailUpdated.offer(2);
        arrayQueueHeadTailUpdated.offer(3);
        arrayQueueHeadTailUpdated.offer(4);

        assertThat(arrayQueueHeadTailUpdated.poll()).isEqualTo(1);
        assertIterableEquals(arrayQueueHeadTailUpdated, List.of(2,3,4));

    }

    @Test
    void peek() {
        arrayQueueHeadTailUpdated.offer(1);
        arrayQueueHeadTailUpdated.offer(2);
        arrayQueueHeadTailUpdated.offer(3);
        arrayQueueHeadTailUpdated.offer(4);
        assertThat(arrayQueueHeadTailUpdated.peek()).isEqualTo(1);

    }

    @Test
    void isFullReturnTrue() {
        arrayQueueHeadTailUpdated.offer(1);
        arrayQueueHeadTailUpdated.offer(2);
        arrayQueueHeadTailUpdated.offer(3);
        arrayQueueHeadTailUpdated.offer(4);
        arrayQueueHeadTailUpdated.offer(5);

        assertThat(arrayQueueHeadTailUpdated.isFull()).isTrue();
    }

    @Test
    void isFullReturnFalse() {
        arrayQueueHeadTailUpdated.offer(1);
        arrayQueueHeadTailUpdated.offer(2);
        arrayQueueHeadTailUpdated.offer(3);
        arrayQueueHeadTailUpdated.offer(4);

        assertThat(arrayQueueHeadTailUpdated.isFull()).isFalse();
    }
    @Test
    void isEmpty() {
        assertThat(arrayQueueHeadTailUpdated.poll()).isNull();
    }

    @Test
    void iterator() {
        arrayQueueHeadTailUpdated.offer(1);
        arrayQueueHeadTailUpdated.offer(2);
        arrayQueueHeadTailUpdated.offer(3);
        arrayQueueHeadTailUpdated.offer(4);
        arrayQueueHeadTailUpdated.offer(5);

        assertIterableEquals(arrayQueueHeadTailUpdated, List.of(1,2,3,4,5));
    }

    @Test
    public void iteratorAllValue() {
        arrayQueueHeadTailUpdated.offer(5);
        arrayQueueHeadTailUpdated.offer(4);
        arrayQueueHeadTailUpdated.offer(3);
        arrayQueueHeadTailUpdated.offer(2);
        arrayQueueHeadTailUpdated.offer(1);

        for (Integer value : arrayQueueHeadTailUpdated) {
            System.out.println(value);
        }
    }
}