package com.uyghur.java.algo.queue_310723;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class LinkedListQueueTest {

    private LinkedListQueue<Integer> linkedListQueue;
    
    @BeforeEach
    public void setUp() {
        linkedListQueue = new LinkedListQueue<>(5);
    }
    @Test
    void offerShouldReturnTrue() {
        linkedListQueue.offer(1);
        linkedListQueue.offer(2);
        linkedListQueue.offer(3);
        linkedListQueue.offer(4);
        assertThat(linkedListQueue.offer(5)).isTrue();
    }
    @Test
    void offerShouldReturnFalse() {
        linkedListQueue.offer(1);
        linkedListQueue.offer(2);
        linkedListQueue.offer(3);
        linkedListQueue.offer(4);
        assertThat(linkedListQueue.offer(5)).isTrue();
        assertThat(linkedListQueue.offer(5)).isFalse();
    }

    @Test
    void poll() {
        linkedListQueue.offer(1);
        linkedListQueue.offer(2);
        linkedListQueue.offer(3);
        linkedListQueue.offer(4);

        assertThat(linkedListQueue.poll()).isEqualTo(1);
        assertIterableEquals(linkedListQueue, List.of(2,3,4));
        assertThat(linkedListQueue.getSize()).isEqualTo(3);
        assertThat(linkedListQueue.getCapacity()).isEqualTo(5);
    }

    @Test
    void peek() {
        linkedListQueue.offer(1);
        linkedListQueue.offer(2);
        linkedListQueue.offer(3);
        linkedListQueue.offer(4);
        assertThat(linkedListQueue.peek()).isEqualTo(1);
        assertThat(linkedListQueue.getSize()).isEqualTo(4);
    }

    @Test
    void isFullReturnTrue() {
        linkedListQueue.offer(1);
        linkedListQueue.offer(2);
        linkedListQueue.offer(3);
        linkedListQueue.offer(4);
        linkedListQueue.offer(5);

        assertThat(linkedListQueue.isFull()).isTrue();
    }

    @Test
    void isFullReturnFalse() {
        linkedListQueue.offer(1);
        linkedListQueue.offer(2);
        linkedListQueue.offer(3);
        linkedListQueue.offer(4);

        assertThat(linkedListQueue.isFull()).isFalse();
    }
    @Test
    void isEmpty() {
        assertThat(linkedListQueue.poll()).isNull();
    }

    @Test
    void iterator() {
        linkedListQueue.offer(1);
        linkedListQueue.offer(2);
        linkedListQueue.offer(3);
        linkedListQueue.offer(4);
        linkedListQueue.offer(5);

        assertIterableEquals(linkedListQueue, List.of(1,2,3,4,5));
    }
}