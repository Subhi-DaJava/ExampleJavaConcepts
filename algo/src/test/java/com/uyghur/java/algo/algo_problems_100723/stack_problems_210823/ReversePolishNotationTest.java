package com.uyghur.java.algo.algo_problems_100723.stack_problems_210823;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReversePolishNotationTest {

    private ReversePolishNotation reversePolishNotation;

    @BeforeEach
    public void setUp() {
        reversePolishNotation = new ReversePolishNotation();
    }
    @Test
    void rpnEx1() {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int result = reversePolishNotation.rpn(tokens);
        assertThat(result).isEqualTo(9);
    }
    @Test
    void rpnEx2() {
        String[] tokens = {"4", "13", "5", "/", "+"};
        int result = reversePolishNotation.rpn(tokens);
        assertThat(result).isEqualTo(6);
    }
    @Test
    void rpnEx3() {
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        int result = reversePolishNotation.rpn(tokens);
        assertThat(result).isEqualTo(22);
    }
}