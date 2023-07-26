package com.uyghur.java.algo.algo_problems_100723.palindrome_linked_list_260723;

import com.uyghur.java.algo.algo_problems_100723.ListNode;

/**
 * Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
 *
 * Input: head = [2,2]
 * Output: true
 *
 * Input: head = [2]
 * Output: true
 *
 * Input: head = [1,2,2,2,1]
 * Output: true
 *
 * Input: head = [1,2,3]
 * Output: false
 *
 * Input: head = [1,2,3,2,1]
 * Output: true
 *
 * solution : steps
 * find middle(from middle head) ListNode, then revers it, and then compare the value of the ListNode with the value of the origin head
 *
 * 1 2 3 1
 * middle 1 3
 *
 * 1 2 3 4 5
 * middle 3 4 5
 */
public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode middleNode = findMiddleListNode(head);
        //System.out.println(middleNode);
        ListNode reversedNode = reverseListNode(middleNode);
        //System.out.println(reversedNode);
        while (reversedNode != null) {
            if (head.value != reversedNode.value) {
                return false;
            }
            head = head.next;
            reversedNode = reversedNode.next;
        }
        return true;
    }

    /**
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
     * @param head original ListNode
     * @return middle ListNode
     */

    private ListNode findMiddleListNode(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pointer1 = head;
        ListNode pointer2 = head;


        while (pointer2 != null && pointer2.next != null) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next.next;
        }
        return pointer1;
    }

    private ListNode reverseListNode(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode newListNode = null;

        while (head != null) {
            ListNode nextPointer = head.next;
            head.next = newListNode;
            newListNode = head;
            head = nextPointer;
        }
        return newListNode;
    }

}
