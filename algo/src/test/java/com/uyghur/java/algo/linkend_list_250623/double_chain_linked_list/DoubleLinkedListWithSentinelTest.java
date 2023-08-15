package com.uyghur.java.algo.linkend_list_250623.double_chain_linked_list;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

@ExtendWith(MockitoExtension.class)
class DoubleLinkedListWithSentinelTest {
    @InjectMocks
    private DoubleLinkedListWithSentinel doubleLinkedListWithSentinel;

    @Test
    public void insertAtIndex0() {
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 5);
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 4);
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 3);

        assertThat(doubleLinkedListWithSentinel.findValueWithIndex(0)).isEqualTo(3);
        assertThat(doubleLinkedListWithSentinel.findValueWithIndex(1)).isEqualTo(4);
        assertThat(doubleLinkedListWithSentinel.findValueWithIndex(2)).isEqualTo(5);
    }

    @Test
    public void insertAtLastIndex() {
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 5);
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 4);
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 3);
        doubleLinkedListWithSentinel.insertNewNodeByIndex(2, 1);


        assertThat(doubleLinkedListWithSentinel.findValueWithIndex(0)).isEqualTo(3);
        assertThat(doubleLinkedListWithSentinel.findValueWithIndex(1)).isEqualTo(4);
        assertThat(doubleLinkedListWithSentinel.findValueWithIndex(2)).isEqualTo(1);
        assertThat(doubleLinkedListWithSentinel.findValueWithIndex(3)).isEqualTo(5);
    }

    @Test
    public void insertAtIndexNotExistingShouldThrowException() {
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 5);
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 4);

        assertThatThrownBy(() -> doubleLinkedListWithSentinel.insertNewNodeByIndex(5, 10))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Node not found with index{5}");
    }

    @Test
    public void addFirst() {
        doubleLinkedListWithSentinel.addFirst(5);
        doubleLinkedListWithSentinel.addFirst(4);

        assertIterableEquals(List.of(4, 5), doubleLinkedListWithSentinel);

        assertThat(doubleLinkedListWithSentinel.findValueWithIndex(0)).isEqualTo(4);
        assertThat(doubleLinkedListWithSentinel.findValueWithIndex(1)).isEqualTo(5);
    }

    @Test
    public void removeIndexAtZero() {
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 5);
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 3);
        doubleLinkedListWithSentinel.insertNewNodeByIndex(1, 2);
        doubleLinkedListWithSentinel.addFirst(4);

        doubleLinkedListWithSentinel.removeNodeByIndex(0);

        assertThat(doubleLinkedListWithSentinel.findValueWithIndex(0)).isEqualTo(3);
    }


    @Test
    public void removeIndexAtBetween() {
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 5);
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 3);
        doubleLinkedListWithSentinel.insertNewNodeByIndex(1, 2);
        doubleLinkedListWithSentinel.addFirst(4);

        doubleLinkedListWithSentinel.removeNodeByIndex(1);  // 4, 3, 5

        assertThat(doubleLinkedListWithSentinel.findValueWithIndex(0)).isEqualTo(4);
    }

    @Test
    public void removeLastIndex() {
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 5);
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 3);
        doubleLinkedListWithSentinel.insertNewNodeByIndex(1, 2);
        doubleLinkedListWithSentinel.addFirst(4);

        doubleLinkedListWithSentinel.removeNodeByIndex(3);  // 4, 3, 2, 5

        assertThat(doubleLinkedListWithSentinel.findValueWithIndex(0)).isEqualTo(4);
        assertThat(doubleLinkedListWithSentinel.findValueWithIndex(2)).isEqualTo(2);
    }

    @Test
    public void removeIndexNotFoundShouldThrowException() {
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 5);
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 3);
        doubleLinkedListWithSentinel.insertNewNodeByIndex(1, 2);
        doubleLinkedListWithSentinel.addFirst(4); // 4, 3, 2, 5

        assertThatThrownBy(() -> doubleLinkedListWithSentinel.removeNodeByIndex(5))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Node not found with index{5}");
    }

    @Test
    public void removeTailNodeShouldThrowException() {
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 5);
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 3);
        doubleLinkedListWithSentinel.insertNewNodeByIndex(1, 2);
        doubleLinkedListWithSentinel.addFirst(4); // 4, 3, 2, 5

        assertThatThrownBy(() -> doubleLinkedListWithSentinel.removeNodeByIndex(4))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Node not found with index{4}");
    }


    @Test
    public void removeFirstTest() {
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 5);
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 3);
        doubleLinkedListWithSentinel.insertNewNodeByIndex(1, 2);
        doubleLinkedListWithSentinel.addFirst(4); // 4, 3, 2, 5

        doubleLinkedListWithSentinel.removeFirst();
        doubleLinkedListWithSentinel.removeFirst();

        assertThat(doubleLinkedListWithSentinel.findValueWithIndex(0)).isEqualTo(2);
    }

    @Test
    public void removeFirstShouldThrowException() {
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 5);

        doubleLinkedListWithSentinel.removeFirst();

        assertThatThrownBy(() -> doubleLinkedListWithSentinel.removeNodeByIndex(0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Node not found with index{0}");
    }

    @Test
    public void addLast() {
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 5);
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 3);

        doubleLinkedListWithSentinel.addLast(2);

        assertThat(doubleLinkedListWithSentinel.findValueWithIndex(2)).isEqualTo(2);
    }


    @Test
    public void removeLastNodeTest() {
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 5);
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 3);
        doubleLinkedListWithSentinel.insertNewNodeByIndex(1, 2);
        doubleLinkedListWithSentinel.addFirst(4); // 4, 3, 2, 5

        doubleLinkedListWithSentinel.removeLastNode();
        doubleLinkedListWithSentinel.removeLastNode();
        doubleLinkedListWithSentinel.removeLastNode();

        assertThat(doubleLinkedListWithSentinel.findValueWithIndex(0)).isEqualTo(4);
    }

    @Test
    public void removeLastNodeShouldThrowExceptionTest() {
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 5);

        doubleLinkedListWithSentinel.removeLastNode();

        assertThatThrownBy(() -> doubleLinkedListWithSentinel.removeLastNode())
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Node not found or could not delete");
    }

    @Test
    public void iteratorTest() {
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 5);
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 4);
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 3);
        doubleLinkedListWithSentinel.insertNewNodeByIndex(2, 1);

        assertIterableEquals(List.of(3, 4, 1,5), doubleLinkedListWithSentinel);
    }

    @Test
    public void whileLoopTest() {
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 5);
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 4);
        doubleLinkedListWithSentinel.insertNewNodeByIndex(0, 3);
        doubleLinkedListWithSentinel.insertNewNodeByIndex(2, 1);

        assertIterableEquals(List.of(3, 4, 1,5), doubleLinkedListWithSentinel);

        doubleLinkedListWithSentinel.whileLoopNodes(System.out::println);
    }



}