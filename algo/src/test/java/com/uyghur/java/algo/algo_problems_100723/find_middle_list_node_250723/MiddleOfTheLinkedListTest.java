package com.uyghur.java.algo.algo_problems_100723.find_middle_list_node_250723;

import com.uyghur.java.algo.algo_problems_100723.ListNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class MiddleOfTheLinkedListTest {

    @InjectMocks
    private MiddleOfTheLinkedList middle;

    @Test
    void middleListNodeWithOddNumber() {
        ListNode listNode = ListNode.of(1,2,3,4,5,6,7);
        assertThat(middle.middleListNode(listNode)).isEqualTo(ListNode.of(4,5,6,7));
    }

    @Test
    void middleListNodeWithEvenNumber() {
        ListNode listNode = ListNode.of(1,2,3,4,5,6,7,8);
        assertThat(middle.middleListNode(listNode)).isEqualTo(ListNode.of(5,6,7,8));
    }

    @Test
    void middleListNodeWithNull() {
        ListNode listNode = ListNode.of();
        assertThat(middle.middleListNode(listNode)).isEqualTo(ListNode.of());
    }

    @Test
    void middleListNodeWithTwoListNodes() {
        ListNode listNode = ListNode.of(1,2);
        assertThat(middle.middleListNode(listNode)).isEqualTo(ListNode.of(2));
    }

    @Test
    void middleListNodeWithOneListNode() {
        ListNode listNode = ListNode.of(1);
        assertThat(middle.middleListNode(listNode)).isEqualTo(ListNode.of(1));
    }
}