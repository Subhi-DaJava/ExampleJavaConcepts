package com.uyghur.java.algo.linkend_list_250623.circular_linked_list;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


@ExtendWith(MockitoExtension.class)
class DoubleCircularLinkedListTest {
    @InjectMocks
    private DoubleCircularLinkedList doubleCircularLinkedList;

    @Test
    public void addFirstTest() {
        doubleCircularLinkedList.addFirst(1);
        doubleCircularLinkedList.addFirst(1);
        assertIterableEquals(List.of(1, 1), doubleCircularLinkedList);
    }

    @Test
    public void addFirstWithIteratorTest() {
        doubleCircularLinkedList.addFirst(1);
        doubleCircularLinkedList.addFirst(2);
        doubleCircularLinkedList.addFirst(3);
        doubleCircularLinkedList.addFirst(4);
        doubleCircularLinkedList.addFirst(5);

        assertIterableEquals(List.of(5, 4, 3, 2, 1), doubleCircularLinkedList);
    }

    @Test
    public void addLastWithIteratorTest() {
        doubleCircularLinkedList.addFirst(1);
        doubleCircularLinkedList.addFirst(2);
        doubleCircularLinkedList.addLast(3);
        doubleCircularLinkedList.addLast(4);

        assertIterableEquals(List.of(2, 1, 3, 4), doubleCircularLinkedList);
    }

    @Test
    public void removeFirst() {
        doubleCircularLinkedList.addFirst(1);
        doubleCircularLinkedList.addFirst(2);
        doubleCircularLinkedList.addFirst(3);
        doubleCircularLinkedList.addFirst(4);
        doubleCircularLinkedList.addFirst(5);

        assertIterableEquals(List.of(5, 4, 3, 2, 1), doubleCircularLinkedList);

        doubleCircularLinkedList.removeFirst();
        assertIterableEquals(List.of(4, 3, 2, 1), doubleCircularLinkedList);

        doubleCircularLinkedList.removeFirst();
        assertIterableEquals(List.of(3, 2, 1), doubleCircularLinkedList);

        doubleCircularLinkedList.removeFirst();
        assertIterableEquals(List.of(2, 1), doubleCircularLinkedList);

        doubleCircularLinkedList.removeFirst();
        assertIterableEquals(List.of(1), doubleCircularLinkedList);

        doubleCircularLinkedList.removeFirst();
        assertIterableEquals(List.of(), doubleCircularLinkedList);

        assertThrows(RuntimeException.class, doubleCircularLinkedList::removeFirst);

        assertThatThrownBy(() -> doubleCircularLinkedList.removeFirst())
                .isInstanceOf(RuntimeException.class)
                .hasMessageContaining("bad operation");
    }

    @Test
    public void removeLast() {
        doubleCircularLinkedList.addFirst(1);
        doubleCircularLinkedList.addFirst(2);
        doubleCircularLinkedList.addFirst(3);
        doubleCircularLinkedList.addFirst(4);
        doubleCircularLinkedList.addFirst(5);

        assertIterableEquals(List.of(5, 4, 3, 2, 1), doubleCircularLinkedList);

        doubleCircularLinkedList.removeLast();
        assertIterableEquals(List.of(5, 4, 3, 2), doubleCircularLinkedList);

        doubleCircularLinkedList.removeLast();
        assertIterableEquals(List.of(5, 4, 3), doubleCircularLinkedList);

        doubleCircularLinkedList.removeLast();
        assertIterableEquals(List.of(5, 4), doubleCircularLinkedList);

        doubleCircularLinkedList.removeLast();
        assertIterableEquals(List.of(5), doubleCircularLinkedList);

        doubleCircularLinkedList.removeLast();
        assertIterableEquals(List.of(), doubleCircularLinkedList);

        assertThrows(RuntimeException.class, doubleCircularLinkedList::removeLast);

        assertThatThrownBy(() -> doubleCircularLinkedList.removeLast())
                .isInstanceOf(RuntimeException.class)
                .hasMessageContaining("bad operation");
    }

    @Test
    public void removeNodeByGivenValue() {
        doubleCircularLinkedList.addFirst(1);
        doubleCircularLinkedList.addFirst(2);
        doubleCircularLinkedList.addFirst(3);
        doubleCircularLinkedList.addFirst(4);
        doubleCircularLinkedList.addFirst(5);

        doubleCircularLinkedList.removeNodeByNodeValue(2);
        assertIterableEquals(List.of(5, 4, 3, 1), doubleCircularLinkedList);

        doubleCircularLinkedList.removeNodeByNodeValue(3);
        assertIterableEquals(List.of(5, 4, 1), doubleCircularLinkedList);

        assertThatThrownBy(() -> doubleCircularLinkedList.removeNodeByNodeValue(6))
                .isInstanceOf(RuntimeException.class)
                .hasMessageContaining("Node Not found");

    }



}