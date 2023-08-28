package com.uyghur.java.algo.linked_list_statck_210823;

import com.uyghur.java.algo.stack_210823.linked_list_statck_210823.LinkedListStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListStackTest {
    private LinkedListStack<Integer> linkedListStack;

    @BeforeEach
    public void setUp() {
        linkedListStack = new LinkedListStack<>(5);
    }

    @Test
    void push() {
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        linkedListStack.push(4);
        linkedListStack.push(5);

        assertIterableEquals(linkedListStack, List.of(5, 4, 3, 2, 1));
        assertThat(linkedListStack.push(6)).isFalse();
    }

    @Test
    void pop() {
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        linkedListStack.push(4);
        linkedListStack.push(5);

        assertThat(linkedListStack.pop()).isEqualTo(5);
        assertThat(linkedListStack.pop()).isEqualTo(4);
    }

    @Test
    void popReturnNullWithEmptyStack() {

        assertThat(linkedListStack.pop()).isEqualTo(null);
        assertThat(linkedListStack.pop()).isEqualTo(null);
    }

    @Test
    void peek() {
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        linkedListStack.push(4);
        linkedListStack.push(5);

        assertThat(linkedListStack.peek()).isEqualTo(5);
        assertThat(linkedListStack.peek()).isEqualTo(5);
    }

    @Test
    void peekReturnNullWithEmptyStack() {

        assertThat(linkedListStack.pop()).isEqualTo(null);
        assertThat(linkedListStack.pop()).isEqualTo(null);
    }

    @Test
    void isEmpty() {
        assertThat(linkedListStack.isEmpty()).isTrue();
    }

    @Test
    void isEmptyReturnFalse() {
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        assertThat(linkedListStack.isEmpty()).isFalse();
    }

    @Test
    void isFull() {
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        linkedListStack.push(4);
        linkedListStack.push(5);

        assertThat(linkedListStack.isFull()).isTrue();
    }

    @Test
    void isFullReturnFalse() {
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        linkedListStack.push(4);

        assertThat(linkedListStack.isFull()).isFalse();
    }

    @Test
    void iterator() {
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        linkedListStack.push(4);
        linkedListStack.push(5);

        assertIterableEquals(linkedListStack, List.of(5, 4, 3, 2, 1));
        assertThat(linkedListStack.isFull()).isTrue();
        linkedListStack.pop();
        assertIterableEquals(linkedListStack, List.of(4, 3, 2, 1));

        for (Integer t : linkedListStack) {
            System.out.println(t);
        }
    }
}