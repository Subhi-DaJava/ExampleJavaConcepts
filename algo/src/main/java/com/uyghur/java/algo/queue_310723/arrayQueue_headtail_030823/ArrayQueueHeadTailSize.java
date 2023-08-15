package com.uyghur.java.algo.queue_310723.arrayQueue_headtail_030823;


import com.uyghur.java.algo.queue_310723.Queue;

import java.util.Iterator;

/**
 *  head, tail
 *  0            1   2    3    4    5  -> 0 capacity: 5, length : 6
 *  tail is empty
 *
 *  head, tail of the index of the first and last,
 * @param <T>
 */
public class ArrayQueueHeadTailSize<T> implements Queue<T>, Iterable<T> {

    private final T[] array;
    private int head = 0;
    private int tail = 0;
    private int size = 0; // total elements

    @SuppressWarnings("all") // no waring
    public ArrayQueueHeadTailSize(int capacity) {
        array = (T[]) new Object[capacity];
    }

    @Override
    public boolean offer(T value) {
        if (isFull()) {
            return false;
        }

        array[tail] = value;
        tail = (tail + 1) % array.length;
        size++;
        return true;
    }

    @Override
    public T poll() {
        if (isEmpty()) {
            return null;
        }
        T value = array[head];
        head = (head + 1) % array.length;
        size--;
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
        return size == array.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {

            int pointer = head;
            int count = 0;
            @Override
            public boolean hasNext() {
                return count < size; // (count == size - 1, max)
            }

            @Override
            public T next() {
                T value = array[pointer];
                pointer = (pointer + 1) % array.length;
                count++;
                return value;
            }
        };
    }
}
