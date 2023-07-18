package com.uyghur.java.algo.algo_problems_100723.remove_nth_node_180723;

import com.uyghur.java.algo.algo_problems_100723.ListNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class RemoveNthNodeFromEndOfListTest {
    @InjectMocks
    private RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList;

    @Test
    void removeNthFromEnd() {
        ListNode head = ListNode.of(1, 2, 3, 4, 5);
        removeNthNodeFromEndOfList.recursion(head, 2);
    }

    @Test
    void setRemove2ndNodeFromEndOfList() {
        ListNode head = ListNode.of(1, 2, 3, 4, 5);
        ListNode node = removeNthNodeFromEndOfList.removeNthFromEnd(head, 2);

        assertThat(node).isEqualTo(ListNode.of(1, 2, 3, 5));
    }

    @Test
    void setRemove1stNodeFromEndOfList() {
        ListNode head = ListNode.of(1, 2, 3, 4, 5);
        ListNode node = removeNthNodeFromEndOfList.removeNthFromEnd(head, 1);

        assertThat(node).isEqualTo(ListNode.of(1, 2, 3, 4));
    }

    @Test
    void setRemove5thNodeFromEndOfList() {
        ListNode head = ListNode.of(1, 2, 3, 4, 5);
        ListNode node = removeNthNodeFromEndOfList.removeNthFromEnd(head, 5);

        assertThat(node).isEqualTo(ListNode.of( 2, 3, 4, 5));
    }

    @Test
    void setRemove1thNodeFromEndOfListWith1Elt() {
        ListNode head = ListNode.of(1);
        ListNode node = removeNthNodeFromEndOfList.removeNthFromEnd(head, 1);

        assertThat(node).isEqualTo(ListNode.of( ));
    }

    @Test
    void setRemove1thNodeFromEndOfListWithEmptyList() {
        ListNode head = ListNode.of(0);
        ListNode node = removeNthNodeFromEndOfList.removeNthFromEnd(head, 1);

        assertThat(node).isEqualTo(ListNode.of( ));
    }

    @Test
    void removeNthListNodeWith2Pointers() {
        ListNode head = ListNode.of(1, 2, 3, 4, 5, 6);
        ListNode node = removeNthNodeFromEndOfList.removeNthListNodeWith2Pointers(head, 2);

        assertThat(node).isEqualTo(ListNode.of(1, 2, 3, 4, 6));
    }

    @Test
    void removeNthListNodeWith2PointersRemoveLastElt() {
        ListNode head = ListNode.of(1, 2, 3, 4, 5, 6);
        ListNode node = removeNthNodeFromEndOfList.removeNthListNodeWith2Pointers(head, 1);

        assertThat(node).isEqualTo(ListNode.of(1, 2, 3, 4, 5));
    }

    @Test
    void removeNthListNodeWith2PointersRemoveFirstElt() {
        ListNode head = ListNode.of(1, 2, 3, 4, 5, 6);
        ListNode node = removeNthNodeFromEndOfList.removeNthListNodeWith2Pointers(head, 6);

        assertThat(node).isEqualTo(ListNode.of( 2, 3, 4, 5, 6));
    }

    @Test
    void removeNthListNodeWith2PointersWithEmptyList() {
        ListNode head = ListNode.of();
        ListNode node = removeNthNodeFromEndOfList.removeNthListNodeWith2Pointers(head, 6);

        assertThat(node).isEqualTo(ListNode.of( ));
    }

    @Test
    void removeNthListNodeWith2PointersWithTwoElts1() {
        ListNode head = ListNode.of(1, 2);
        ListNode node = removeNthNodeFromEndOfList.removeNthListNodeWith2Pointers(head, 1);

        assertThat(node).isEqualTo(ListNode.of(1));
    }
    @Test
    void removeNthListNodeWith2PointersWithTwoElts2() {
        ListNode head = ListNode.of(1, 2);
        ListNode node = removeNthNodeFromEndOfList.removeNthListNodeWith2Pointers(head, 2);

        assertThat(node).isEqualTo(ListNode.of(2));
    }
}