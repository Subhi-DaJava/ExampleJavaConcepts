package com.uyghur.java.algo.stack_210823.stack_array_list_210823;

import com.uyghur.java.algo.stack_210823.stack_interface_210823.Stack;

import java.util.Iterator;

/**
 * button  0    1    2      3      4      5    top=0
 * add   e1    top
 * add   e1    e2   top
 *
 * @param <T>
 */
public class ArrayStack<T> implements Stack<T>, Iterable<T> {

    private final T[] array;
    private int top; // index

    @SuppressWarnings("All cases")
    public ArrayStack(int capacity) {
        this.array = (T[]) new Object[capacity];
    }

    @Override
    public boolean push(T value) {
        if (isFull()) {
            return false;
        }
        array[top++] = value;
        return true;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        return array[--top];
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return array[top - 1];
    }

    @Override
    public boolean isEmpty() {

        return this.top == 0;
    }

    @Override
    public boolean isFull() {
        return this.top == this.array.length;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = top;

            @Override
            public boolean hasNext() {
                return index > 0;
            }

            @Override
            public T next() {
                return array[--index];
            }
        };
    }
}
