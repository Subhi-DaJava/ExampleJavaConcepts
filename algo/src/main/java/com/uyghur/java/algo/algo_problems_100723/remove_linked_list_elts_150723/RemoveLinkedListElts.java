package com.uyghur.java.algo.algo_problems_100723.remove_linked_list_elts_150723;

import com.uyghur.java.algo.algo_problems_100723.ListNode;

/**
 * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
 * Ex 1: Input: head = [1,2,8,3,4,5,8], val = 8
 * Output: [1,2,3,4,5]
 * Ex 2: Input: head = [], val = 1
 * Output: []
 * Ex 3: Input: head = [9,9,9,9], val = 9
 * Output: []
 * Tests: package com.uyghur.java.algo.algo_problems_100723.remove_linked_list_elts_150723;
 */
public class RemoveLinkedListElts {
    /**
     *  steps:  p1      p2
     *  step1: sentinel 1 2 8 3 4 5 8 7
     *                   p1  p2
     *  step 2: sentinel 1   2   8   3   4   5   8  7  null
     *                       p1  x   p2
     *  step 3: sentinel 1   2   8   3   4   5   8  7  null
     *  ...
     * @param head ListNode
     * @param value ListNode value
     * @return ListNode
     */
    public ListNode removeNodeWithGivenValue(ListNode head, int value) {

        ListNode sentinel = new ListNode(-1, head);

        ListNode pointer1 = sentinel;
        ListNode pointer2 = sentinel.next;

        while (pointer2 != null) {
            if (pointer2.value == value) {

                pointer1.next = pointer2.next;
                pointer2 = pointer2.next;
            } else {

                pointer1 = pointer1.next;
                pointer2 = pointer2.next;
            }
        }

        return sentinel.next;
    }

    public ListNode removeNodeWithGivenValueUpdated(ListNode head, int value) {

        ListNode sentinel = new ListNode(-1, head);
        ListNode pointer1 = sentinel;

        //ListNode pointer2 = sentinel.next;
        ListNode pointer2;

        while ((pointer2 = pointer1.next) != null) {

            if (pointer2.value == value) {
                pointer1.next = pointer2.next;

            } else {
                pointer1 = pointer1.next;
            }
        }

        return sentinel.next;
    }

    /**
     * Input: head = [1,2,8,3,4,5,8], val = 8
     * removeNode(Node 1, 8) {
     *     return 1 -> 2 -> 3 -> 4 -> 5 - > null;
     *     removeNode(Node 2, 8) {
     *         return 2 -> 3 -> 4 -> 5 - > null;
     *         removeNode(Node 8, 8) {
     *             return 3 -> 4 -> 5 - > null;
     *             removeNode(Node 3, 8) {
     *                  return 3 -> 4 -> 5 - > null;
     *                 removeNode(Node 4, 8) {
     *                       return 4 -> 5 - > null;
     *                     removeNode(Node 5, 8) {
     *                           return 5 - > null;
     *                         removeNode(Node 8, 8) {
     *                            return null;
     *                           removeNode(Node null, 8) {
     *                               return null;
     *                           }
     *                         }
     *                     }
     *                 }
     *             }
     *         }
     *     }
     * }
     * @param pointer ListNode
     * @param value pointer value
     * @return List Node
     */

    public ListNode removeNodeWithGivenValueWithRecursion(ListNode pointer, int value) {

        if(pointer == null) {
            return null;
        }
        if(pointer.value == value) {
            return removeNodeWithGivenValueWithRecursion(pointer.next, value);
        } else {
           pointer.next = removeNodeWithGivenValueWithRecursion(pointer.next, value);
           return pointer;
        }
    }


}
