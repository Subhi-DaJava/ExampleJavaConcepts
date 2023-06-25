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

@ExtendWith(MockitoExtension.class)
class SingleLinkedListTest {

    @InjectMocks
    private SingleLinkedList singleLinkedList;


    @Test
    @DisplayName("addFirstAndWhileLoop")
    public void addFirstAndWhileLoopTest() {
        singleLinkedList.addFirst(1);
        singleLinkedList.addFirst(2);
        singleLinkedList.addFirst(3);
        singleLinkedList.addFirst(4);

        singleLinkedList.whileLoop(); // 4 3 2 1
        assertIterableEquals(List.of(4,3,2,1), singleLinkedList);
    }


    @Test
    public void addFirstAndWhileLoopWithConsumerTest() {
        singleLinkedList.addFirst(1);
        singleLinkedList.addFirst(2);
        singleLinkedList.addFirst(3);
        singleLinkedList.addFirst(4);

        singleLinkedList.whileLoopWithConsumer(System.out::println); // 4 3 2 1
        //singleLinkedList.whileLoopWithConsumer(value -> System.out.println(value)); // 4 3 2 1
        assertIterableEquals(List.of(4,3,2,1), singleLinkedList);
    }

    @Test
    public void addFirstAndWhileForWithConsumerTest() {
        singleLinkedList.addFirst(1);
        singleLinkedList.addFirst(2);
        singleLinkedList.addFirst(3);
        singleLinkedList.addFirst(4);

        singleLinkedList.forLoopWithConsumer(System.out::println); // 4 3 2 1
        //singleLinkedList.forLoopWithConsumer(value -> System.out.println(value)); // 4 3 2 1
        assertIterableEquals(List.of(4,3,2,1), singleLinkedList);
    }

    @Test
    public void addFirstAndWhileIteratorTest() {
        singleLinkedList.addFirst(1);
        singleLinkedList.addFirst(2);
        singleLinkedList.addFirst(3);
        singleLinkedList.addFirst(4);
        singleLinkedList.addFirst(5);

        for (Integer elt: singleLinkedList) {
            System.out.println(elt);
        }

        assertIterableEquals(List.of(5,4,3,2,1), singleLinkedList);
    }

    @Test
    public void addLastAndFindLastEltTest() {
        singleLinkedList.addLast(1);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(3);
        singleLinkedList.addLast(4);
        singleLinkedList.addLast(5);

        for (Integer elt: singleLinkedList) {
            System.out.println(elt);
        }

        assertIterableEquals(List.of(1,2,3,4,5), singleLinkedList);
    }

    @Test
    public void findValueByIndex() {
        singleLinkedList.addLast(1);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(3);
        singleLinkedList.addLast(4);
        singleLinkedList.addLast(5);

        assertThat(singleLinkedList.findValueByNodeIndex(2)).isEqualTo(3);
    }

    @Test
    @DisplayName("Throw IllegalArgument Exception")
    public void valueNotFoundByIndex() {
        singleLinkedList.addLast(1);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(3);
        singleLinkedList.addLast(4);
        singleLinkedList.addLast(5);

        assertThatThrownBy(() -> singleLinkedList.findValueByNodeIndex(6))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Index {6} not found");
    }

    @Test
    @DisplayName("Insert new Node between the first and last index")
    public void insertNewNodeBetweenFirstAndLastIndex() {
        singleLinkedList.addLast(1);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(3);
        singleLinkedList.addLast(4);
        singleLinkedList.addLast(5);

        singleLinkedList.insertNewNodeAtGivenIndex(2, 22);

        assertThat(singleLinkedList.findValueByNodeIndex(2)).isEqualTo(22);
        assertThat(singleLinkedList.findValueByNodeIndex(5)).isEqualTo(5);
    }

    @Test
    @DisplayName("Insert new Node at first index")
    public void insertNewNodeAtFirstIndex() {
        singleLinkedList.addLast(1);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(3);
        singleLinkedList.addLast(4);
        singleLinkedList.addLast(5);

        singleLinkedList.insertNewNodeAtGivenIndex(0, 100);

        assertThat(singleLinkedList.findValueByNodeIndex(0)).isEqualTo(100);
        assertThat(singleLinkedList.findValueByNodeIndex(5)).isEqualTo(5);
    }

    @Test
    @DisplayName("Insert new Node at last index")
    public void insertNewNodeAtLastIndex() {
        singleLinkedList.addLast(1);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(3);
        singleLinkedList.addLast(4);
        singleLinkedList.addLast(5);

        singleLinkedList.insertNewNodeAtGivenIndex(5, 6);

        assertThat(singleLinkedList.findValueByNodeIndex(5)).isEqualTo(6);
    }

    @Test
    @DisplayName("Throw IllegalArgument Exception")
    public void insertNewNodeShouldThrowException() {
        singleLinkedList.addLast(1);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(3);
        singleLinkedList.addLast(4);
        singleLinkedList.addLast(5);

        assertThatThrownBy(() -> singleLinkedList.insertNewNodeAtGivenIndex(10, 6))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Index {10} not found");
    }


    @Test
    @DisplayName("Remove Node at first index")
    public void removeFirstNode() {
        singleLinkedList.addLast(1);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(3);
        singleLinkedList.addLast(4);
        singleLinkedList.addLast(5);

        singleLinkedList.removeFirstNode();

        assertIterableEquals(List.of(2,3,4,5), singleLinkedList);
    }

    @Test
    @DisplayName("Remove Node at first index")
    public void removeFirstNodeShouldThrowException() {
       assertThatThrownBy(() -> singleLinkedList.removeFirstNode())
               .isInstanceOf(IllegalArgumentException.class)
               .hasMessageContaining("Could not remove index {0}");
    }


    @Test
    @DisplayName("Remove Node at index 0")
    public void removeNodeByIndex0() {
        singleLinkedList.addLast(1);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(3);
        singleLinkedList.addLast(4);
        singleLinkedList.addLast(5);

        singleLinkedList.removeByIndex(0);

        assertIterableEquals(List.of(2,3,4,5), singleLinkedList);
    }

    @Test
    @DisplayName("Previous Node Not Found")
    public void removeNodeByIndexShouldThrowExceptionForNotFoundPreviousNode() {
        singleLinkedList.addLast(1);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(3);
        singleLinkedList.addLast(4);
        singleLinkedList.addLast(5);


        assertThatThrownBy(() -> singleLinkedList.removeByIndex(8))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Index {8} not found");
    }

    @Test
    @DisplayName("Removed Node Not Found")
    public void removeNodeByIndexShouldThrowExceptionForNotFoundRemovedNode() {
        singleLinkedList.addLast(1);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(3);
        singleLinkedList.addLast(4);
        singleLinkedList.addLast(5);


        assertThatThrownBy(() -> singleLinkedList.removeByIndex(5))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Index {5} not found");
    }

    @Test
    @DisplayName("Removed Node at the index 3")
    public void removeNodeByIndex() {
        singleLinkedList.addLast(1);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(3);
        singleLinkedList.addLast(4);
        singleLinkedList.addLast(5);

        singleLinkedList.removeByIndex(3);

        assertIterableEquals(List.of(1,2,3,5), singleLinkedList);
    }
}