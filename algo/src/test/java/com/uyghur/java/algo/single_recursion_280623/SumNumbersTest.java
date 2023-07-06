package com.uyghur.java.algo.single_recursion_280623;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
@ExtendWith(MockitoExtension.class)
class SumNumbersTest {

    @InjectMocks
    private SumNumbers sumNumbers;

    @Test
    void sumOf100() {
        assertThat(sumNumbers.sum(100)).isEqualTo(5050);
    }

    @Test
    void sumOf10000() {
        assertThat(sumNumbers.sum(10000)).isEqualTo(50005000);
    }

    @Test
    void sumOf15000() {
        //assertThat(sumNumbers.sum(15000)).isEqualTo(50005000);
        assertThatThrownBy(() -> sumNumbers.sum(15000))
                .isInstanceOf(StackOverflowError.class);
    }

    @Test
    void sumOf15000WithUpdatedMethod() {
        assertThatThrownBy(() -> sumNumbers.sum(15000))
                .isInstanceOf(StackOverflowError.class);
    }

    @Test
    void sumOfNumbersWithLoop() {
        assertThat(sumNumbers.sumOfNNumbers(100)).isEqualTo(5050L);
        assertThat(sumNumbers.sumOfNNumbers(300000)).isEqualTo(45000150000L);
    }

    @Test
    void sumOf100WitSumUpdatedMethod() {

        assertThat(sumNumbers.sumUpdated(100)).isEqualTo(5050);
    }

}