package com.uyghur.java.algo.queue_310723;

import java.util.Iterator;

/**
 * head -> sentinel -> head  tail -> sentinel
 *
 * head -> sentinel -> value1 -> sentinel tail -> value1
 *
 * head -> sentinel -> value2 -> value1 -> sentinel tail -> value2
 * @param <T>
 */
public class LinkedListQueue<T> implements Queue<T>, Iterable<T> {

    private Node<T> head = new Node<>(null, null);  // at first: point to sentinel

    private Node<T> tail = head; // at first: point to sentinel

    public int getSize() {
        return size;
    }


    public int getCapacity() {
        return capacity;
    }

    private int size;
    private int capacity = Integer.MAX_VALUE;

    public LinkedListQueue() {
        this.tail.next = head;
    }

    public LinkedListQueue(int capacity) {
        this.tail.next = head;
        this.capacity = capacity;
    }

    public static class Node<T> {
        T value;
        Node<T> next;

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }

    /**
     * Inserts the specified element into this queue.
     * @param value T
     * @return boolean
     */
    @Override
    public boolean offer(T value) {
        if(isFull()) {
            return false;
        }
        final Node<T> nodeAdded = new Node<>(value, head);
        tail.next = nodeAdded;
        tail = nodeAdded;
        size++;
        return true;
    }

    @Override
    public T poll() {
        if (isEmpty()) {
            return null;
        }
        Node<T> firstNode = head.next;
        head.next = firstNode.next;

        if (firstNode == tail) {
            head = tail;
        }
        size--;
        return firstNode.value;
    }


    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        Node<T> firstNode = head.next;
        return firstNode.value;
    }

    @Override
    public boolean isFull() {
        return size == capacity;
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            Node<T> pointer = head.next;
            @Override
            public boolean hasNext() {
                return pointer != head;
            }

            @Override
            public T next() {
                T value = pointer.value;
                pointer = pointer.next;
                return value;
            }
        };
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }
}
