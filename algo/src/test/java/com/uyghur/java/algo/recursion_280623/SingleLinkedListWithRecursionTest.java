package com.uyghur.java.algo.recursion_280623;


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
class SingleLinkedListWithRecursionTest {

    @InjectMocks
    private SingleLinkedListWithRecursion singleLinkedListWithRecursion;


    @Test
    @DisplayName("addFirstAndWhileLoop")
    public void addFirstAndWhileLoopTest() {
        singleLinkedListWithRecursion.addFirst(1);
        singleLinkedListWithRecursion.addFirst(2);
        singleLinkedListWithRecursion.addFirst(3);
        singleLinkedListWithRecursion.addFirst(4);

        singleLinkedListWithRecursion.whileLoop(); // 4 3 2 1
        assertIterableEquals(List.of(4,3,2,1), singleLinkedListWithRecursion);
    }


    @Test
    public void addFirstAndWhileLoopWithConsumerTest() {
        singleLinkedListWithRecursion.addFirst(1);
        singleLinkedListWithRecursion.addFirst(2);
        singleLinkedListWithRecursion.addFirst(3);
        singleLinkedListWithRecursion.addFirst(4);

        singleLinkedListWithRecursion.whileLoopWithConsumer(System.out::println); // 4 3 2 1
        //singleLinkedList.whileLoopWithConsumer(value -> System.out.println(value)); // 4 3 2 1
        assertIterableEquals(List.of(4,3,2,1), singleLinkedListWithRecursion);
    }

    @Test
    public void addFirstAndWhileForWithConsumerTest() {
        singleLinkedListWithRecursion.addFirst(1);
        singleLinkedListWithRecursion.addFirst(2);
        singleLinkedListWithRecursion.addFirst(3);
        singleLinkedListWithRecursion.addFirst(4);

        singleLinkedListWithRecursion.forLoopWithConsumer(System.out::println); // 4 3 2 1
        //singleLinkedList.forLoopWithConsumer(value -> System.out.println(value)); // 4 3 2 1
        assertIterableEquals(List.of(4,3,2,1), singleLinkedListWithRecursion);
    }

    @Test
    public void addFirstAndWhileIteratorTest() {
        singleLinkedListWithRecursion.addFirst(1);
        singleLinkedListWithRecursion.addFirst(2);
        singleLinkedListWithRecursion.addFirst(3);
        singleLinkedListWithRecursion.addFirst(4);
        singleLinkedListWithRecursion.addFirst(5);

        for (Integer elt: singleLinkedListWithRecursion) {
            System.out.println(elt);
        }

        assertIterableEquals(List.of(5,4,3,2,1), singleLinkedListWithRecursion);
    }

    @Test
    public void addLastAndFindLastEltTest() {
        singleLinkedListWithRecursion.addLast(1);
        singleLinkedListWithRecursion.addLast(2);
        singleLinkedListWithRecursion.addLast(3);
        singleLinkedListWithRecursion.addLast(4);
        singleLinkedListWithRecursion.addLast(5);

        for (Integer elt: singleLinkedListWithRecursion) {
            System.out.println(elt);
        }

        assertIterableEquals(List.of(1,2,3,4,5), singleLinkedListWithRecursion);
    }

    @Test
    public void findValueByIndex() {
        singleLinkedListWithRecursion.addLast(1);
        singleLinkedListWithRecursion.addLast(2);
        singleLinkedListWithRecursion.addLast(3);
        singleLinkedListWithRecursion.addLast(4);
        singleLinkedListWithRecursion.addLast(5);

        assertThat(singleLinkedListWithRecursion.findValueByNodeIndex(2)).isEqualTo(3);
    }

