package com.uyghur.java.algo.arrays_240623;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class DynamicArrayTest {
    
    private DynamicArray dynamicArray;

    @BeforeEach
    public void init() {
        dynamicArray = new DynamicArray();
    }

    @Test
    public void addLastTest() {

        dynamicArray.addLast(1);
        dynamicArray.addLast(2);
        dynamicArray.addLast(3);
        dynamicArray.addLast(4);
        dynamicArray.addLast(5);
        dynamicArray.addLast(6);

        assertThat(dynamicArray.getElt(0)).isEqualTo(1);
        assertThat(dynamicArray.getElt(4)).isEqualTo(5);
        assertThat(dynamicArray.getElt(3)).isEqualTo(4);
        assertThat(dynamicArray.getElt(5)).isEqualTo(6);

        for (int i = 0; i < 6; i++) {
            System.out.println(dynamicArray.getElt(i));
        }
    }

    @Test
    public void addTest() {

        dynamicArray.addLast(1);
        dynamicArray.addLast(2);
        dynamicArray.addLast(3);
        dynamicArray.addLast(4);

        dynamicArray.add(2, 5);

        assertThat(dynamicArray.getElt(0)).isEqualTo(1);
        assertThat(dynamicArray.getElt(3)).isEqualTo(3);
        assertThat(dynamicArray.getElt(2)).isEqualTo(5);

        for (int i = 0; i < 5; i++) {
            System.out.println(dynamicArray.getElt(i));
        }
    }

    @Test
    public void forEachElt() {
        dynamicArray.addLast(1);
        dynamicArray.addLast(2);
        dynamicArray.addLast(3);
        dynamicArray.addLast(4);

        dynamicArray.add(2, 5);

        dynamicArray.forEachElt();
    }


    @Test
    public void forEachWithConsumer() {
        dynamicArray.addLast(1);
        dynamicArray.addLast(2);
        dynamicArray.addLast(3);
        dynamicArray.addLast(4);

        dynamicArray.add(2, 5);

        dynamicArray.forEachWithConsumer(elt -> {
            if (elt %2 == 0) {
                System.out.println("Hi, I'm even number");
            } else {
                System.out.println("Hello, I'm odd number");
            }
        });
    }

    @Test
    public void iteratorTest() {
        dynamicArray.addLast(1);
        dynamicArray.addLast(2);
        dynamicArray.addLast(3);
        dynamicArray.addLast(4);

        dynamicArray.add(2, 5);

        for (Integer elt : dynamicArray) {
            System.out.println(elt);
        }
    }

    @Test
    public void intStreamTest() {
        dynamicArray.addLast(1);
        dynamicArray.addLast(2);
        dynamicArray.addLast(3);
        dynamicArray.addLast(4);

        dynamicArray.add(2, 5);

        dynamicArray.streamElt().forEach(System.out::println);
    }

    @Test
    public void streamsTest() {
        dynamicArray.addLast(1);
        dynamicArray.addLast(2);
        dynamicArray.addLast(3);
        dynamicArray.addLast(4);

        dynamicArray.add(2, 5);

        dynamicArray.streams().forEach(System.out::println);
    }

    @Test
    public void removeEltTest() {
        dynamicArray.addLast(1);
        dynamicArray.addLast(2);
        dynamicArray.addLast(3);
        dynamicArray.addLast(4);

        dynamicArray.add(2, 5);

        int removedElt = dynamicArray.removeElt(2);

        dynamicArray.streams().forEach(System.out::println);

        assertThat(removedElt).isEqualTo(5);

        assertIterableEquals(List.of(1, 2, 3, 4), dynamicArray);
    }

    @Test
    public void removeLastEltTest() {
        dynamicArray.addLast(1);
        dynamicArray.addLast(2);
        dynamicArray.addLast(3);
        dynamicArray.addLast(4);

        dynamicArray.add(2, 5);

        int removedElt = dynamicArray.removeElt(4);

        dynamicArray.streams().forEach(System.out::println);

        assertThat(removedElt).isEqualTo(4);

        assertIterableEquals(List.of(1, 2, 5, 3), dynamicArray);
    }


    @Test
    public void checkAndCreateNewArray() {
        for (int i = 0; i < 10; i++) {
            dynamicArray.add(i, i + 1);
        }

        for (int i = 10; i < 15; i++) {
            dynamicArray.add(i, i + 1);
        }
        assertThat(dynamicArray.getSize()).isEqualTo(18);
        assertIterableEquals(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15), dynamicArray);
    }
}