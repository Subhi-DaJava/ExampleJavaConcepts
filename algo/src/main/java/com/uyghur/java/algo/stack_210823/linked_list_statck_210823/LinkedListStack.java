package com.uyghur.java.algo.stack_210823.linked_list_statck_210823;

import com.uyghur.java.algo.stack_210823.stack_interface_210823.Stack;

import java.util.Iterator;

/**
 *  head -> 1 -> 2 -> null
 *  add 3 -> 1 -> 2 -> null
 *  head
 * @param <T>
 */
public class LinkedListStack<T> implements Stack<T>, Iterable<T> {
    private final int capacity;
    private int size;

    private final Node<T> head = new Node<>(null, null);

    public LinkedListStack(int capacity) {
        this.capacity = capacity;
    }

    static class Node<T> {
        T value;
        Node<T> next;

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }

    @Override
    public boolean push(T value) {
        if (isFull()) {
            return false;
        }

        head.next = new Node<>(value, head.next);
        size++;
        return true;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        Node<T> firstElt = head.next;

        head.next = firstElt.next;
        size--;

        return firstElt.value;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }

        Node<T> firstElt = head.next;

        return firstElt.value;
    }

    @Override
    public boolean isEmpty() {

        return head.next == null || this.size == 0;
    }

    @Override
    public boolean isFull() {
        return this.size == this.capacity;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> pointer = head.next;
            @Override
            public boolean hasNext() {
                return pointer != null;
            }

            @Override
            public T next() {
                T value = pointer.value;
                pointer = pointer.next;
                return value;
            }
        };
    }
}
