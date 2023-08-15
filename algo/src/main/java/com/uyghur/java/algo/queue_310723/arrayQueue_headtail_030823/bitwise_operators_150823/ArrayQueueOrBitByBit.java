package com.uyghur.java.algo.queue_310723.arrayQueue_headtail_030823.bitwise_operators_150823;

import com.uyghur.java.algo.queue_310723.Queue;

import java.util.Iterator;


public class ArrayQueueOrBitByBit<T> implements Queue<T>, Iterable<T> {
    private final T[] array;

    int head = 0;
    int tail = 0;

    @SuppressWarnings("all") // no waring
    public ArrayQueueOrBitByBit(int capacity) {
        // |= is the assignment operator with operation.
       /* capacity -= 1; : Subtracts 1 from the initial capacity.

        capacity |= capacity >> 1; : Performs a right shift by one bit and then performs a "bitwise or" with the original capacity.
        This step is used to propagate the upper bits to ensure that all bits preceding the most significant bit are set to 1.
        This ensures that the resulting capacitance is the integer closest to the upper power of 2.

        capacity |= capacity >> 2; : Repeat the process shifting 2 bits this time. This continues to propagate the bits.

        Steps 2 and 3 are repeated for 4, 8, 16, and 32 bit offsets.
        Note that the 32-bit offset is generally redundant since the size of integers in Java is limited to 32 bits.
        */
        capacity -= 1;
        capacity |= capacity >> 1;
        capacity |= capacity >> 2;
        capacity |= capacity >> 4;
        capacity |= capacity >> 8;
        capacity |= capacity >> 16;
        capacity |= capacity >> 32;

        capacity++;
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
