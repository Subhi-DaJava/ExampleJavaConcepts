package com.uyghur.java.algo.queue_310723.arrayQueue_headtail_030823;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

@ExtendWith(MockitoExtension.class)
class ArrayQueueHeadTailSizeTest {

    private ArrayQueueHeadTailSize<String> arrayQueueHeadTailSize;

    @BeforeEach
    public void setUp() {
        arrayQueueHeadTailSize = new ArrayQueueHeadTailSize<>(5);
    }

    @Test
    void offerShouldReturnTrue() {
        arrayQueueHeadTailSize.offer("1");
        arrayQueueHeadTailSize.offer("2");
        arrayQueueHeadTailSize.offer("3");
        arrayQueueHeadTailSize.offer("4");
        assertThat(arrayQueueHeadTailSize.offer("5")).isTrue();
    }
    @Test
    void offerShouldReturnFalse() {
        arrayQueueHeadTailSize.offer("String1");
        arrayQueueHeadTailSize.offer("String2");
        arrayQueueHeadTailSize.offer("String3");
        arrayQueueHeadTailSize.offer("String4");
        assertThat(arrayQueueHeadTailSize.offer("String5")).isTrue();
        assertThat(arrayQueueHeadTailSize.offer("String5")).isFalse();
    }

    @Test
    void poll() {
        arrayQueueHeadTailSize.offer("String1");
        arrayQueueHeadTailSize.offer("String2");
        arrayQueueHeadTailSize.offer("String3");
        arrayQueueHeadTailSize.offer("String4");

        assertThat(arrayQueueHeadTailSize.poll()).isEqualTo("String1");
        assertIterableEquals(arrayQueueHeadTailSize, List.of("String2","String3","String4"));
        
    }

    @Test
    void peek() {
        arrayQueueHeadTailSize.offer("String1");
        arrayQueueHeadTailSize.offer("String2");
        arrayQueueHeadTailSize.offer("String3");
        arrayQueueHeadTailSize.offer("String4");
        assertThat(arrayQueueHeadTailSize.peek()).isEqualTo("String1");

    }

    @Test
    void isFullReturnTrue() {
        arrayQueueHeadTailSize.offer("String1");
        arrayQueueHeadTailSize.offer("String2");
        arrayQueueHeadTailSize.offer("String3");
        arrayQueueHeadTailSize.offer("String4");
        arrayQueueHeadTailSize.offer("String5");

        assertThat(arrayQueueHeadTailSize.isFull()).isTrue();
    }

    @Test
    void isFullReturnFalse() {
        arrayQueueHeadTailSize.offer("String1");
        arrayQueueHeadTailSize.offer("String2");
        arrayQueueHeadTailSize.offer("String3");
        arrayQueueHeadTailSize.offer("String4");

        assertThat(arrayQueueHeadTailSize.isFull()).isFalse();
    }
    @Test
    void isEmpty() {
        assertThat(arrayQueueHeadTailSize.poll()).isNull();
    }

    @Test
    void iterator() {
        arrayQueueHeadTailSize.offer("String1");
        arrayQueueHeadTailSize.offer("String2");
        arrayQueueHeadTailSize.offer("String3");
        arrayQueueHeadTailSize.offer("String4");
        arrayQueueHeadTailSize.offer("String5");

        assertIterableEquals(arrayQueueHeadTailSize, List.of("String1","String2","String3","String4","String5"));
    }

    @Test
    public void iteratorAllValue() {
        arrayQueueHeadTailSize.offer("String5");
        arrayQueueHeadTailSize.offer("String4");
        arrayQueueHeadTailSize.offer("String3");
        arrayQueueHeadTailSize.offer("String2");
        arrayQueueHeadTailSize.offer("String1");

/*
      int i = 0;
        while (arrayQueueHeadTail.iterator().hasNext()) {
            if(i == 5) {
                return;
            }
            System.out.println( "Value at index " + i + ": " + arrayQueueHeadTail.iterator().next());
            i++;
        }
*/
        for (String value : arrayQueueHeadTailSize) {
            System.out.println(value);
        }
    }
}