package com.uyghur.java.algo.queue_310723.arrayQueue_headtail_030823;


import com.uyghur.java.algo.queue_310723.Queue;

import java.util.Iterator;

/**
 *  head, tail
 *  0            1   2    3    4    5  -> 0 capacity: 5, length : 6
 *  tail is empty
 * @param <T>
 */
public class ArrayQueueHeadTail<T> implements Queue<T>, Iterable<T> {

    private final T[] array;
    private int head = 0;
    private int tail = 0;

    @SuppressWarnings("all") // no waring
    public ArrayQueueHeadTail(int capacity) {
        array = (T[]) new Object[capacity + 1];
    }

    @Override
    public boolean offer(T value) {
        if (isFull()) {
            return false;
        }

        array[tail] = value;
        tail = (tail + 1) % array.length;
        return true;
    }

    @Override
    public T poll() {
        if (isEmpty()) {
            return null;
        }
        T value = array[head];
        head = (head + 1) % array.length;
        return value;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return array[head];
    }

    @Override
    public boolean isFull() {
        return (tail + 1) % array.length == head;
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
                T value = array[pointer];
                pointer = (pointer + 1) % array.length;
                return value;
            }
        };
    }
}
