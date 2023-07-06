package com.uyghur.java.algo.multi_recursion_300623;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class FibonacciTest {
    @InjectMocks
    private Fibonacci fibonacci;

    @Test
    void findNumberWithIndex0() {
        assertThat(fibonacci.findNumberWithIndex(0)).isEqualTo(0);
    }

    @Test
    void findNumberWithIndex1() {
        assertThat(fibonacci.findNumberWithIndex(1)).isEqualTo(1);
    }

    @Test
    void findNumberWithIndex5() {
        assertThat(fibonacci.findNumberWithIndex(5)).isEqualTo(5);

    }

    @Test
    void findNumberWithIndex10() {
        assertThat(fibonacci.findNumberWithIndex(10)).isEqualTo(55);
    }

}