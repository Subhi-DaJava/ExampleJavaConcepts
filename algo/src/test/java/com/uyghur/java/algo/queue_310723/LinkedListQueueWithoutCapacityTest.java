package com.uyghur.java.algo.queue_310723;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
@ExtendWith(MockitoExtension.class)
class LinkedListQueueWithoutCapacityTest {

    @InjectMocks
    private LinkedListQueueWithoutCapacity<Integer> linkedListQueueWithoutCapacityInteger;

    @BeforeEach
    public void setUp() {
        linkedListQueueWithoutCapacityInteger = new LinkedListQueueWithoutCapacity<>();
    }
    @Test
    void offer() {
        linkedListQueueWithoutCapacityInteger.offer(1);
        linkedListQueueWithoutCapacityInteger.offer(2);
        linkedListQueueWithoutCapacityInteger.offer(3);
        linkedListQueueWithoutCapacityInteger.offer(4);
        linkedListQueueWithoutCapacityInteger.offer(5);
        linkedListQueueWithoutCapacityInteger.offer(6);
        linkedListQueueWithoutCapacityInteger.offer(7);
        linkedListQueueWithoutCapacityInteger.offer(8);
        linkedListQueueWithoutCapacityInteger.offer(9);

        assertIterableEquals(linkedListQueueWithoutCapacityInteger, List.of(1,2,3,4,5,6,7,8,9));
        assertThat(linkedListQueueWithoutCapacityInteger.offer(10)).isTrue();
        assertThat(linkedListQueueWithoutCapacityInteger.offer(10)).isTrue();
    }

    @Test
    void pollShouldReturnNull() {
        linkedListQueueWithoutCapacityInteger = new LinkedListQueueWithoutCapacity<>();
        assertThat(linkedListQueueWithoutCapacityInteger.poll()).isNull();
    }

    @Test
    void pollShouldReturnANodeValide() {
        linkedListQueueWithoutCapacityInteger.offer(1);
        assertThat(linkedListQueueWithoutCapacityInteger.poll()).isEqualTo(1);

        linkedListQueueWithoutCapacityInteger.offer(2);
        assertThat(linkedListQueueWithoutCapacityInteger.poll()).isEqualTo(2);

        linkedListQueueWithoutCapacityInteger.offer(3);

        assertThat(linkedListQueueWithoutCapacityInteger.poll()).isEqualTo(3);
        linkedListQueueWithoutCapacityInteger.offer(4);

        assertThat(linkedListQueueWithoutCapacityInteger.poll()).isEqualTo(4);

        assertThat(linkedListQueueWithoutCapacityInteger.poll()).isNull();
    }

    @Test
    void pollShouldReturnANodeValideWithOnlyOneNode() {
        linkedListQueueWithoutCapacityInteger.offer(1);
        assertThat(linkedListQueueWithoutCapacityInteger.poll()).isEqualTo(1);

        assertThat(linkedListQueueWithoutCapacityInteger.poll()).isNull();
        assertThat(linkedListQueueWithoutCapacityInteger.getHead()).isEqualTo(linkedListQueueWithoutCapacityInteger.getTail());
    }

    @Test
    void pollShouldReturnANodeValideWithSomeNodes() {
        linkedListQueueWithoutCapacityInteger.offer(1);
        linkedListQueueWithoutCapacityInteger.offer(2);
        linkedListQueueWithoutCapacityInteger.offer(3);
        linkedListQueueWithoutCapacityInteger.offer(4);
        linkedListQueueWithoutCapacityInteger.offer(5);
        linkedListQueueWithoutCapacityInteger.offer(6);

        assertThat(linkedListQueueWithoutCapacityInteger.poll()).isEqualTo(1);
        assertThat(linkedListQueueWithoutCapacityInteger.poll()).isEqualTo(2);
        assertThat(linkedListQueueWithoutCapacityInteger.poll()).isEqualTo(3);
        assertThat(linkedListQueueWithoutCapacityInteger.poll()).isEqualTo(4);
        assertThat(linkedListQueueWithoutCapacityInteger.poll()).isEqualTo(5);
        assertThat(linkedListQueueWithoutCapacityInteger.poll()).isEqualTo(6);
        assertThat(linkedListQueueWithoutCapacityInteger.getHead()).isEqualTo(linkedListQueueWithoutCapacityInteger.getTail());
        assertThat(linkedListQueueWithoutCapacityInteger.poll()).isNull();
    }

    @Test
    void peek() {
        linkedListQueueWithoutCapacityInteger.offer(1);
        assertThat(linkedListQueueWithoutCapacityInteger.peek()).isEqualTo(1);

        linkedListQueueWithoutCapacityInteger.offer(2);
        assertThat(linkedListQueueWithoutCapacityInteger.peek()).isEqualTo(1);

        linkedListQueueWithoutCapacityInteger.offer(3);
        assertThat(linkedListQueueWithoutCapacityInteger.peek()).isEqualTo(1);

        linkedListQueueWithoutCapacityInteger.offer(4);
        assertThat(linkedListQueueWithoutCapacityInteger.peek()).isEqualTo(1);

    }

    @Test
    void isEmptyShouldReturnTrue() {
        linkedListQueueWithoutCapacityInteger = new LinkedListQueueWithoutCapacity<>();
        assertThat(linkedListQueueWithoutCapacityInteger.isEmpty()).isTrue();
    }

    @Test
    void isEmptyShouldReturnFalse() {
        linkedListQueueWithoutCapacityInteger = new LinkedListQueueWithoutCapacity<>();
        linkedListQueueWithoutCapacityInteger.setTail(new LinkedListQueueWithoutCapacity.Node<Integer>(1, null));
        LinkedListQueueWithoutCapacity.Node<Integer> firstNode = new LinkedListQueueWithoutCapacity.Node<>(1, linkedListQueueWithoutCapacityInteger.getHead());
        linkedListQueueWithoutCapacityInteger.getHead().next = firstNode;
        LinkedListQueueWithoutCapacity.Node<Integer> tail = linkedListQueueWithoutCapacityInteger.getTail();
        tail.next = firstNode;
        assertThat(linkedListQueueWithoutCapacityInteger.isEmpty()).isFalse();
        assertIterableEquals(linkedListQueueWithoutCapacityInteger, List.of(1));

        for (Integer node : linkedListQueueWithoutCapacityInteger) {
            System.out.println(node.intValue());
        }
    }

    @Test
    void iterator() {
        linkedListQueueWithoutCapacityInteger = new LinkedListQueueWithoutCapacity<>();
        linkedListQueueWithoutCapacityInteger.setTail(new LinkedListQueueWithoutCapacity.Node<>(1, null));
        LinkedListQueueWithoutCapacity.Node<Integer> forthNode = new LinkedListQueueWithoutCapacity.Node<>(4, linkedListQueueWithoutCapacityInteger.getHead());
        LinkedListQueueWithoutCapacity.Node<Integer> thirdNode = new LinkedListQueueWithoutCapacity.Node<>(3, forthNode);
        LinkedListQueueWithoutCapacity.Node<Integer> secondeNode = new LinkedListQueueWithoutCapacity.Node<>(2, thirdNode);
        linkedListQueueWithoutCapacityInteger.getHead().next = new LinkedListQueueWithoutCapacity.Node<>(1, secondeNode);
        LinkedListQueueWithoutCapacity.Node<Integer> tail = linkedListQueueWithoutCapacityInteger.getTail();
        tail.next = forthNode;

        assertIterableEquals(linkedListQueueWithoutCapacityInteger, List.of(1,2,3,4));

    }
}