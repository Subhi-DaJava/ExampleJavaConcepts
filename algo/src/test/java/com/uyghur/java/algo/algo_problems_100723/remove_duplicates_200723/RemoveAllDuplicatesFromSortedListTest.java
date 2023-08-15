package com.uyghur.java.algo.algo_problems_100723.remove_duplicates_200723;

import com.uyghur.java.algo.algo_problems_100723.ListNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
@ExtendWith(MockitoExtension.class)
class RemoveAllDuplicatesFromSortedListTest {
    @InjectMocks
    private RemoveAllDuplicatesFromSortedList removeAllDuplicatesFromSortedList;

    @Test
    void deleteDuplicatedNodesWithRecursion() {
        ListNode head = ListNode.of(1,1,1,1,2,2,3);
        System.out.println("Before deleting the nodes duplicated: " + head);
        ListNode nodesDuplicatedRemoved = removeAllDuplicatesFromSortedList.deleteAllDuplicatedNodesWithRecursion(head);

        assertThat(nodesDuplicatedRemoved).isEqualTo(ListNode.of(3));
    }

    @Test
    void deleteDuplicatedNodesWithRecursionRemoveAllNodes() {
        ListNode head = ListNode.of(1,1,1,1,2,2,3,3);
        System.out.println("Before deleting the nodes duplicated: " + head);
        ListNode nodesDuplicatedRemoved = removeAllDuplicatesFromSortedList.deleteAllDuplicatedNodesWithRecursion(head);

        assertThat(nodesDuplicatedRemoved).isEqualTo(ListNode.of());
    }

    @Test
    void deleteDuplicatedNodesWithNullWithRecursion() {
        ListNode head = ListNode.of();
        System.out.println("Before deleting the nodes duplicated: " + head);
        ListNode nodesDuplicatedRemoved = removeAllDuplicatesFromSortedList.deleteAllDuplicatedNodesWithRecursion(head);

        assertThat(nodesDuplicatedRemoved).isEqualTo(ListNode.of());
    }

    @Test
    void deleteDuplicatedNodesWithOneNodeWithRecursion() {
        ListNode head = ListNode.of(1);
        System.out.println("Before deleting the nodes duplicated: " + head);
        ListNode nodesDuplicatedRemoved = removeAllDuplicatesFromSortedList.deleteAllDuplicatedNodesWithRecursion(head);

        assertThat(nodesDuplicatedRemoved).isEqualTo(ListNode.of(1));
    }

    @Test
    void deleteDuplicatedNodesWithTwoDifferentNodesWithRecursion() {
        ListNode head = ListNode.of(1,2);
        System.out.println("Before deleting the nodes duplicated: " + head);
        ListNode nodesDuplicatedRemoved = removeAllDuplicatesFromSortedList.deleteAllDuplicatedNodesWithRecursion(head);

        assertThat(nodesDuplicatedRemoved).isEqualTo(ListNode.of(1,2));
    }

    @Test
    void deleteDuplicatedNodesWithTwoSameNodesWithRecursion() {
        ListNode head = ListNode.of(1,1,2,3,4,5,5,6);
        System.out.println("Before deleting the nodes duplicated: " + head);
        ListNode nodesDuplicatedRemoved = removeAllDuplicatesFromSortedList.deleteAllDuplicatedNodesWithRecursion(head);

        assertThat(nodesDuplicatedRemoved).isEqualTo(ListNode.of(2,3,4,6));
    }


    @Test
    void deleteDuplicatedNodes() {
        ListNode head = ListNode.of(1,1,1,1,2,2,3);
        System.out.println("Before deleting the nodes duplicated: " + head);
        ListNode nodesDuplicatedRemoved = removeAllDuplicatesFromSortedList.deleteAllDuplicatedNodes(head);

        assertThat(nodesDuplicatedRemoved).isEqualTo(ListNode.of(3));
    }

    @Test
    void deleteDuplicatedNodesRemoveAllNodes() {
        ListNode head = ListNode.of(1,1,1,1,2,2,3,3);
        System.out.println("Before deleting the nodes duplicated: " + head);
        ListNode nodesDuplicatedRemoved = removeAllDuplicatesFromSortedList.deleteAllDuplicatedNodes(head);

        assertThat(nodesDuplicatedRemoved).isEqualTo(ListNode.of());
    }

    @Test
    void deleteDuplicatedNodesWithNull() {
        ListNode head = ListNode.of();
        System.out.println("Before deleting the nodes duplicated: " + head);
        ListNode nodesDuplicatedRemoved = removeAllDuplicatesFromSortedList.deleteAllDuplicatedNodes(head);

        assertThat(nodesDuplicatedRemoved).isEqualTo(ListNode.of());
    }

    @Test
    void deleteDuplicatedNodesWithOneNode() {
        ListNode head = ListNode.of(1);
        System.out.println("Before deleting the nodes duplicated: " + head);
        ListNode nodesDuplicatedRemoved = removeAllDuplicatesFromSortedList.deleteAllDuplicatedNodes(head);

        assertThat(nodesDuplicatedRemoved).isEqualTo(ListNode.of(1));
    }

    @Test
    void deleteDuplicatedNodesWithTwoDifferentNodes() {
        ListNode head = ListNode.of(1,2);
        System.out.println("Before deleting the nodes duplicated: " + head);
        ListNode nodesDuplicatedRemoved = removeAllDuplicatesFromSortedList.deleteAllDuplicatedNodes(head);

        assertThat(nodesDuplicatedRemoved).isEqualTo(ListNode.of(1,2));
    }

    @Test
    void deleteDuplicatedNodesWithTwoSameNodes() {
        ListNode head = ListNode.of(1,1,2,3,4,5,5,6);
        System.out.println("Before deleting the nodes duplicated: " + head);
        ListNode nodesDuplicatedRemoved = removeAllDuplicatesFromSortedList.deleteAllDuplicatedNodes(head);

        assertThat(nodesDuplicatedRemoved).isEqualTo(ListNode.of(2,3,4,6));
    }

}