package com.uyghur.java.algo.multi_recursion_300623;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class FibonacciRabbitTest {

    @InjectMocks
    private FibonacciRabbit fibonacciRabbit;

    @Test
    void findRabbitNumberAfter10Months() {
        assertThat(fibonacciRabbit.rabbitNumber(10)).isEqualTo(55);
    }

    @Test
    void findRabbitNumberAfter5Months() {
        assertThat(fibonacciRabbit.rabbitNumber(5)).isEqualTo(5);

    }

    @Test
    void indRabbitNumberAfter8Months() {
        assertThat(fibonacciRabbit.rabbitNumber(8)).isEqualTo(21);
    }
}