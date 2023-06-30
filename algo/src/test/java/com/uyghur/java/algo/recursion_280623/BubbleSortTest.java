package com.uyghur.java.algo.recursion_280623;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class BubbleSortTest {
    @InjectMocks
    private BubbleSort bubbleSort;

    @Test
    void sortWithoutRecursionWithSuccess() {
        int[] arr = {8,71,21,5,11,9,13,76,99,102,147};

        System.out.println(Arrays.toString(arr));

        bubbleSort.sortWithoutRecursion(arr);

        assertThat(arr).isEqualTo(new int[]{8, 21, 5, 11, 9, 13, 71, 76, 99, 102, 147});  // [8, 21, 5, 11, 9, 13, 71, 76, 99, 102, 147]
    }

    @Test
    void sortWithRecursionWithSuccess() {
        int[] arr = {8,71,21,5,11,9,13,76,99,102,147};

        System.out.println(Arrays.toString(arr));

        bubbleSort.sortWithRecursion(arr);

        assertThat(arr).isEqualTo(new int[]{5,8,9,11,13, 21, 71, 76, 99, 102, 147});
    }

    @Test
    void sortWithRecursionUpdatedWithSuccess() {
        int[] arr = {8,71,21,5,11,9,13,76,99,102,147};

        System.out.println(Arrays.toString(arr));

        bubbleSort.sortWithRecursionUpdated(arr);

        assertThat(arr).isEqualTo(new int[]{5,8,9,11,13, 21, 71, 76, 99, 102, 147});
    }
}