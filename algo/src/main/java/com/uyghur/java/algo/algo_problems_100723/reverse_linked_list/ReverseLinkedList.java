package com.uyghur.java.algo.algo_problems_100723.reverse_linked_list;

import com.uyghur.java.algo.algo_problems_100723.ListNode;

/**
 * Reverse Linked List
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 * Input: head = []
 * Output: []
 * A linked list can be reversed either iteratively or recursively.
 */
public class ReverseLinkedList {

    // reverseLinkedList N1
    static ListNode reverseLinkedListN1(ListNode oldList) {

        ListNode newOne = null;

        ListNode pointer = oldList;

        while (pointer != null) {
            newOne = new ListNode(pointer.value, newOne);
            pointer = pointer.next;

        }

        return newOne;
    }

    // reverseLinkedList N2

    /**
     * 1 2 3 4 5 -> step 1 -> removeFirst 1 from oldList, add to newList -> removeFirst 2, addFirst to newList...
     *
     * @param head OldList
     * @return NewList
     */
    static ListNode reverseLinkedListN2(ListNode head) {
        List oldList = new List(head);
        List newList = new List(null);

        while (true) {
            ListNode firstNode = oldList.removeFirst();
            if (firstNode == null) {
                break;
            }
            newList.addFirst(firstNode);
        }
        return newList.head;
    }

    /**
     * with single recursion
     * reverseLinkedList(lastNode = 1) {
     *      reverseLinkedList(lastNode = 2) {
     *          reverseLinkedList(lastNode = 3) {
     *              reverseLinkedList(lastNode = 4) {
     *                  reverseLinkedList(lastNode = 5) {
     *                      if(lastNode == null || lastNode.next == null) {
     *                          return lastNode;
     *                         }
     *                  }
     *              5 -> 4  --- lastNode.next.next = lastNode && lastNode.next = null, dead loop
     *              }
     *          3 -> 4 ---
     *          }
     *      3 -> 2 ---
     *      }
     *  2 -> 1 ---
     *  }
     *
     * @param lastNode lastNode -> beforeLastNode ..
     * @return ListNode
     */
    static ListNode reverseLinkedListN3(ListNode lastNode) {
        if (lastNode == null || lastNode.next == null) {
            return lastNode;
        }

        ListNode last = reverseLinkedList(lastNode.next);
        lastNode.next.next = lastNode;
        lastNode.next = null;

        return last;
    }

    static class List {
        ListNode head;

        public List(ListNode head) {
            this.head = head;
        }

        public void addFirst(ListNode firstNode) {
            firstNode.next = head;
            head = firstNode;
        }

        public ListNode removeFirst() {
            ListNode firstNode = head;
            if (head != null) {
                head = firstNode.next;
            }
            return firstNode;
        }
    }

    /**
     * newNode
     * oldNode   o2
     * 1 -> 2 -> 3 -> 4 -> 5 -> null
     * 1.oldNode newNode -> o1
     * 2.
     * n1   o1   o2
     * 2 -> 1 -> 3 -> 4 -> 5 -> null
     * n1       o1    o2
     * 3 -> 2 -> 1 -> 4 -> 5 -> null
     * ...
     *
     * @param oldNode ListNode
     * @return NewNode
     */
    static ListNode reverseLinkedListN4(ListNode oldNode) {

        if(oldNode == null || oldNode.next == null) {
            return oldNode;
        }

        ListNode newNode = oldNode;
        ListNode o2 = oldNode.next;

        while (o2 != null) {
            oldNode.next = o2.next;
            o2.next = newNode;
            newNode = o2;
            o2 = oldNode.next;
        }

        return newNode;
    }

    /**
     * newNode null
     * oldNode   o1 o2
     *  1 -> 2 -> 3 -> 4 -> 5 -> null
     *  newNode     oldNode
     *  1 -> null  2 -> 3 -> 4 -> 5 -> null
     *  ...
     * @param oldNode ListNode
     * @return NewNode
     */
    static ListNode reverseLinkedList(ListNode oldNode) {
        if(oldNode == null || oldNode.next == null) {
            return oldNode;
        }

        ListNode newNode = null;

        while (oldNode != null) {
            ListNode o2 = oldNode.next;
            oldNode.next = newNode;
            newNode = oldNode;
            oldNode = o2;
        }
        return newNode;
    }

    public static void main(String[] args) {
        ListNode o5 = new ListNode(5, null);
        ListNode o4 = new ListNode(4, o5);
        ListNode o3 = new ListNode(3, o4);
        ListNode o2 = new ListNode(2, o3);
        ListNode o1 = new ListNode(1, o2);

        ListNode emptyNode = null;
        ListNode onlyOneNode = new ListNode(11, null);

        // print the list from o1 -> o5 with toString methode
        System.out.println(o1);

        ListNode newList = reverseLinkedList(o1);
        //print after the reverse from o1 -> o5 with toString methode
        System.out.println(newList);

        System.out.println("================================================================================================");

        // print the empty list with toString methode
        System.out.println(emptyNode);

        ListNode newEmptyList = reverseLinkedList(emptyNode);
        //print after the reverse with toString methode
        System.out.println(newEmptyList);

        System.out.println("================================================================================================");

        // print the only one node list with toString methode
        System.out.println(onlyOneNode);

        ListNode newOnlyOneNode = reverseLinkedList(onlyOneNode);
        //print after the reverse with toString methode
        System.out.println(onlyOneNode);




    }
}
