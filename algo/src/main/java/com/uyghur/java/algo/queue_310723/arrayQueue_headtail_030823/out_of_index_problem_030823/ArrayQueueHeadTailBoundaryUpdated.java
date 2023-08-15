package com.uyghur.java.algo.queue_310723.arrayQueue_headtail_030823.out_of_index_problem_030823;


import com.uyghur.java.algo.queue_310723.Queue;

import java.util.Iterator;

/**
 *  head, tail
 *  0            1   2    3    4    5  -> 0 capacity: 5, length : 6
 *  tail is empty
 * @param <T>
 */
public class ArrayQueueHeadTailBoundaryUpdated<T> implements Queue<T>, Iterable<T> {

    private final T[] array;
    int head = 0;
    int tail = 0;

    @SuppressWarnings("all") // no waring
    public ArrayQueueHeadTailBoundaryUpdated(int capacity) {
        array = (T[]) new Object[capacity];
    }

    @Override
    public boolean offer(T value) {
        if (isFull()) {
            return false;
        }

        array[(int) (Integer.toUnsignedLong(tail) % array.length)] = value;
        tail++;
        return true;
    }

    @Override
    public T poll() {
        if (isEmpty()) {
            return null;
        }
        T value = array[(int) (Integer.toUnsignedLong(head) % array.length)];
        head++;
        return value;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return array[(int) (Integer.toUnsignedLong(head) % array.length)];
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
                T value = array[(int) (Integer.toUnsignedLong(pointer) % array.length)];
                pointer++;
                return value;
            }
        };
    }
}
