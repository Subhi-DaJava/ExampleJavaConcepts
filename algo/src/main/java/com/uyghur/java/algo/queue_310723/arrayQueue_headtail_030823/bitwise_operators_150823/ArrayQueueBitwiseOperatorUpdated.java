package com.uyghur.java.algo.queue_310723.arrayQueue_headtail_030823.bitwise_operators_150823;

import com.uyghur.java.algo.queue_310723.Queue;

import java.util.Iterator;


public class ArrayQueueBitwiseOperatorUpdated<T> implements Queue<T>, Iterable<T>  {
    private final T[] array;

    int head = 0;
    int tail = 0;

    private final int powerOf2;

    public int getPowerOf2() {
        return powerOf2;
    }

    @SuppressWarnings("all") // no waring
    public ArrayQueueBitwiseOperatorUpdated(int capacity) {
        // 1. throws exception if array capacity != 2^n
        // capacity & (capacity - 1) == 0     =>      0001_0000 (2^4 = 16) & 0000_1111 (2^4 -1 = 15) = 0, if lengt == 2^n ==> length & length - 1 == 0
        /*if( (capacity & (capacity - 1)) != 0 ) {
            throw new IllegalArgumentException("The array length should be 2^n");
        } */

        // 2. change the length ~ 2^n => 14 => 16 25 => 32
        /*
             2^3   =  8
             2^3.? =  9
             ........
             2^3.? =  15
             2^4   =  16
             2^4.? =  20
             .....
             2^5  =  32
             ......
             2^6  =  64
         */

       // int length2N = (int)log2(30) + 1; => log2(x) = log10(x) / log10(2) + 1
        //powerOf2 = (int)(Math.log(capacity) / Math.log(2)) + 1 ; // is ok for the capacity dosen't equal to 2^n
        powerOf2 = (int)(Math.log(capacity - 1) / Math.log(2)) + 1 ; // is ok for the capacity dosen't equal to 2^n or equals to 2^n

        // << is the left shift operator
        array = (T[]) new Object[1 << powerOf2];
        /*
         move to left
         2^0 = > 1
         2^1 => 10
         2^2 => 100
         2^3 => 1000
         2^4 => 1_0000
         2^5 => 10_0000
         ......

         */
        //System.out.println("New Capacity: " + array.length);
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
