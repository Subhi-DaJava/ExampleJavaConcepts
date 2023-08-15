package com.uyghur.java.algo.queue_310723.arrayQueue_headtail_030823.bitwise_operators_150823;

import com.uyghur.java.algo.queue_310723.Queue;

import java.util.Iterator;

/**
 * This operator is a binary operator, denoted by ‘&.’
 * It returns bit by bit AND of input values, i.e., if both bits are 1, it gives 1, else it shows 0.
 * Divisor, Dividend (2^n - 1, array-length), Quotient and remainder
 */
public class ArrayQueueBitwiseOperator<T> implements Queue<T>, Iterable<T> {
    private final T[] array;
    int head = 0;
    int tail = 0;

    @SuppressWarnings("all") // no waring
    public ArrayQueueBitwiseOperator(int capacity) {
        array = (T[]) new Object[capacity];
    }

    @Override
    public boolean offer(T value) {
        if (isFull()) {
            return false;
        }

        //array[(int) (Integer.toUnsignedLong(tail) % array.length)] = value;
        array[tail & (array.length - 1)] = value; // == array[tail & array.length - 1] = value;
        tail++;
        return true;
    }

    @Override
    public T poll() {
        if (isEmpty()) {
            return null;
        }
        T value = array[head & (array.length - 1)];
        head++;
        return value;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return array[head & (array.length - 1)];
    }

    @Override
    public boolean isFull() {
        return tail - head == array.length;
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {

            int pointer = head;

            @Override
            public boolean hasNext() {
                return pointer != tail;
            }

            @Override
            public T next() {
                T value = array[pointer & (array.length - 1)];
                pointer++;
                return value;
            }
        };
    }
}
