package com.uyghur.java.algo.algo_problems_100723.Floyd_s_Cycle_Finding_Algorithm_280723;

import com.uyghur.java.algo.algo_problems_100723.ListNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class FloydSCycleFindingAlgorithmTest {

    @InjectMocks
    private FloydSCycleFindingAlgorithm floydSCycleFindingAlgorithm;

    @Test
    void isCycleShouldReturnTrueWithTwoNodes() {

        ListNode n2 = new ListNode(2, null);
        ListNode n1 = new ListNode(1, n2);
        n2.next = n1;

        assertThat(floydSCycleFindingAlgorithm.isCycle(n1)).isTrue();
    }

    @Test
    void isCycleShouldReturnFalseWithTwoNodes() {

        ListNode n2 = new ListNode(2, null);
        ListNode n1 = new ListNode(1, n2);

        assertThat(floydSCycleFindingAlgorithm.isCycle(n1)).isFalse();
    }
    @Test
    void isCycleShouldReturnTrue() {

        ListNode n15 = new ListNode(15, null);
        ListNode n14 = new ListNode(14, n15);
        ListNode n13 = new ListNode(13, n14);
        ListNode n12 = new ListNode(12, n13);
        ListNode n11 = new ListNode(11, n12);
        ListNode n10 = new ListNode(10, n11);
        ListNode n9 = new ListNode(9, n10);
        ListNode n8 = new ListNode(8, n9);
        ListNode n7 = new ListNode(7, n8);
        ListNode n6 = new ListNode(6, n7);
        ListNode n5 = new ListNode(5, n6);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

         n15.next = n10;

        assertThat(floydSCycleFindingAlgorithm.isCycle(n1)).isTrue();
    }

    @Test
    void isCycleShouldReturnFalse() {

        ListNode n15 = new ListNode(15, null);
        ListNode n14 = new ListNode(14, n15);
        ListNode n13 = new ListNode(13, n14);
        ListNode n12 = new ListNode(12, n13);
        ListNode n11 = new ListNode(11, n12);
        ListNode n10 = new ListNode(10, n11);
        ListNode n9 = new ListNode(9, n10);
        ListNode n8 = new ListNode(8, n9);
        ListNode n7 = new ListNode(7, n8);
        ListNode n6 = new ListNode(6, n7);
        ListNode n5 = new ListNode(5, n6);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);


        assertThat(floydSCycleFindingAlgorithm.isCycle(n1)).isFalse();
    }

    @Test
    void isCycleShouldReturnTrueWithEmptyList() {
        assertThat(floydSCycleFindingAlgorithm.isCycle(null)).isFalse();
    }

    @Test
    void isCycleShouldReturnN1WithTwoNodes() {

        ListNode n2 = new ListNode(2, null);
        ListNode n1 = new ListNode(1, n2);
        n2.next = n1;

        assertThat(floydSCycleFindingAlgorithm.findCycleNode(n1)).isEqualTo(n1);
    }

    @Test
    void isCycleShouldReturnTrueWhenLinkedWithStartAndEndPoints() {

        ListNode n15 = new ListNode(15, null);
        ListNode n14 = new ListNode(14, n15);
        ListNode n13 = new ListNode(13, n14);
        ListNode n12 = new ListNode(12, n13);
        ListNode n11 = new ListNode(11, n12);
        ListNode n10 = new ListNode(10, n11);
        ListNode n9 = new ListNode(9, n10);
        ListNode n8 = new ListNode(8, n9);
        ListNode n7 = new ListNode(7, n8);
        ListNode n6 = new ListNode(6, n7);
        ListNode n5 = new ListNode(5, n6);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

        n15.next = n1;

        assertThat(floydSCycleFindingAlgorithm.isCycle(n1)).isTrue();
    }


    @Test
    void findCycleNodeShouldReturn10() {
        ListNode n15 = new ListNode(15, null);
        ListNode n14 = new ListNode(14, n15);
        ListNode n13 = new ListNode(13, n14);
        ListNode n12 = new ListNode(12, n13);
        ListNode n11 = new ListNode(11, n12);
        ListNode n10 = new ListNode(10, n11);
        ListNode n9 = new ListNode(9, n10);
        ListNode n8 = new ListNode(8, n9);
        ListNode n7 = new ListNode(7, n8);
        ListNode n6 = new ListNode(6, n7);
        ListNode n5 = new ListNode(5, n6);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

        n15.next = n10;

        assertThat(floydSCycleFindingAlgorithm.findCycleNode(n1)).isEqualTo(n10);
    }

    @Test
    void findCycleNodeShouldReturn7() {
        ListNode n15 = new ListNode(15, null);
        ListNode n14 = new ListNode(14, n15);
        ListNode n13 = new ListNode(13, n14);
        ListNode n12 = new ListNode(12, n13);
        ListNode n11 = new ListNode(11, n12);
        ListNode n10 = new ListNode(10, n11);
        ListNode n9 = new ListNode(9, n10);
        ListNode n8 = new ListNode(8, n9);
        ListNode n7 = new ListNode(7, n8);
        ListNode n6 = new ListNode(6, n7);
        ListNode n5 = new ListNode(5, n6);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

        n15.next = n7;

        assertThat(floydSCycleFindingAlgorithm.findCycleNode(n1)).isEqualTo(n7);
    }

    @Test
    void findCycleNodeShouldReturn1() {
        ListNode n15 = new ListNode(15, null);
        ListNode n14 = new ListNode(14, n15);
        ListNode n13 = new ListNode(13, n14);
        ListNode n12 = new ListNode(12, n13);
        ListNode n11 = new ListNode(11, n12);
        ListNode n10 = new ListNode(10, n11);
        ListNode n9 = new ListNode(9, n10);
        ListNode n8 = new ListNode(8, n9);
        ListNode n7 = new ListNode(7, n8);
        ListNode n6 = new ListNode(6, n7);
        ListNode n5 = new ListNode(5, n6);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

        n15.next = n1;

        assertThat(floydSCycleFindingAlgorithm.findCycleNode(n1)).isEqualTo(n1);
    }

    @Test
    void findCycleNodeShouldReturnNull() {
        ListNode n15 = new ListNode(15, null);
        ListNode n14 = new ListNode(14, n15);
        ListNode n13 = new ListNode(13, n14);
        ListNode n12 = new ListNode(12, n13);
        ListNode n11 = new ListNode(11, n12);
        ListNode n10 = new ListNode(10, n11);
        ListNode n9 = new ListNode(9, n10);
        ListNode n8 = new ListNode(8, n9);
        ListNode n7 = new ListNode(7, n8);
        ListNode n6 = new ListNode(6, n7);
        ListNode n5 = new ListNode(5, n6);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

        assertThat(floydSCycleFindingAlgorithm.findCycleNode(n1)).isEqualTo(null);
    }

    @Test
    void findCycleNodeShouldReturn5() {
        ListNode n15 = new ListNode(15, null);
        ListNode n14 = new ListNode(14, n15);
        ListNode n13 = new ListNode(13, n14);
        ListNode n12 = new ListNode(12, n13);
        ListNode n11 = new ListNode(11, n12);
        ListNode n10 = new ListNode(10, n11);
        ListNode n9 = new ListNode(9, n10);
        ListNode n8 = new ListNode(8, n9);
        ListNode n7 = new ListNode(7, n8);
        ListNode n6 = new ListNode(6, n7);
        ListNode n5 = new ListNode(5, n6);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

        n15.next = n5;

        assertThat(floydSCycleFindingAlgorithm.findCycleNode(n1)).isEqualTo(n5);
    }
}