package com.uyghur.java.algo.linkend_list_250623.single_linked_list;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Single chain
 * addFirst method
 * addLast method
 * findNodeByIndex method
 * findLastPointer method
 * findValueByNodeIndex method
 * removeFirst method
 * removeByIndex method
 * head -> sentinel -> elt4 -> elt3 -> elt2 -> elt1
 */
public class SingleLinkedListWithSentinel implements Iterable<Integer> {

    private Node head = new Node(1211, null);

    private static class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void addFirst(int value) { // head -> elt1
        // SingleLinkedList is empty
        // head = new Node(value, null);

        // SingleLinkedList is not empty // head -> elt2(new added) -> elt1
        //head = new Node(value, head); // head is null when SingleLinkedList is initialized

        insertNewNodeAtGivenIndex(0, value);
    }

    public void whileLoop() {
        Node pointer = head.next;

        while (pointer != null) {
            System.out.println(pointer.value);
            pointer = pointer.next;
        }
    }

    public void whileLoopWithConsumer(Consumer<Integer> consumer) {
        Node pointer = head.next;

        while (pointer != null) {
            consumer.accept(pointer.value);
            pointer = pointer.next;
        }
    }

    public void forLoopWithConsumer(Consumer<Integer> consumer) {
        for (Node pointer = head.next; pointer != null; pointer = pointer.next) {
            consumer.accept(pointer.value);
        }
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            Node pointer = head.next;

            @Override
            public boolean hasNext() {
                return pointer != null;
            }

            @Override
            public Integer next() {
                int value = pointer.value;
                pointer = pointer.next;
                return value;
            }
        };
    }

    private Node findLastPointer() {

        Node pointer;

        pointer = head;

        while (pointer.next != null) {
            pointer = pointer.next;
        }

        return pointer;
    }

    public void addLast(int value) {

        Node lastElt = findLastPointer();

        lastElt.next = new Node(value, null);
    }

    private Node findNodeByIndex(int indexSearching) {
        // int index = 0;
        int index = -1; // start from sentinel

        for (Node pointer = head; pointer != null; pointer = pointer.next, index++) {
            if (indexSearching == index) {
                return pointer;
            }
        }

        return null;
    }

    public int findValueByNodeIndex(int index) {
        Node node = findNodeByIndex(index);
        if (node == null) {
            throw new IllegalArgumentException("Index {%d} not found".formatted(index));
        }
        return node.value;
    }

    /*
        cases: index = 0, lastIndex or other index
        1 -> 2 -> 3 -> 4  --> 1 -> 2 -> 5 -> 3 -> 4
     */
    public void insertNewNodeAtGivenIndex(int index, int value) {

        Node nodePrevious = findNodeByIndex(index - 1);

        if (nodePrevious == null) {
            throw new IllegalArgumentException("Index {%d} not found".formatted(index));
        }

        nodePrevious.next = new Node(value, nodePrevious.next); // before : p2 --> 3, after p2 -> 5 and p5 -> 3

    }

    public void removeFirstNode() {
       removeByIndex(0);
    }


    public void removeByIndex(int index) {
        Node nodePrevious = findNodeByIndex(index - 1); // head -> 1 -> 2 -> 3 -> 4, delete 3, index 2
        if (nodePrevious == null) {
            throw new IllegalArgumentException("Index {%d} not found".formatted(index));
        }
        Node nodeRemoved = nodePrevious.next;  // p2 -> 3, p3 -> p4
        if (nodeRemoved == null) {
            throw new IllegalArgumentException("Index {%d} not found".formatted(index));
        }
        nodePrevious.next = nodeRemoved.next; // head -> 1 -> 2 -> 4, delete 3, index 2
    }

}
