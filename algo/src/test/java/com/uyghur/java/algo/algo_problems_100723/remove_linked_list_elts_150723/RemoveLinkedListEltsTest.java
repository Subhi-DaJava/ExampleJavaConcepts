package com.uyghur.java.algo.algo_problems_100723.remove_linked_list_elts_150723;

import com.uyghur.java.algo.algo_problems_100723.ListNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class RemoveLinkedListEltsTest {
    @InjectMocks
    private RemoveLinkedListElts removeLinkedListElts;

    @Test
    void removeNodeWithGivenValue() {

        ListNode listNode = ListNode.of(1, 2, 8, 3, 4, 5, 8);

        assertThat(removeLinkedListElts.removeNodeWithGivenValue(listNode, 8)).isEqualTo(ListNode.of(1, 2, 3, 4, 5));
    }

    @Test
    void removeEmptyNodeWithGivenValue() {

        ListNode listNode = ListNode.of();

        assertThat(removeLinkedListElts.removeNodeWithGivenValue(listNode, 8)).isEqualTo(null);
    }

    @Test
    void removeNodeWithGivenValueNotExisting() {

        ListNode listNode = ListNode.of(1, 2, 3);

        assertThat(removeLinkedListElts.removeNodeWithGivenValue(listNode, 8)).isEqualTo(listNode);
    }

    @Test
    void removeNodeAllSameValueWithGivenValue() {

        ListNode listNode = ListNode.of(1, 1, 1, 1, 1);

        assertThat(removeLinkedListElts.removeNodeWithGivenValue(listNode, 1)).isEqualTo(null);
    }


    @Test
    void removeNodeWithGivenValueWithUpdatedMethod() {

        ListNode listNode = ListNode.of(1, 2, 8, 3, 4, 5, 8);

        assertThat(removeLinkedListElts.removeNodeWithGivenValueUpdated(listNode, 8)).isEqualTo(ListNode.of(1, 2, 3, 4, 5));
    }

    @Test
    void removeEmptyNodeWithGivenValueWithUpdatedMethod() {

        ListNode listNode = ListNode.of();

        assertThat(removeLinkedListElts.removeNodeWithGivenValueUpdated(listNode, 8)).isEqualTo(null);
    }

    @Test
    void removeNodeWithGivenValueNotExistingWithUpdatedMethod() {

        ListNode listNode = ListNode.of(1, 2, 3);

        assertThat(removeLinkedListElts.removeNodeWithGivenValueUpdated(listNode, 8)).isEqualTo(listNode);
    }

    @Test
    void removeNodeAllSameValueWithGivenValueWithUpdatedMethod() {

        ListNode listNode = ListNode.of(1, 1, 1, 1, 1);

        assertThat(removeLinkedListElts.removeNodeWithGivenValueUpdated(listNode, 1)).isEqualTo(null);
    }

    @Test
    void removeNodeWithGivenValueWithRecursion() {

        ListNode listNode = ListNode.of(1, 2, 8, 3, 4, 5, 8);

        assertThat(removeLinkedListElts.removeNodeWithGivenValueWithRecursion(listNode, 8)).isEqualTo(ListNode.of(1, 2, 3, 4, 5));
    }

    @Test
    void removeEmptyNodeWithGivenValueWithRecursionMethod() {

        ListNode listNode = ListNode.of();

        assertThat(removeLinkedListElts.removeNodeWithGivenValueWithRecursion(listNode, 8)).isEqualTo(null);
    }

    @Test
    void removeNodeWithGivenValueNotExistingWithRecursion() {

        ListNode listNode = ListNode.of(1, 2, 3);

        assertThat(removeLinkedListElts.removeNodeWithGivenValueWithRecursion(listNode, 8)).isEqualTo(listNode);
    }

    @Test
    void removeNodeAllSameValueWithGivenValueWithRecursion() {

        ListNode listNode = ListNode.of(1, 1, 1, 1, 1);

        assertThat(removeLinkedListElts.removeNodeWithGivenValueWithRecursion(listNode, 1)).isEqualTo(null);
    }


}