    @Test
    @DisplayName("Throw IllegalArgument Exception")
    public void valueNotFoundByIndex() {
        singleLinkedListWithRecursion.addLast(1);
        singleLinkedListWithRecursion.addLast(2);
        singleLinkedListWithRecursion.addLast(3);
        singleLinkedListWithRecursion.addLast(4);
        singleLinkedListWithRecursion.addLast(5);

        assertThatThrownBy(() -> singleLinkedListWithRecursion.findValueByNodeIndex(6))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Index {6} not found");
    }

    @Test
    @DisplayName("Insert new Node between the first and last index")
    public void insertNewNodeBetweenFirstAndLastIndex() {
        singleLinkedListWithRecursion.addLast(1);
        singleLinkedListWithRecursion.addLast(2);
        singleLinkedListWithRecursion.addLast(3);
        singleLinkedListWithRecursion.addLast(4);
        singleLinkedListWithRecursion.addLast(5);

        singleLinkedListWithRecursion.insertNewNodeAtGivenIndex(2, 22);

        assertThat(singleLinkedListWithRecursion.findValueByNodeIndex(2)).isEqualTo(22);
        assertThat(singleLinkedListWithRecursion.findValueByNodeIndex(5)).isEqualTo(5);
    }

    @Test
    @DisplayName("Insert new Node at first index")
    public void insertNewNodeAtFirstIndex() {
        singleLinkedListWithRecursion.addLast(1);
        singleLinkedListWithRecursion.addLast(2);
        singleLinkedListWithRecursion.addLast(3);
        singleLinkedListWithRecursion.addLast(4);
        singleLinkedListWithRecursion.addLast(5);

        singleLinkedListWithRecursion.insertNewNodeAtGivenIndex(0, 100);

        assertThat(singleLinkedListWithRecursion.findValueByNodeIndex(0)).isEqualTo(100);
        assertThat(singleLinkedListWithRecursion.findValueByNodeIndex(5)).isEqualTo(5);
    }

    @Test
    @DisplayName("Insert new Node at last index")
    public void insertNewNodeAtLastIndex() {
        singleLinkedListWithRecursion.addLast(1);
        singleLinkedListWithRecursion.addLast(2);
        singleLinkedListWithRecursion.addLast(3);
        singleLinkedListWithRecursion.addLast(4);
        singleLinkedListWithRecursion.addLast(5);

        singleLinkedListWithRecursion.insertNewNodeAtGivenIndex(5, 6);

        assertThat(singleLinkedListWithRecursion.findValueByNodeIndex(5)).isEqualTo(6);
    }

    @Test
    @DisplayName("Throw IllegalArgument Exception")
    public void insertNewNodeShouldThrowException() {
        singleLinkedListWithRecursion.addLast(1);
        singleLinkedListWithRecursion.addLast(2);
        singleLinkedListWithRecursion.addLast(3);
        singleLinkedListWithRecursion.addLast(4);
        singleLinkedListWithRecursion.addLast(5);

        assertThatThrownBy(() -> singleLinkedListWithRecursion.insertNewNodeAtGivenIndex(10, 6))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Index {10} not found");
    }


    @Test
    @DisplayName("Remove Node at first index")
    public void removeFirstNode() {
        singleLinkedListWithRecursion.addLast(1);
        singleLinkedListWithRecursion.addLast(2);
        singleLinkedListWithRecursion.addLast(3);
        singleLinkedListWithRecursion.addLast(4);
        singleLinkedListWithRecursion.addLast(5);

        singleLinkedListWithRecursion.removeFirstNode();

        assertIterableEquals(List.of(2,3,4,5), singleLinkedListWithRecursion);
    }

    @Test
    @DisplayName("Remove Node at first index")
    public void removeFirstNodeShouldThrowException() {
       assertThatThrownBy(() -> singleLinkedListWithRecursion.removeFirstNode())
               .isInstanceOf(IllegalArgumentException.class)
               .hasMessageContaining("Could not remove index {0}");
    }


