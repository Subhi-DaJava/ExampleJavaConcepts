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
 * find middle(from middle head) ListNode, then revers the left part, and then compare the value of the ListNode with the value of the origin head
 *
 * 1 2 3 1
 * middle 3, 1, left part reverse 2, 1
 *
 * 1 2 3 4 5
 * middle 4, 5, left part 2, 1
 *
 * steps for odd:
 * p1
 * p2
 * 1, 2, 3, 4, 5, null
 *    p1 p2
 * 1, 2, 3, 4, 5, null
 *       p1    p2
 * 1, 2, 3, 4, 5, null  --> p2 != null
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
 * 1, 2, 3, 4, 5, 6 null  --> p2 == null

 */
public class PalindromeLinkedListUpdated {

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }

        ListNode newNode = null;
        ListNode pointer1 = head;
        ListNode pointer2 = head;

        while (pointer2 != null && pointer2.next != null) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next.next;

            // ListNode nextPointer = head.next; nextPointer = pointer1
            head.next = newNode;
            newNode = head;
            head= pointer1;
        }

        if (pointer2 != null) {
            pointer1 = pointer1.next;
        }

        while (newNode != null) {
            if (newNode.value != pointer1.value) {
                return false;
            }
            pointer1 = pointer1.next;
            newNode = newNode.next;
        }

        return true;
    }

}
