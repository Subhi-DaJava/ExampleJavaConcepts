package com.uyghur.java.algo.algo_problems_100723.remove_duplicates_200723;

import com.uyghur.java.algo.algo_problems_100723.ListNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
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
@ExtendWith(MockitoExtension.class)
class RemoveDuplicatesFromSortedListTest {

    @InjectMocks
    private RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList;

    @Test
    void deleteDuplicatedNodes() {
        ListNode head = ListNode.of(1,1,2,2,3,3);
        System.out.println("Before deleting the nodes duplicated: " + head);
        ListNode nodesDuplicatedRemoved = removeDuplicatesFromSortedList.deleteNodesDuplicated(head);

        assertThat(nodesDuplicatedRemoved).isEqualTo(ListNode.of(1,2,3));
    }

    @Test
    void deleteDuplicatedNodesWithNull() {
        ListNode head = ListNode.of();
        System.out.println("Before deleting the nodes duplicated: " + head);
        ListNode nodesDuplicatedRemoved = removeDuplicatesFromSortedList.deleteNodesDuplicated(head);

        assertThat(nodesDuplicatedRemoved).isEqualTo(ListNode.of());
    }

    @Test
    void deleteDuplicatedNodesWithOneNode() {
        ListNode head = ListNode.of(1);
        System.out.println("Before deleting the nodes duplicated: " + head);
        ListNode nodesDuplicatedRemoved = removeDuplicatesFromSortedList.deleteNodesDuplicated(head);

        assertThat(nodesDuplicatedRemoved).isEqualTo(ListNode.of(1));
    }

    @Test
    void deleteDuplicatedWithTwoDifferentNodes() {
        ListNode head = ListNode.of(1,2);
        System.out.println("Before deleting the nodes duplicated: " + head);
        ListNode nodesDuplicatedRemoved = removeDuplicatesFromSortedList.deleteNodesDuplicated(head);

        assertThat(nodesDuplicatedRemoved).isEqualTo(ListNode.of(1,2));
    }

    @Test
    void deleteDuplicatedNodesWithTwoSameNodes() {
        ListNode head = ListNode.of(1,1);
        System.out.println("Before deleting the nodes duplicated: " + head);
        ListNode nodesDuplicatedRemoved = removeDuplicatesFromSortedList.deleteNodesDuplicated(head);

        assertThat(nodesDuplicatedRemoved).isEqualTo(ListNode.of(1));
    }


    @Test
    void deleteDuplicatedNodesWithRecursion() {
        ListNode head = ListNode.of(1,1,2,2,3,3);
        System.out.println("Before deleting the nodes duplicated: " + head);
        ListNode nodesDuplicatedRemoved = removeDuplicatesFromSortedList.deleteNodesDuplicated(head);

        assertThat(nodesDuplicatedRemoved).isEqualTo(ListNode.of(1,2,3));
    }

    @Test
    void deleteDuplicatedNodesWithNullWithRecursion() {
        ListNode head = ListNode.of();
        System.out.println("Before deleting the nodes duplicated: " + head);
        ListNode nodesDuplicatedRemoved = removeDuplicatesFromSortedList.deleteNodesDuplicatedWithRecursion(head);

        assertThat(nodesDuplicatedRemoved).isEqualTo(ListNode.of());
    }

    @Test
    void deleteDuplicatedNodesWithOneNodeWithRecursion() {
        ListNode head = ListNode.of(1);
        System.out.println("Before deleting the nodes duplicated: " + head);
        ListNode nodesDuplicatedRemoved = removeDuplicatesFromSortedList.deleteNodesDuplicatedWithRecursion(head);

        assertThat(nodesDuplicatedRemoved).isEqualTo(ListNode.of(1));
    }

    @Test
    void deleteDuplicatedNodesWithTwoDifferentNodesWithRecursion() {
        ListNode head = ListNode.of(1,2);
        System.out.println("Before deleting the nodes duplicated: " + head);
        ListNode nodesDuplicatedRemoved = removeDuplicatesFromSortedList.deleteNodesDuplicatedWithRecursion(head);

        assertThat(nodesDuplicatedRemoved).isEqualTo(ListNode.of(1,2));
    }

    @Test
    void deleteDuplicatedNodesWithTwoSameNodesWithRecursion() {
        ListNode head = ListNode.of(1,1);
        System.out.println("Before deleting the nodes duplicated: " + head);
        ListNode nodesDuplicatedRemoved = removeDuplicatesFromSortedList.deleteNodesDuplicatedWithRecursion(head);

        assertThat(nodesDuplicatedRemoved).isEqualTo(ListNode.of(1));
    }
}