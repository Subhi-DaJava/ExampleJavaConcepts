package com.uyghur.java.algo.algo_problems_100723.merge_sorted_lists_250723;

import com.uyghur.java.algo.algo_problems_100723.ListNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class MergeTwoSortedListsTest {
    @InjectMocks
    private MergeTwoSortedLists mergeTwoSortedLists;

    @Test
    void mergeTwoLists() {
        ListNode listNode1 = ListNode.of(1,2,4,5);
        ListNode listNode2 = ListNode.of(1,3,4,6);

        assertThat(mergeTwoSortedLists.mergeTwoLists(listNode1, listNode2)).isEqualTo(ListNode.of(1,1,2,3,4,4,5,6));
    }

    @Test
    void mergeTwoListsWithTwoNullList() {
        ListNode listNode1 = ListNode.of();
        ListNode listNode2 = ListNode.of();

        assertThat(mergeTwoSortedLists.mergeTwoLists(listNode1, listNode2)).isEqualTo(ListNode.of());
    }

    @Test
    void mergeTwoListsWithOneNullList() {
        ListNode listNode1 = ListNode.of(1,2,2,3,4);
        ListNode listNode2 = ListNode.of();

        assertThat(mergeTwoSortedLists.mergeTwoLists(listNode1, listNode2)).isEqualTo(listNode1);
    }
    @Test
    void mergeTwoListsWithOneNullListAndWithOneValue() {
        ListNode listNode1 = ListNode.of();
        ListNode listNode2 = ListNode.of(2);

        assertThat(mergeTwoSortedLists.mergeTwoLists(listNode1, listNode2)).isEqualTo(listNode2);
    }

    @Test
    void mergeTwoListsWithRecursion() {
        ListNode listNode1 = ListNode.of(1,2,4,5,7,8,8,9,9);
        ListNode listNode2 = ListNode.of(1,3,4,6);

        assertThat(mergeTwoSortedLists.mergeTwoListWithRecursion(listNode1, listNode2)).isEqualTo(ListNode.of(1,1,2,3,4,4,5,6,7,8,8,9,9));
    }

    @Test
    void mergeTwoListsWithTwoNullListWithRecursion() {
        ListNode listNode1 = ListNode.of();
        ListNode listNode2 = ListNode.of();

        assertThat(mergeTwoSortedLists.mergeTwoListWithRecursion(listNode1, listNode2)).isEqualTo(ListNode.of());
    }

    @Test
    void mergeTwoListsWithOneNullListWithRecursion() {
        ListNode listNode1 = ListNode.of(1,2,2,3,4);
        ListNode listNode2 = ListNode.of();

        assertThat(mergeTwoSortedLists.mergeTwoListWithRecursion(listNode1, listNode2)).isEqualTo(listNode1);
    }
    @Test
    void mergeTwoListsWithOneNullListAndWithOneValueWithRecursion() {
        ListNode listNode1 = ListNode.of();
        ListNode listNode2 = ListNode.of(2);

        assertThat(mergeTwoSortedLists.mergeTwoListWithRecursion(listNode1, listNode2)).isEqualTo(listNode2);
    }
}