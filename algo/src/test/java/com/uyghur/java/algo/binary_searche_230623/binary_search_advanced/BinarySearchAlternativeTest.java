package com.uyghur.java.algo.binary_searche_230623.binary_search_advanced;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)
class BinarySearchAlternativeTest {
    @InjectMocks
    private BinarySearchAlternative binarySearchAlternative;



    @Test
    @DisplayName("Successfully found the target element")
    public void testSuccess() {
        int[] arr = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75};

        assertThat(binarySearchAlternative.solution(arr, 10)).isEqualTo(1);
        assertThat(binarySearchAlternative.solution(arr, 40)).isEqualTo(7);
        assertThat(binarySearchAlternative.solution(arr, 45)).isEqualTo(8);
        assertThat(binarySearchAlternative.solution(arr, 50)).isEqualTo(9);
    }
    @Test
    @DisplayName("Not found the target element")
    public void testFailed() {
        int[] arr = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75};

        assertThat(binarySearchAlternative.solution(arr, 76)).isEqualTo(-1);
        assertThat(binarySearchAlternative.solution(arr, 6)).isEqualTo(-1);
        assertThat(binarySearchAlternative.solution(arr, 26)).isEqualTo(-1);
        assertThat(binarySearchAlternative.solution(arr, 56)).isEqualTo(-1);
    }

}