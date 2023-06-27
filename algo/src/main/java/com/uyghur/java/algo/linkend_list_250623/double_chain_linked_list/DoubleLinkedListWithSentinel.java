package com.uyghur.java.algo.linkend_list_250623.double_chain_linked_list;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Head -> <- tail
 */
public class DoubleLinkedListWithSentinel implements Iterable<Integer> {
    private final Node head; // start
    private final Node tail; // end

    public DoubleLinkedListWithSentinel() {
        this.head = new Node(null, 111, null);
        this.tail = new Node(null, 999, null);
        head.next = tail;
        tail.previous = head;
    }

    static class Node {
        Node previous;
        int value;
        Node next;

        public Node(Node previous, int value, Node next) {
            this.previous = previous;
            this.value = value;
            this.next = next;
        }
    }

    private Node findNodeByIndex(int index) {
        int i = -1;
        for (Node pointer = head; pointer != tail; pointer = pointer.next, i++) {
            if (i == index) {
                return pointer;
            }
        }
        return null;
    }

    public void insertNewNodeByIndex(int index, int value) {
        Node previous = findNodeByIndex(index - 1);
        if (previous == null) {
            throw new IllegalArgumentException("Node not found with index{%d}".formatted(index));
        }
        Node next = previous.next;

        Node nodeInserted = new Node(previous, value, next);

        previous.next = nodeInserted;
        next.previous = nodeInserted;

    }

    public void addFirst(int value) {
        insertNewNodeByIndex(0, value);
    }

    public int findValueWithIndex(int index) {
        int i = -1;
        for (Node pointer = head; pointer != tail; pointer = pointer.next, i++) {
            if (i == index) {
                return pointer.value;
            }
        }
        return -1;
    }

    public void removeNodeByIndex(int index) {
        Node nodePrevious = findNodeByIndex(index - 1);

        if (nodePrevious == null) {
            throw new IllegalArgumentException("Node not found with index{%d}".formatted(index));
        }
        Node nodeRemoved = nodePrevious.next;
        if (nodeRemoved == tail) {
            throw new IllegalArgumentException("Node not found with index{%d}".formatted(index));
        }

        Node nodeNext = nodeRemoved.next;

        nodePrevious.next = nodeNext;
        nodeNext.previous = nodePrevious;
    }

    public void removeFirst() {
        removeNodeByIndex(0);
    }

    public void addLast(int value) {

        Node lastNode = tail.previous;

        final Node nodeAdded = new Node(lastNode, value, tail);

        lastNode.next = nodeAdded;

    }

    public void removeLastNode() {
        Node removedNode = tail.previous;
        if (removedNode == head) {
            throw new IllegalArgumentException("Node not found or could not delete");
        }
        Node removedNodePrevious = removedNode.previous;

        tail.previous = removedNodePrevious;
        removedNodePrevious.next = tail;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            Node pointer = head.next;

            @Override
            public boolean hasNext() {
                return pointer != tail;
            }

            @Override
            public Integer next() {
                int value = pointer.value;
                pointer = pointer.next;
                return value;
            }
        };
    }

    public void whileLoopNodes(Consumer<Integer> consumer) {
        Node pointer = head.next;
        while (pointer != tail) {
            consumer.accept(pointer.value);
            pointer = pointer.next;
        }
    }
}
