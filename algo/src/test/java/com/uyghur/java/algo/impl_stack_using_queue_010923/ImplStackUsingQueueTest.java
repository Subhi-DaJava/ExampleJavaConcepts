package com.uyghur.java.algo.impl_stack_using_queue_010923;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ImplStackUsingQueueTest {
    private ImplStackUsingQueue implStackUsingQueue;

    @BeforeEach
    public void setUp() {
        implStackUsingQueue = new ImplStackUsingQueue();
    }

    @Test
    void push() {
        implStackUsingQueue.push(1);
        implStackUsingQueue.push(2);
        implStackUsingQueue.push(3);
        implStackUsingQueue.push(4);
        assertThat(implStackUsingQueue.empty()).isFalse();
    }

    @Test
    void empty() {
        assertThat(implStackUsingQueue.empty()).isTrue();
    }

    @Test
    void pop() {
        implStackUsingQueue.push(1);
        implStackUsingQueue.push(2);
        implStackUsingQueue.push(3);
        implStackUsingQueue.push(4);
        assertThat(implStackUsingQueue.pop()).isEqualTo(4);
        assertThat(implStackUsingQueue.pop()).isEqualTo(3);
    }

    @Test
    void peek() {
        implStackUsingQueue.push(1);
        implStackUsingQueue.push(2);
        implStackUsingQueue.push(3);
        implStackUsingQueue.push(4);
        assertThat(implStackUsingQueue.peek()).isEqualTo(4);
        assertThat(implStackUsingQueue.pop()).isEqualTo(4);
        assertThat(implStackUsingQueue.peek()).isEqualTo(3);
    }
}