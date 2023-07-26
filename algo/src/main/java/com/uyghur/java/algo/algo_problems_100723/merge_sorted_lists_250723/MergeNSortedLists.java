package com.uyghur.java.algo.algo_problems_100723.merge_sorted_lists_250723;

import com.uyghur.java.algo.algo_problems_100723.ListNode;

/**
 * You are given an array of N linked-lists lists, each linked-list is sorted in ascending order.
 * Merge all the linked-lists into one sorted linked-list and return it.
 * Input: lists = [[1,4,5,7],[1,3,4],[2,6,8]]
 * Output: [1,1,2,3,4,4,5,6,7,8]
 * Explanation: The linked-lists are:
 * [
 *   1 -> 4 -> 5,
 *   1 -> 3 -> 4,
 *   2 -> 6
 * ]
 * merging them into one sorted list:
 * 1 -> 1 -> 2 -> 3 -> 4 -> 4 -> 5 -> 6 -> 7 -> 8
 * Input: lists = []
 * Output: []
 * Input: lists = [[]]
 * Output: []
 *
 *  Divide And Conquer
 *  Decrease and Conquer
 */
public class MergeNSortedLists {

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

    public ListNode mergeNListNodes(ListNode[] listNodes) {
        if(listNodes.length == 0) {
            return null;
        }
        return splitListNodes(listNodes, 0, listNodes.length - 1);
    }

    // i, j left and right edge
    private ListNode splitListNodes(ListNode[] listNodes, int i, int j) {
        if(i == j) {
            return listNodes[i];
        }
        int middle = i + j >>> 1;

        ListNode left = splitListNodes(listNodes, i, middle);
        ListNode right = splitListNodes(listNodes, middle + 1, j);

        return mergeTwoLists(left, right);
    }
}
