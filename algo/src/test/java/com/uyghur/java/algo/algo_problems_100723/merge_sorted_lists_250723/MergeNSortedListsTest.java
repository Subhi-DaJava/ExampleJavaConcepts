package com.uyghur.java.algo.algo_problems_100723.merge_sorted_lists_250723;

import com.uyghur.java.algo.algo_problems_100723.ListNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class MergeNSortedListsTest {
    @InjectMocks
    private MergeNSortedLists mergeNSortedLists;

    @Test
    void mergeNListNodes() {
      ListNode[]  lists = {ListNode.of(1,4,5,7),ListNode.of(1,3,4),ListNode.of(2,6,8)};

      assertThat(mergeNSortedLists.mergeNListNodes(lists)).isEqualTo(ListNode.of(1,1,2,3,4,4,5,6,7,8));
    }

    @Test
    void mergeNListNodesWithEmptyList() {
        ListNode[]  lists = {ListNode.of(),ListNode.of(),ListNode.of()};

        assertThat(mergeNSortedLists.mergeNListNodes(lists)).isEqualTo(ListNode.of());
    }

    @Test
    void mergeNListNodesWithEmptyListAndUneList() {
        ListNode[]  lists = {ListNode.of(),ListNode.of(),ListNode.of(1,3,5)};

        assertThat(mergeNSortedLists.mergeNListNodes(lists)).isEqualTo(ListNode.of(1,3,5));
    }
}