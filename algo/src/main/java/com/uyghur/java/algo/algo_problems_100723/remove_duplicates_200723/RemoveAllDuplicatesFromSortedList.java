package com.uyghur.java.algo.algo_problems_100723.remove_duplicates_200723;

import com.uyghur.java.algo.algo_problems_100723.ListNode;

/**
 * Given the head of a sorted linked list, delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list. Return the linked list sorted as well.
 *
 * Input: head = [1,2,3,3,3,4,4,5,6,6,7]
 * Output: [1,2,5,7]
 * Input: head = [1,1,2,3,3,4]
 * Output: [2,4]
 */
public class RemoveAllDuplicatesFromSortedList {
    /**
     * solution(ListNode p1=1) {
     *     solution(ListNode p1=1) {
     *         solution(ListNode p2=2) { return
     *             solution(ListNode p2=2) {
     *                 solution(ListNode p3=3) { return
     *                     solution(ListNode p3=3) {
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
    public ListNode deleteAllDuplicatedNodesWithRecursion(ListNode pointer) {

        if(pointer == null || pointer.next == null) {
            return pointer;
        }

        if(pointer.value == pointer.next.value) {

            ListNode duplicate = pointer.next.next;

            while (duplicate != null && pointer.value == duplicate.value) {
                duplicate = duplicate.next;
            }

            return deleteAllDuplicatedNodesWithRecursion(duplicate);

        } else {

            pointer.next = deleteAllDuplicatedNodesWithRecursion(pointer.next);
            return pointer;
        }

    }

    /**
     * p1   p2   p3
     * s -> 1 -> 1 -> 1 -> 1 -> 2 -> 2 -> 3 -> 3 -> 4 -> null
     * if p2.value == p3.value -> p3 = p3.next
     * p1   p2        p3
     * s -> 1 -> 1 -> 1 -> 1 -> 2 -> 2 -> 3 -> 3 -> 4 -> null
     * p1   p2             p3
     * s -> 1 -> 1 -> 1 -> 1 -> 2 -> 2 -> 3 -> 3 -> 4 -> null
     * if p2.value != p3.value -> p1.next = p3 & p3 = p3.next, p2 = p3
     * ....
     * p1   p2   p3
     * s -> 4 -> null
     *
     * @param pointer ListNode
     * @return ListNode all duplicated nodes removed
     */

    public ListNode deleteAllDuplicatedNodes(ListNode pointer) {

        if(pointer == null || pointer.next == null) {
            return pointer;
        }

        ListNode sentinel = new ListNode(-99, pointer);

        ListNode pointer1 = sentinel;
        ListNode pointer2;
        ListNode pointer3;

        while ((pointer2 = pointer1.next) != null && (pointer3 = pointer2.next) != null) {
            if(pointer2.value == pointer3.value) {
                while ((pointer3 = pointer3.next) != null && pointer2.value == pointer3.value) { // assignment is already in the clause while

                }
                pointer1.next = pointer3;
            } else {
                pointer1 = pointer1.next; // (pointer2 = pointer1.next) pointer3 = pointer3.next already assigned
            }
        }

        return sentinel.next;
    }

}
