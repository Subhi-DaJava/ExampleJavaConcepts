package com.uyghur.java.algo.algo_problems_100723.Floyd_s_Cycle_Finding_Algorithm_280723;

import com.uyghur.java.algo.algo_problems_100723.ListNode;

/**
 * Floyd’s Cycle Finding Algorithm
 * Floyd’s cycle finding algorithm or Hare-Tortoise algorithm is a pointer algorithm that uses only two pointers,
 * moving through the sequence at different speeds. This algorithm is used to find a loop in a linked list.
 * It uses two pointers one moving twice as fast as the other one. The faster one is called the fast pointer and the other one is called the slow pointer.
 *
 * While traversing the linked list one of these things will occur-
 *
 * The Fast pointer may reach the end (NULL) this shows that there is no loop in the linked list.
 * The Fast pointer again catches the slow pointer at some time therefore a loop exists in the linked list.
 * Initialize two-pointers and start traversing the linked list.
 * Move the slow pointer by one position.
 * Move the fast pointer by two positions.
 * If both pointers meet at some point then a loop exists and if the fast pointer meets the end position then no loop exists.
 */
public class FloydSCycleFindingAlgorithm {

    public boolean isCycle(ListNode head) {
        ListNode hare = head;
        ListNode tortoise = head;

        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;

            if (hare == tortoise) {
                return true;
            }
        }
        return false;
    }

    public ListNode findCycleNode(ListNode head) {
        ListNode hare = head;
        ListNode tortoise = head;

        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;

            if (hare == tortoise) {
                tortoise = head;
                while (true) {
                    if (hare == tortoise) {
                        return tortoise;
                    }
                    tortoise = tortoise.next;
                    hare = hare.next;
                }
            }
        }
        return null;
    }

}
