package com.uyghur.java.algo.binary_searche_230623.right_most;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)
class BinarySearchRightMostTest {
    @InjectMocks
    private BinarySearchRightMost binarySearchRightMost;

    @Test
    @DisplayName("Successfully found the target element")
    public void testSuccess() {
        int[] arr = {5, 7, 7, 7, 8, 8, 10, 10, 20, 25, 30, 35, 40, 40, 45, 45, 45, 50, 50, 55, 60, 65, 70, 75};

        assertThat(binarySearchRightMost.solution(arr, 7)).isEqualTo(3);
        assertThat(binarySearchRightMost.solution(arr, 10)).isEqualTo(7);
        assertThat(binarySearchRightMost.solution(arr, 40)).isEqualTo(13);
        assertThat(binarySearchRightMost.solution(arr, 45)).isEqualTo(16);
        assertThat(binarySearchRightMost.solution(arr, 50)).isEqualTo(18);
    }
    @Test
    @DisplayName("Not found the target element")
    public void testFailed() {
        int[] arr = {5, 7, 7, 7, 8, 8, 10, 10, 20, 25, 30, 35, 40, 40, 45, 45, 45, 50, 50, 55, 60, 65, 70, 75};

        assertThat(binarySearchRightMost.solution(arr, 76)).isEqualTo(-1);
        assertThat(binarySearchRightMost.solution(arr, 6)).isEqualTo(-1);
        assertThat(binarySearchRightMost.solution(arr, 26)).isEqualTo(-1);
        assertThat(binarySearchRightMost.solution(arr, 56)).isEqualTo(-1);
    }
}