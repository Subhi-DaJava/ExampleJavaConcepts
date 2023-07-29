package com.uyghur.java.algo.algo_problems_100723.merget_two_sroted_array_290723;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
@ExtendWith(MockitoExtension.class)
class MergeTwoSortedArraysTest {

    @InjectMocks
    private MergeTwoSortedArrays mergeTwoSortedArrays;

    @Test
    void mergeArray() {
        int[] num1 = {1,2,3,5,2,4,5,6,7,8};
        int[] num2 = new int[num1.length];
        mergeTwoSortedArrays.mergeArray(num1, 0, 3, 4, 9, num2, 0);
        assertThat(num2).isEqualTo(new int[]{1, 2, 2, 3, 4, 5, 5, 6, 7, 8});
        assertThat(num1).isEqualTo(num2);
    }

    @Test
    void mergeArrayWithTwoElements() {
        int[] num1 = {1,0};
        int[] num2 = new int[2];
        mergeTwoSortedArrays.mergeArray(num1, 0, 0, 1, 1, num2, 0);
        assertThat(num2).isEqualTo(new int[]{0,1});
        assertThat(num1).isEqualTo(num2);
    }

    @Test
    void mergeArrayWithSomeZerosInBetween() {
        int[] num1 = {1,0,0,0,0,0,2,5,6};
        int[] num2 = new int[num1.length];
        mergeTwoSortedArrays.mergeArray(num1, 0, 0, 1, 8, num2, 0);
        assertThat(num2).isEqualTo(new int[]{0,0,0,0,0,1,2,5,6});
        assertThat(num1).isEqualTo(num2);
    }
    @Test
    void mergeArrayWithSomeZerosAtBegin() {
        int[] num1 = {0,0,0,0,0,2,5,6,1,3,4};
        int[] num2 = new int[num1.length];
        mergeTwoSortedArrays.mergeArray(num1, 0, 7, 8, 10, num2, 0);
        assertThat(num2).isEqualTo(new int[]{0,0,0,0,0,1,2,3,4,5,6});
        assertThat(num1).isEqualTo(num2);
    }

    @Test
    void mergeArrayWithSomeZeros() {
        int[] num1 = {0,0,0,0,0,0,0};
        int[] num2 = new int[num1.length];
        mergeTwoSortedArrays.mergeArray(num1, 0, 0, 0, 0, num2, 0);
        assertThat(num2).isEqualTo(new int[]{0,0,0,0,0,0,0});
        assertThat(num1).isEqualTo(num2);
    }


    @Test
    void mergeArrayWithLoop() {
        int[] num1 = {1,2,3,5,2,4,5,6,7,8};
        int[] num2 = new int[num1.length];
        mergeTwoSortedArrays.mergeArrayWithLoopMethod(num1, 0, 3, 4, 9, num2);
        assertThat(num2).isEqualTo(new int[]{1, 2, 2, 3, 4, 5, 5, 6, 7, 8});
        assertThat(num1).isEqualTo(num2);
    }

    @Test
    void mergeArrayWithTwoElementsWithLoop() {
        int[] num1 = {1,0};
        int[] num2 = new int[2];
        mergeTwoSortedArrays.mergeArrayWithLoopMethod(num1, 0, 0, 1, 1, num2);
        assertThat(num2).isEqualTo(new int[]{0,1});
        assertThat(num1).isEqualTo(num2);
    }

    @Test
    void mergeArrayWithSomeZerosInBetweenWithLoop() {
        int[] num1 = {1,0,0,0,0,0,2,5,6};
        int[] num2 = new int[num1.length];
        mergeTwoSortedArrays.mergeArrayWithLoopMethod(num1, 0, 0, 1, 8, num2);
        assertThat(num2).isEqualTo(new int[]{0,0,0,0,0,1,2,5,6});
        assertThat(num1).isEqualTo(num2);
    }
    @Test
    void mergeArrayWithSomeZerosAtBeginWithLoop() {
        int[] num1 = {0,0,0,0,0,2,5,6,1,3,4};
        int[] num2 = new int[num1.length];
        mergeTwoSortedArrays.mergeArrayWithLoopMethod(num1, 0, 7, 8, 10, num2);
        assertThat(num2).isEqualTo(new int[]{0,0,0,0,0,1,2,3,4,5,6});
        assertThat(num1).isEqualTo(num2);
    }

    @Test
    void mergeArrayWithSomeZerosWithLoop() {
        int[] num1 = {0,0,0,0,0,0,0};
        int[] num2 = new int[num1.length];
        mergeTwoSortedArrays.mergeArrayWithLoopMethod(num1, 0, 0, 0, 0, num2);
        assertThat(num2).isEqualTo(new int[]{0,0,0,0,0,0,0});
        assertThat(num1).isEqualTo(num2);
    }

    @Test
    void mergeArrayWithOtherMethod() {
        int[] num1 = {1,2,3,5,0,0,0,0,0,0};
        int[] num2 = {2,4,5,6,7,8};
        mergeTwoSortedArrays.merge(num1, 4, num2, 6);
        assertThat(num1).isEqualTo(new int[]{1, 2, 2, 3, 4, 5, 5, 6, 7, 8});
    }

    @Test
    void mergeArrayWithOneElementOtherMethod() {
        int[] num1 = {1};
        int[] num2 = new int[0];
        mergeTwoSortedArrays.merge(num1, 0, num2, 0) ;
        assertThat(num1).isEqualTo(new int[]{1});
    }


    @Test
    void mergeArrayNums2LongerThanNums1OtherMethod() {
        int[] num1 = {1,2,0,0,0,0,0,0,0};
        int[] num2 = {2,4,5,6,7,8,9};
        mergeTwoSortedArrays.merge(num1, 2, num2, 7);
        assertThat(num1).isEqualTo(new int[]{1,2,2,4,5,6,7,8,9});
    }

    @Test
    void mergeArrayNums1LongerThanNums2OtherMethod() {
        int[] num1 = {1,2,4,5,6,7,8,9,0,0,0};
        int[] num2 = {2,8,9};
        mergeTwoSortedArrays.merge(num1, 8, num2, 3);
        assertThat(num1).isEqualTo(new int[]{1,2,2,4,5,6,7,8,8,9,9});
    }
}