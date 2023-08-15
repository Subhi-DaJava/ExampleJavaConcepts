package com.uyghur.java.algo.linkend_list_250623.single_linked_list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
class SingleLinkedListWithSentinelTest {
    @InjectMocks
    private SingleLinkedListWithSentinel singleLinkedListWithSentinel;

    @Test
    void addFirst() {
        singleLinkedListWithSentinel.addLast(1);
        singleLinkedListWithSentinel.addLast(2);
        singleLinkedListWithSentinel.addFirst(3);
        singleLinkedListWithSentinel.addFirst(4);

        assertIterableEquals(List.of(4,3,1,2), singleLinkedListWithSentinel);
    }

    @Test
    void addFirstWithEmptyNode() {
        singleLinkedListWithSentinel.addFirst(4);

        assertIterableEquals(List.of(4), singleLinkedListWithSentinel);
    }

    @Test
    void whileLoop() {
        singleLinkedListWithSentinel.addLast(1);
        singleLinkedListWithSentinel.addLast(2);
        singleLinkedListWithSentinel.addLast(3);
        singleLinkedListWithSentinel.addLast(4);
        singleLinkedListWithSentinel.addLast(5);

        singleLinkedListWithSentinel.whileLoop();

        assertIterableEquals(List.of(1,2,3,4,5), singleLinkedListWithSentinel);
    }

    @Test
    void whileLoopWithConsumer() {
        singleLinkedListWithSentinel.addLast(1);
        singleLinkedListWithSentinel.addLast(2);
        singleLinkedListWithSentinel.addLast(3);
        singleLinkedListWithSentinel.addLast(4);
        singleLinkedListWithSentinel.addLast(5);

        singleLinkedListWithSentinel.whileLoopWithConsumer(System.out::println);
        assertIterableEquals(List.of(1,2,3,4,5), singleLinkedListWithSentinel);

    }

    @Test
    void forLoopWithConsumer() {
        singleLinkedListWithSentinel.addLast(1);
        singleLinkedListWithSentinel.addLast(2);
        singleLinkedListWithSentinel.addLast(3);
        singleLinkedListWithSentinel.addLast(4);
        singleLinkedListWithSentinel.addLast(5);

        singleLinkedListWithSentinel.forLoopWithConsumer(System.out::println);
        assertIterableEquals(List.of(1,2,3,4,5), singleLinkedListWithSentinel);

    }

    @Test
    void iterator() {
        singleLinkedListWithSentinel.addLast(1);
        singleLinkedListWithSentinel.addLast(2);
        singleLinkedListWithSentinel.addLast(3);
        singleLinkedListWithSentinel.addLast(4);
        singleLinkedListWithSentinel.addLast(5);

        for (Integer elt: singleLinkedListWithSentinel) {
            System.out.println(elt);
        }

        assertIterableEquals(List.of(1,2,3,4,5), singleLinkedListWithSentinel);
    }

    @Test
    void addLast() {
        singleLinkedListWithSentinel.addLast(1);
        singleLinkedListWithSentinel.addLast(2);
        singleLinkedListWithSentinel.addLast(3);
        singleLinkedListWithSentinel.addLast(4);
        singleLinkedListWithSentinel.addLast(5);

        for (Integer elt: singleLinkedListWithSentinel) {
            System.out.println(elt);
        }

        assertIterableEquals(List.of(1,2,3,4,5), singleLinkedListWithSentinel);
    }

    @Test
    void findValueByNodeIndex() {
        singleLinkedListWithSentinel.addLast(1);
        singleLinkedListWithSentinel.addLast(2);
        singleLinkedListWithSentinel.addLast(3);
        singleLinkedListWithSentinel.addLast(4);
        singleLinkedListWithSentinel.addLast(5);

        assertThat(singleLinkedListWithSentinel.findValueByNodeIndex(2)).isEqualTo(3);
    }
    @Test
    void findValueNotFoundByNodeIndex() {
        singleLinkedListWithSentinel.addLast(1);
        singleLinkedListWithSentinel.addLast(2);
        singleLinkedListWithSentinel.addLast(3);
        singleLinkedListWithSentinel.addLast(4);
        singleLinkedListWithSentinel.addLast(5);

        //assertThat(singleLinkedListWithSentinel.findValueByNodeIndex(2)).isEqualTo(3);
        assertThatThrownBy(() -> singleLinkedListWithSentinel.findValueByNodeIndex(10))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Index {10} not found");
        assertThrows(IllegalArgumentException.class, ()-> singleLinkedListWithSentinel.findValueByNodeIndex(10));
    }

