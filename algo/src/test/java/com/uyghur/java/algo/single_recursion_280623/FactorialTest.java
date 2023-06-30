package com.uyghur.java.algo.single_recursion_280623;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


@ExtendWith(MockitoExtension.class)
class FactorialTest {

    @InjectMocks
    private Factorial factorial;
    @Test
    public void returnFactorialWithAPositiveNumber() {
        assertThat(factorial.function(3)).isEqualTo(6);
        assertThat(factorial.function(4)).isEqualTo(24);
    }

    @Test
    public void returnFactorialWith1() {
        assertThat(factorial.function(1)).isEqualTo(1);
    }

    @Test
    public void returnFactorialWithNegativeAndZeroNumber() {
        assertThat(factorial.function(0)).isEqualTo(1);
        assertThatThrownBy(() -> factorial.function(-5))
                .isInstanceOf(RuntimeException.class)
                .hasMessageContaining("n should be positive number");
    }
}