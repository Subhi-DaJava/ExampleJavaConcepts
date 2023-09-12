package com.uyghur.java.algo.impl_queue_using_stacks_010923;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ImplQueueUsingStacksTest {
    private ImplQueueUsingStacks implQueueUsingStacks;

    @BeforeEach
    public void setUp() {
        implQueueUsingStacks = new ImplQueueUsingStacks();
    }

    @Test
    void empty() {
        assertThat(implQueueUsingStacks.empty()).isTrue();
    }

    @Test
    void push() {
        implQueueUsingStacks.push(1);
        implQueueUsingStacks.push(2);
        implQueueUsingStacks.push(3);
        implQueueUsingStacks.push(4);
        implQueueUsingStacks.push(5);
        assertThat(implQueueUsingStacks.empty()).isFalse();

    }

    @Test
    void pop() {
        implQueueUsingStacks.push(1);
        implQueueUsingStacks.push(2);
        implQueueUsingStacks.push(3);
        implQueueUsingStacks.push(4);
        implQueueUsingStacks.push(5);
        assertThat(implQueueUsingStacks.pop()).isEqualTo(1);
        assertThat(implQueueUsingStacks.pop()).isEqualTo(2);

    }

    @Test
    void peek() {
        implQueueUsingStacks.push(1);
        implQueueUsingStacks.push(2);
        implQueueUsingStacks.push(3);
        implQueueUsingStacks.push(4);
        implQueueUsingStacks.push(5);

        assertThat(implQueueUsingStacks.peek()).isEqualTo(1);
        assertThat(implQueueUsingStacks.pop()).isEqualTo(1);
        assertThat(implQueueUsingStacks.peek()).isEqualTo(2);
    }

}
