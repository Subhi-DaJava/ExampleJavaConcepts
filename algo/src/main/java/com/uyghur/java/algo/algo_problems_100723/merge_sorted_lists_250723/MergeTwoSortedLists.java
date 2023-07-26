package com.uyghur.java.algo.algo_problems_100723.merge_sorted_lists_250723;

import com.uyghur.java.algo.algo_problems_100723.ListNode;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
 * Input: list1 = [1,2,4,5], list2 = [1,3,4,6]
 * Output: [1,1,2,3,4,4,5,6]
 * Input: list1 = [], list2 = []
 * Output: []
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 * step 1
 * p1
 * 1,    2,     4,      5,      6,      null
 * p2
 * 3,     4,    5,     null
 * p
 * s    1,
 * step 2
 *       p1
 * 1,    2,     4,      5,      6,      null
 * p2
 * 3,     4,    5,     null
 *      p
 * s    1,      2
 * step 3
 *              p1
 * 1,    2,     4,      5,      6,      null
 *        p2
 * 3,     4,    5,     null
 *              p
 * s    1,      2,      3
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode pointer1, ListNode pointer2) {

        ListNode sentinel = new ListNode(-99, null);
        ListNode pointer = sentinel;

        while (pointer1 != null && pointer2 != null) {
            if(pointer1.value < pointer2.value) {
                pointer.next = pointer1;
                pointer1 = pointer1.next;
               // pointer = pointer.next;
            } else {
               pointer.next = pointer2;
               pointer2 = pointer2.next;
               //pointer = pointer.next;
            }

            pointer = pointer.next;
        }

        if(pointer1 != null) {
            pointer.next = pointer1;
        }

        if(pointer2 != null) {
            pointer.next = pointer2;
        }

        return sentinel.next;
    }

    /**
     * mergeTwoList(p1=[1,2,4,5], p2=[1,3,4,6]) {
     *     mergeTwoList(p1=[2,4,5], p2=[3,4,6]) {
     *          mergeTwoList(p1=[4,5], p2=[3,4,6]) {
     *              mergeTwoList(p1=[4,5], p2=[4,6]) {
     *                  mergeTwoList(p1=[4,5], p2=[4,6]) {
     *                      mergeTwoList(p1=[5], p2=[6])
     *                          mergeTwoList(p1=[5], p2=[6]) {
     *                              mergeTwoList(p1=[], p2=[6]) {
     *                                  return p2
     *                              }
     *                              return 5
     *                          }
     *                      return 4
     *                  }
     *              return 3
     *          {
     *          return 2
     *     }
     *     p1.next = mergeTwoList(p1.next, p2)
     *     return 1
     * }
     * @param pointer1 ListNode
     * @param pointer2 ListNode
     * @return pointer ListNode merged
     */
    public ListNode mergeTwoListWithRecursion(ListNode pointer1, ListNode pointer2) {

        if(pointer1 == null) {
            return pointer2;
        }
        if(pointer2 == null) {
            return pointer1;
        }

        if(pointer1.value < pointer2.value) {
            pointer1.next = mergeTwoListWithRecursion(pointer1.next, pointer2);
            return pointer1;
        } else {
            pointer2.next = mergeTwoListWithRecursion(pointer1, pointer2.next);
            return pointer2;
        }
    }
}
