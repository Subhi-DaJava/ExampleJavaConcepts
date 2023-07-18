package com.uyghur.java.algo.algo_problems_100723.remove_nth_node_180723;

import com.uyghur.java.algo.algo_problems_100723.ListNode;

/**
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 * Input: pointer = [1,2,3,4,5], n = 2
 * Output: [1,2,3,5]
 * Input: pointer = [1], n = 1
 * Output: []
 * Input: pointer = [1,2], n = 1
 * Output: [1]
 * Constraints:
 * The number of nodes in the list is sz.
 * 1 <= size <= 30
 * 0 <= Node.value <= 100
 * 1 <= n <= size
 */
public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode sentinel = new ListNode( -99, head);
        recursion(sentinel, n);
        return sentinel.next;
    }

    /**
     * recursion(ListNode p=1, int n=2) {
     *      recursion(ListNode p=2, int n=2) {
     *           recursion(ListNode p=3, int n=2) {
     *                recursion(ListNode p=4, int n=2) {
     *                     recursion(ListNode p=5, int n=2) {
     *                          recursion(ListNode p=null, int n=2) {
     *                              return 0;
     *                          }
     *                          return 1;
     *                     }
     *                     return 2;
     *                }
     *                if(return value==n==2) {
     *                    p.next = p.next.next;
     *                }
     *                return 3;
     *           }
     *           return 4;
     *      }
     *      return 5;
     * }
     * @param pointer ListNode
     * @param n the nth Node form end of List
     * @return ListNode removed nth elt
     */

     public int recursion(ListNode pointer, int n) {
        if(pointer == null) {
            return 0;
        }

        int nth = recursion(pointer.next, n); // the number of the position of the next pointer

        System.out.println("The value of the current pointer: " + pointer.value + ", the nth node from end: " + nth);
        if (nth == n) {
            pointer.next = pointer.next.next;
        }
        return nth + 1; // the number of the position of the current pointer
    }

    /**
     * n=3
     * p1
     * p2
     * sentinel -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
     * steps:
     * p1         p2
     * sentinel -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
     *  p1             p2
     * sentinel -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
     *
     *  p1                   p2
     * sentinel -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
     *
     *  p1                        p2
     * sentinel -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
     *             p1                  p2
     * sentinel -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
     *
     *                  p1                  p2
     * sentinel -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
     *
     *                       p1                   p2
     * sentinel -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
     *
     * @return ListNode removed the nth Node from end of list
     */
    public ListNode removeNthListNodeWith2Pointers(ListNode head, int n) {
        if(head == null) {
            return null;
        }
        ListNode sentinel = new ListNode(-99, head);
        ListNode pointer1 = sentinel;
        ListNode pointer2 = sentinel;

        for (int i = 0; i < n + 1; i++) {
            pointer2 = pointer2.next;
        }
        while (pointer2 != null) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }

        pointer1.next = pointer1.next.next;

        return sentinel.next;
    }

}
