package com.uyghur.java.algo.linkend_list_250623.circular_linked_list;

import java.util.Iterator;

/**
 * Single Circular Linked List : head -> 1 -> 2 -> 3 -> head
 * Double Circular Linked List : head <--> 1 <--> 2 <--> 3 <--> head
 */
public class DoubleCircularLinkedList implements Iterable<Integer> {
    private final Node sentinel = new Node(null, 111, null);

    public DoubleCircularLinkedList() {
        sentinel.previous = sentinel;
        sentinel.next = sentinel;
    }


    private static class Node {
        Node previous;
        int value;
        Node next;

        public Node(Node previous, int value, Node next) {
            this.previous = previous;
            this.value = value;
            this.next = next;
        }
    }

    // 1) s <--> 1 <--> 2 <--> 3 <--> s  2) s <--> s
    public void addFirst(int value) {
        Node previous = sentinel;
        Node next = sentinel.next;

        Node nodeAdded = new Node(previous, value, next);

        previous.next = nodeAdded;
        next.previous = nodeAdded;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node pointer = sentinel.next;

            @Override
            public boolean hasNext() {
                return pointer != sentinel;
            }

            @Override
            public Integer next() {
                int value = pointer.value;
                pointer = pointer.next;
                return value;
            }
        };
    }

    public void addLast(int value) {
        Node previous = sentinel.previous;
        Node nodeAdded = new Node(previous, value, sentinel);
        previous.next = nodeAdded;
        sentinel.previous = nodeAdded;
    }

    public void removeFirst() {
        Node removed = sentinel.next;
        if (removed == sentinel) {
            throw new RuntimeException("bad operation");
        }

        Node next = removed.next;

        sentinel.next = next;
        next.previous = sentinel;
    }

    public void removeLast() {
        Node nodeRemoved = sentinel.previous;

        if (nodeRemoved == sentinel) {
            throw new RuntimeException("bad operation");
        }
        Node previous = nodeRemoved.previous;

        previous.next = sentinel;

        sentinel.previous = previous;
    }

    public void removeNodeByNodeValue(int value) {
        Node nodeRemoved = findNodeByNodeValue(value);
        if (nodeRemoved == null) {
            throw new RuntimeException("Node Not found");
        }

        Node previous = nodeRemoved.previous;
        Node next = nodeRemoved.next;

        previous.next = next;
        next.previous = previous;
    }

    private Node findNodeByNodeValue(int value) {
        Node pointer = sentinel.next;

        while (pointer != sentinel) {
            if (pointer.value == value) {
                return pointer;
            }
            pointer = pointer.next;
        }

        return null;
    }

}
