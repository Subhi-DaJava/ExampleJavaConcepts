package com.uyghur.java.algo.single_recursion_280623;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class BinarySearchWithRecursionTest {
    @InjectMocks
    private BinarySearchWithRecursion binarySearchWithRecursion;

    @Test
    void binarySearchWithSuccess() {
        int[] arr = {2,5,7,8,11,25,53,76,99,102,147};

        assertThat(binarySearchWithRecursion.search(arr, 5)).isEqualTo(1);
        assertThat(binarySearchWithRecursion.search(arr, 11)).isEqualTo(4);
        assertThat(binarySearchWithRecursion.search(arr, 76)).isEqualTo(7);
        assertThat(binarySearchWithRecursion.search(arr, 147)).isEqualTo(10);
    }

    @Test
    void binarySearchWithFailure() {
        int[] arr = {2,5,7,8,11,25,53,76,99,102,147};

        assertThat(binarySearchWithRecursion.search(arr, 4)).isEqualTo(-1);
        assertThat(binarySearchWithRecursion.search(arr, 12)).isEqualTo(-1);
        assertThat(binarySearchWithRecursion.search(arr, 77)).isEqualTo(-1);
        assertThat(binarySearchWithRecursion.search(arr, 137)).isEqualTo(-1);
    }
}