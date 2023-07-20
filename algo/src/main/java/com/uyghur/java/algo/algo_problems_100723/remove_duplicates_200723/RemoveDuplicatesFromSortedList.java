package com.uyghur.java.algo.algo_problems_100723.remove_duplicates_200723;

import com.uyghur.java.algo.algo_problems_100723.ListNode;

/**
 * Remove Duplicates from Sorted List (leave only one node)
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 *
 * Input: head = [1,1,2,2,3,3]
 * Output: [1,2,3]
 *
 * Input: head = [1,1,2,3,4,4,4,5]
 * Output: [1,2,3,4,5]
 * p1   p2
 * 1 -> 1 -> 2 -> 2 -> 3 -> 3 -> 4 -> null
 * if p1.value == p2.value -> p1.next = p2.next
 * p1   p2
 * 1 -> 2 -> 2 -> 3 -> 3 -> 4 -> null
 * if p1.value != p2.value -> p1 = p1.next & p2 = p2.next
 * ....
 *                          p1   p2
 * 1 -> 2 -> 2 -> 3 -> 3 -> 4 -> null
 * if p1.value != p2.value -> p1 = p1.next & p2 = p2.next
 */
public class RemoveDuplicatesFromSortedList {

    public ListNode deleteNodesDuplicated(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode pointer1 = head;
        ListNode pointer2;

        while ((pointer2 = pointer1.next) != null) {
            if(pointer1.value == pointer2.value) {
                pointer1.next = pointer2.next;
            } else {
                pointer1 = pointer1.next;
            }
        }
        return head;
    }

    /**
     * solution(ListNode p1=1) {
     *     solution(ListNode p1=1) { return p1
     *         solution(ListNode p2=2) {
     *             solution(ListNode p2=2) { return p2
     *                 solution(ListNode p3=3) {
     *                     solution(ListNode p3=3) { return p3
     *                         solution(ListNode p4=4) { return p4
     *                             solution(ListNode p5=5) {
     *                                  return p5
     *                             }
     *                         }
     *                     }
     *                 }
     *             }
     *         }
     *     }
     * }
     * @param pointer ListNode
     * @return Pointer removed nodes duplicated
     */
    public ListNode deleteNodesDuplicatedWithRecursion(ListNode pointer) {
        if(pointer == null || pointer.next == null) {
            return pointer;
        }

        if(pointer.value == pointer.next.value) {
            return deleteNodesDuplicatedWithRecursion(pointer.next);
        } else {
            pointer.next = deleteNodesDuplicatedWithRecursion(pointer.next);
            return pointer;
        }
    }

}
