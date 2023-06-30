package com.uyghur.java.algo.single_recursion_280623;

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
 * head -> elt4 -> elt3 -> elt2 -> elt1
 */
public class SingleLinkedListWithRecursion implements Iterable<Integer> {

    private Node head = null;

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
        head = new Node(value, head); // head is null when SingleLinkedList is initialized
    }

    public void whileLoop() {
        Node pointer = head;

        while (pointer != null) {
            System.out.println(pointer.value);
            pointer = pointer.next;
        }
    }

    public void whileLoopWithConsumer(Consumer<Integer> consumer) {
        Node pointer = head;

        while (pointer != null) {
            consumer.accept(pointer.value);
            pointer = pointer.next;
        }
    }

    public void forLoopWithConsumer(Consumer<Integer> consumer) {
        for (Node pointer = head; pointer != null; pointer = pointer.next) {
            consumer.accept(pointer.value);
        }
    }

    public void loopWithRecursion() {
        recursionMethod(head);
    }

    public void recursionMethod(Node current) {
        if (current == null) {
            return;
        }
        System.out.println(current.value);
        recursionMethod(current.next);
    }

    /**
     * logic :  n1 -> n2 -> n3
     * if public void f(Node node) {
     *      if(node == null) {
     *      return;
     * }
     *      print(before: node.value);
     *      f(node.next);
     *      print(after: node.value)
     * }
     */
    /*
     void f(n1) {
      print(before: n1.value); // 1
        void f(n2) {
        print(before: n2.value); // 2
            void f(n3) {
            print(before: n3.value); // 3
                void f(null) {
                    if(node == null) {
                        return;
                    }
                }
                 print(after: n3.value) // 3
            }
            print(after: n2.value) // 2
         }
       print(after: n1.value) // 1
     }
     */
    public void loopWithRecursionBeforeAndAfter() {
        recursionMethodWithBeforeAndAfter(head);
    }

    public void recursionMethodWithBeforeAndAfter(Node current) {
        if (current == null) {
            return;
        }
        System.out.println("Before: " + current.value);
        recursionMethodWithBeforeAndAfter(current.next);
        System.out.println("After: " + current.value);
    }

    public void loopWithRecursionBeforeAndAfterWithConsumer(Consumer<Integer> before, Consumer<Integer> after) {
        recursionMethodWithBeforeAndAfterWithConsumer(head, before, after);
    }

    public void recursionMethodWithBeforeAndAfterWithConsumer(Node current, Consumer<Integer> before, Consumer<Integer> after) {
        if (current == null) {
            return;
        }
        before.accept(current.value);
        recursionMethodWithBeforeAndAfterWithConsumer(current.next, before, after);
        after.accept(current.value);

    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            Node pointer = head;

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
        if (head == null) { // SingleLinkedList is empty
            return null;
        }

        Node pointer;

        pointer = head;
        while (pointer.next != null) {
            pointer = pointer.next;
        }

        return pointer;
    }

    public void addLast(int value) {

        Node lastElt = findLastPointer();

        if (lastElt == null) {
            addFirst(value);
            return;
        }

        lastElt.next = new Node(value, null);
    }

    private Node findNodeByIndex(int indexSearching) {
        int index = 0;

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
        if (index == 0) {
            addFirst(value);
            return;
        }
        Node nodePrevious = findNodeByIndex(index - 1);

        if (nodePrevious == null) {
            throw new IllegalArgumentException("Index {%d} not found".formatted(index));
        }

        nodePrevious.next = new Node(value, nodePrevious.next); // before : p2 --> 3, after p2 -> 5 and p5 -> 3

    }

    public void removeFirstNode() {
        if (head == null) {
            throw new IllegalArgumentException("Could not remove index {0}");
        }
        head = head.next;
    }


    public void removeByIndex(int index) {
        if (index == 0) {
            removeFirstNode();
            return;
        }
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
