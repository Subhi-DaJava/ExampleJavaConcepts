package com.uyghur.java.algo.queue_310723.arrayQueue_headtail_030823;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ArrayQueueHeadTailTest {

    private ArrayQueueHeadTail<Integer> arrayQueueHeadTail;

    @BeforeEach
    public void setUp() {
        arrayQueueHeadTail = new ArrayQueueHeadTail<>(5);
    }

    @Test
    void offerShouldReturnTrue() {
        arrayQueueHeadTail.offer(1);
        arrayQueueHeadTail.offer(2);
        arrayQueueHeadTail.offer(3);
        arrayQueueHeadTail.offer(4);
        assertThat(arrayQueueHeadTail.offer(5)).isTrue();
    }
    @Test
    void offerShouldReturnFalse() {
        arrayQueueHeadTail.offer(1);
        arrayQueueHeadTail.offer(2);
        arrayQueueHeadTail.offer(3);
        arrayQueueHeadTail.offer(4);
        assertThat(arrayQueueHeadTail.offer(5)).isTrue();
        assertThat(arrayQueueHeadTail.offer(5)).isFalse();
    }

    @Test
    void poll() {
        arrayQueueHeadTail.offer(1);
        arrayQueueHeadTail.offer(2);
        arrayQueueHeadTail.offer(3);
        arrayQueueHeadTail.offer(4);

        assertThat(arrayQueueHeadTail.poll()).isEqualTo(1);
        assertIterableEquals(arrayQueueHeadTail, List.of(2,3,4));
        
    }

    @Test
    void peek() {
        arrayQueueHeadTail.offer(1);
        arrayQueueHeadTail.offer(2);
        arrayQueueHeadTail.offer(3);
        arrayQueueHeadTail.offer(4);
        assertThat(arrayQueueHeadTail.peek()).isEqualTo(1);

    }

    @Test
    void isFullReturnTrue() {
        arrayQueueHeadTail.offer(1);
        arrayQueueHeadTail.offer(2);
        arrayQueueHeadTail.offer(3);
        arrayQueueHeadTail.offer(4);
        arrayQueueHeadTail.offer(5);

        assertThat(arrayQueueHeadTail.isFull()).isTrue();
    }

    @Test
    void isFullReturnFalse() {
        arrayQueueHeadTail.offer(1);
        arrayQueueHeadTail.offer(2);
        arrayQueueHeadTail.offer(3);
        arrayQueueHeadTail.offer(4);

        assertThat(arrayQueueHeadTail.isFull()).isFalse();
    }
    @Test
    void isEmpty() {
        assertThat(arrayQueueHeadTail.poll()).isNull();
    }

    @Test
    void iterator() {
        arrayQueueHeadTail.offer(1);
        arrayQueueHeadTail.offer(2);
        arrayQueueHeadTail.offer(3);
        arrayQueueHeadTail.offer(4);
        arrayQueueHeadTail.offer(5);

        assertIterableEquals(arrayQueueHeadTail, List.of(1,2,3,4,5));
    }

    @Test
    public void iteratorAllValue() {
        arrayQueueHeadTail.offer(5);
        arrayQueueHeadTail.offer(4);
        arrayQueueHeadTail.offer(3);
        arrayQueueHeadTail.offer(2);
        arrayQueueHeadTail.offer(1);

/*
      int i = 0;
        while (arrayQueueHeadTail.iterator().hasNext()) {
            if(i == 5) {
                return;
            }
            System.out.println( "Value at index " + i + ": " + arrayQueueHeadTail.iterator().next());
            i++;
        }
*/

        for (Integer value : arrayQueueHeadTail) {
            System.out.println(value);
        }
    }
}