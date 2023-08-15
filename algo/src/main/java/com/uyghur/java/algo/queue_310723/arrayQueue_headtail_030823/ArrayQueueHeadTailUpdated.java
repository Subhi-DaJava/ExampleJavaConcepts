package com.uyghur.java.algo.queue_310723.arrayQueue_headtail_030823;


import com.uyghur.java.algo.queue_310723.Queue;

import java.util.Iterator;

/**
 *  head        tail
 *  0            1   2    3    4    5  -> 0 capacity: 6
 *
 *  tail++
 *
 *  head++
 *
 * @param <T>
 */

public class ArrayQueueHeadTailUpdated<T> implements Queue<T>, Iterable<T> {

    private final T[] array;
    private int head = 0;
    private int tail = 0;

    @SuppressWarnings("all") // no waring
    public ArrayQueueHeadTailUpdated(int capacity) {
        array = (T[]) new Object[capacity];
    }

    @Override
    public boolean offer(T value) {
        if (isFull()) {
            return false;
        }

        array[tail % array.length] = value;
        tail++;
        return true;
    }

    @Override
    public T poll() {
        if (isEmpty()) {
            return null;
        }
        T value = array[head % array.length];
        head++;
        return value;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return array[head % array.length];
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
                T value = array[pointer % array.length];
                pointer++;
                return value;
            }
        };
    }
}