    @Test
    @DisplayName("Remove Node at index 0")
    public void removeNodeByIndex0() {
        singleLinkedListWithRecursion.addLast(1);
        singleLinkedListWithRecursion.addLast(2);
        singleLinkedListWithRecursion.addLast(3);
        singleLinkedListWithRecursion.addLast(4);
        singleLinkedListWithRecursion.addLast(5);

        singleLinkedListWithRecursion.removeByIndex(0);

        assertIterableEquals(List.of(2,3,4,5), singleLinkedListWithRecursion);
    }

    @Test
    @DisplayName("Previous Node Not Found")
    public void removeNodeByIndexShouldThrowExceptionForNotFoundPreviousNode() {
        singleLinkedListWithRecursion.addLast(1);
        singleLinkedListWithRecursion.addLast(2);
        singleLinkedListWithRecursion.addLast(3);
        singleLinkedListWithRecursion.addLast(4);
        singleLinkedListWithRecursion.addLast(5);


        assertThatThrownBy(() -> singleLinkedListWithRecursion.removeByIndex(8))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Index {8} not found");
    }

    @Test
    @DisplayName("Removed Node Not Found")
    public void removeNodeByIndexShouldThrowExceptionForNotFoundRemovedNode() {
        singleLinkedListWithRecursion.addLast(1);
        singleLinkedListWithRecursion.addLast(2);
        singleLinkedListWithRecursion.addLast(3);
        singleLinkedListWithRecursion.addLast(4);
        singleLinkedListWithRecursion.addLast(5);


        assertThatThrownBy(() -> singleLinkedListWithRecursion.removeByIndex(5))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Index {5} not found");
    }

    @Test
    @DisplayName("Removed Node at the index 3")
    public void removeNodeByIndex() {
        singleLinkedListWithRecursion.addLast(1);
        singleLinkedListWithRecursion.addLast(2);
        singleLinkedListWithRecursion.addLast(3);
        singleLinkedListWithRecursion.addLast(4);
        singleLinkedListWithRecursion.addLast(5);

        singleLinkedListWithRecursion.removeByIndex(3);

        assertIterableEquals(List.of(1,2,3,5), singleLinkedListWithRecursion);
    }

    @Test
    @DisplayName("Loop with recursion")
    public void printNodeWithRecursionMethod() {
        singleLinkedListWithRecursion.addLast(1);
        singleLinkedListWithRecursion.addLast(2);
        singleLinkedListWithRecursion.addLast(3);
        singleLinkedListWithRecursion.addLast(4);
        singleLinkedListWithRecursion.addLast(5);

        singleLinkedListWithRecursion.loopWithRecursion();
    }

    @Test
    @DisplayName("Loop with recursionWithBeforeAndAfter")
    public void printNodeWithRecursionMethodWithBeforeAndAfter() {
        singleLinkedListWithRecursion.addLast(1);
        singleLinkedListWithRecursion.addLast(2);
        singleLinkedListWithRecursion.addLast(3);
        singleLinkedListWithRecursion.addLast(4);
        singleLinkedListWithRecursion.addLast(5);

        singleLinkedListWithRecursion.loopWithRecursionBeforeAndAfter();
    }

    @Test
    @DisplayName("Loop with recursionWithBeforeAndAfter with Consumer")
    public void printNodeWithRecursionMethodWithBeforeAndAfterAndWithConsumer() {
        singleLinkedListWithRecursion.addLast(1);
        singleLinkedListWithRecursion.addLast(2);
        singleLinkedListWithRecursion.addLast(3);
        singleLinkedListWithRecursion.addLast(4);
        singleLinkedListWithRecursion.addLast(5);

        singleLinkedListWithRecursion.loopWithRecursionBeforeAndAfterWithConsumer(System.out::println,
                System.out::println);


        singleLinkedListWithRecursion.loopWithRecursionBeforeAndAfterWithConsumer(
                v1 -> System.out.println("Before: " + v1),
                v2 -> System.out.println("After: " + v2)
        );
    }
}