package com.uyghur.java.algo.algo_problems_100723.find_middle_list_node_250723;

import com.uyghur.java.algo.algo_problems_100723.ListNode;

/**
 * Given the head of a singly linked list, return the middle node of the linked list.
 *
 * If there are two middle nodes, return the second middle node.
 * Input: head = [1,2,3,4,5]
 * Output: [3,4,5]
 * Explanation: The middle node of the list is node 3.
 * Input: head = [1,2,3,4,5,6]
 * Output: [4,5,6]
 * Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 * steps for odd:
 * p1
 * p2
 * 1, 2, 3, 4, 5, null
 *    p1 p2
 * 1, 2, 3, 4, 5, null
 *       p1    p2
 * 1, 2, 3, 4, 5, null
 * steps for even
 * p1
 * p2
 * 1, 2, 3, 4, 5, 6 null
 * p1    p2
 * 1, 2, 3, 4, 5, 6 null
 *    p1    p2
 * 1, 2, 3, 4, 5, 6 null
 *       p1    p2
 * 1, 2, 3, 4, 5, 6 null
 *          p1       p2
 * 1, 2, 3, 4, 5, 6 null
 */
public class MiddleOfTheLinkedList {

    public ListNode middleListNode(ListNode head) {
        ListNode pointer1 = head;
        ListNode pointer2 = head;

        while (pointer2 != null && pointer2.next != null) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
            pointer2 = pointer2.next;
        }
        return pointer1;
    }
}