    @Test
    void insertNewNodeAtGivenIndexThrowException() {
        //assertThat(singleLinkedListWithSentinel.findValueByNodeIndex(1)).isEqualTo(5);
        assertThatThrownBy(() -> singleLinkedListWithSentinel.insertNewNodeAtGivenIndex(1,5))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Index {1} not found");
    }
    @Test
    @DisplayName("Insert all cases test")
    void insertNewNodeAtGivenIndexesThrowException() {
        singleLinkedListWithSentinel.insertNewNodeAtGivenIndex(0, 5);
        assertThat(singleLinkedListWithSentinel.findValueByNodeIndex(0)).isEqualTo(5);

        singleLinkedListWithSentinel.insertNewNodeAtGivenIndex(1, 4);
        assertThat(singleLinkedListWithSentinel.findValueByNodeIndex(1)).isEqualTo(4);

        singleLinkedListWithSentinel.insertNewNodeAtGivenIndex(2, 3);
        assertThat(singleLinkedListWithSentinel.findValueByNodeIndex(2)).isEqualTo(3);

        singleLinkedListWithSentinel.insertNewNodeAtGivenIndex(3, 2);
        assertThat(singleLinkedListWithSentinel.findValueByNodeIndex(3)).isEqualTo(2);

        singleLinkedListWithSentinel.insertNewNodeAtGivenIndex(4, 1);
        assertThat(singleLinkedListWithSentinel.findValueByNodeIndex(4)).isEqualTo(1);

        assertThatThrownBy(() -> singleLinkedListWithSentinel.insertNewNodeAtGivenIndex(6,5))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Index {6} not found");

        singleLinkedListWithSentinel.insertNewNodeAtGivenIndex(5, 0);
        assertThat(singleLinkedListWithSentinel.findValueByNodeIndex(5)).isEqualTo(0);

        singleLinkedListWithSentinel.insertNewNodeAtGivenIndex(1, 44);

        assertIterableEquals(List.of(5,44,4,3,2,1,0), singleLinkedListWithSentinel);

    }
    @Test
    void removeNodeByIndexWithAllCases() {
        singleLinkedListWithSentinel.addLast(1);
        singleLinkedListWithSentinel.addLast(2);
        singleLinkedListWithSentinel.addLast(3);
        singleLinkedListWithSentinel.addLast(4);
        singleLinkedListWithSentinel.addLast(5);

        singleLinkedListWithSentinel.removeByIndex(0);
        assertIterableEquals(List.of(2,3,4,5), singleLinkedListWithSentinel);

        singleLinkedListWithSentinel.removeByIndex(1);
        assertIterableEquals(List.of(2,4,5), singleLinkedListWithSentinel);

        singleLinkedListWithSentinel.removeByIndex(2);
        assertIterableEquals(List.of(2,4), singleLinkedListWithSentinel);

        assertThatThrownBy(() -> singleLinkedListWithSentinel.removeByIndex(3))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Index {3} not found");

        singleLinkedListWithSentinel.removeByIndex(0);
        assertIterableEquals(List.of(4), singleLinkedListWithSentinel);

        singleLinkedListWithSentinel.removeByIndex(0);
        assertIterableEquals(List.of(), singleLinkedListWithSentinel);

        assertThatThrownBy(() -> singleLinkedListWithSentinel.removeByIndex(0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Index {0} not found");
    }

    @Test
    void removeByIndex() {
        singleLinkedListWithSentinel.addLast(1);
        singleLinkedListWithSentinel.addLast(2);
        singleLinkedListWithSentinel.addLast(3);
        singleLinkedListWithSentinel.addLast(4);
        singleLinkedListWithSentinel.addLast(5);

        singleLinkedListWithSentinel.removeFirstNode();
        singleLinkedListWithSentinel.removeFirstNode();
        singleLinkedListWithSentinel.removeFirstNode();
        singleLinkedListWithSentinel.removeFirstNode();

        assertThat(singleLinkedListWithSentinel.findValueByNodeIndex(0)).isEqualTo(5);

        singleLinkedListWithSentinel.removeFirstNode();
        assertIterableEquals(List.of(), singleLinkedListWithSentinel);


        assertThatThrownBy(() -> singleLinkedListWithSentinel.removeFirstNode())
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Index {0} not found");
    }
}