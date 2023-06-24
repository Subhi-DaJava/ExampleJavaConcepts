package com.uyghur.java.algo.arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class DynamicArray implements Iterable<Integer> {

    private int size = 0;

    private int capacity = 8;

    //private int[] arr = new int[capacity];
    private int[] arr = {};

    public void addLast(int elt) {
        add(size, elt);
    }

    public void add(int index, int elt) {

        checkAndCreateNewBigArray();

        if (index < 0 || index > size) {
            throw new RuntimeException("index not found in the array");
        }

        if (index < size) {
            System.arraycopy(arr, index, arr, index + 1, size - index);
        }
        arr[index] = elt;
        size++;
    }

    private void checkAndCreateNewBigArray() {

        if (size == 0) {
            arr = new int[capacity];
        } else if (size == capacity) {
            capacity += capacity >>> 1; // capacity = capacity + capacity/2

            int[] newArr = new int[capacity];

            System.arraycopy(arr, 0, newArr, 0, size);

            arr = newArr;
        }
    }

    public int getElt(int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException("index not found in the array");
        }
        return arr[index];
    }

    public void forEachElt() {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    public void forEachWithConsumer(Consumer<Integer> consumer) {
        for (int i = 0; i < size; i++) {
            consumer.accept(arr[i]);
        }
    }


    @Override
    public Iterator<Integer> iterator() {

        return new Iterator<Integer>() {
            int indexElt = 0;

            @Override
            public boolean hasNext() {
                return indexElt < size;
            }

            @Override
            public Integer next() {

                return arr[indexElt++];
            }
        };
    }


    public IntStream streamElt() {
        return IntStream.of(arr); // 1 2 3 0 0 0
    }


    public IntStream streams() {
        return IntStream.of(Arrays.copyOfRange(arr, 0, size));
    }


    public int removeElt(int index) {

        final int removedElt = arr[index];

        if (index < size - 1) {
            System.arraycopy(arr, index + 1, arr, index, size - (index + 1));
        }

        size--;
        return removedElt;
    }

    public int getSize() {
        return arr.length;
    }
}
