package com.uyghur.java.algo.stack_210823.stack_array_list_210823;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest {
    private ArrayStack<Integer> arrayStack;

    @BeforeEach
    public void setUp() {
        arrayStack = new ArrayStack<>(5);
    }

    @Test
    void push() {
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);

        assertIterableEquals(arrayStack, List.of(5, 4, 3, 2, 1));
        assertThat(arrayStack.push(6)).isFalse();
    }

    @Test
    void pop() {
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);

        assertThat(arrayStack.pop()).isEqualTo(5);
        assertThat(arrayStack.pop()).isEqualTo(4);
    }

    @Test
    void popReturnNullWithEmptyStack() {

        assertThat(arrayStack.pop()).isEqualTo(null);
        assertThat(arrayStack.pop()).isEqualTo(null);
    }

    @Test
    void peek() {
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);

        assertThat(arrayStack.peek()).isEqualTo(5);
        assertThat(arrayStack.peek()).isEqualTo(5);
    }

    @Test
    void peekReturnNullWithEmptyStack() {

        assertThat(arrayStack.pop()).isEqualTo(null);
        assertThat(arrayStack.pop()).isEqualTo(null);
    }

    @Test
    void isEmpty() {
        assertThat(arrayStack.isEmpty()).isTrue();
    }

    @Test
    void isEmptyReturnFalse() {
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        assertThat(arrayStack.isEmpty()).isFalse();
    }

    @Test
    void isFull() {
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);

        assertThat(arrayStack.isFull()).isTrue();
    }

    @Test
    void isFullReturnFalse() {
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);

        assertThat(arrayStack.isFull()).isFalse();
    }

    @Test
    void iterator() {
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);

        assertIterableEquals(arrayStack, List.of(5, 4, 3, 2, 1));
        assertThat(arrayStack.isFull()).isTrue();
        arrayStack.pop();
        assertIterableEquals(arrayStack, List.of(4, 3, 2, 1));

        for (Integer t : arrayStack) {
            System.out.println(t);
        }
    }
}