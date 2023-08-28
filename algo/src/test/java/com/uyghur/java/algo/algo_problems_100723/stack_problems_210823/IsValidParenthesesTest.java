package com.uyghur.java.algo.algo_problems_100723.stack_problems_210823;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class IsValidParenthesesTest {

    private IsValidParentheses isValidParentheses;

    @BeforeEach
    public void setUp() {
        isValidParentheses = new IsValidParentheses();
    }

    @Test
    void isValidWithNestedBrackets() {
        String str = "[({[{{()}}]})]";

        boolean isValid = isValidParentheses.isValid(str);

        assertThat(isValid).isTrue();

    }

    @Test
    void isValidReturnTrue() {
        String str = "[]";

        boolean isValid = isValidParentheses.isValid(str);

        assertThat(isValid).isTrue();

    }

    @Test
    void isValidWithThreeBracketsReturnTrue() {
        String str = "()[]{}";

        boolean isValid = isValidParentheses.isValid(str);

        assertThat(isValid).isTrue();

    }

    @Test
    void isValidWithThreeBracketsNestedReturnTrue() {
        String str =  "([{}])";

        boolean isValid = isValidParentheses.isValid(str);

        assertThat(isValid).isTrue();

    }
    @Test
    void isValidReturnFalse() {
        String str = "({[})]";

        boolean isValid = isValidParentheses.isValid(str);

        assertThat(isValid).isFalse();

    }

    @Test
    void isValidWithTwoBracketsReturnFalse() {
        String str = "(]";

        boolean isValid = isValidParentheses.isValid(str);

        assertThat(isValid).isFalse();

    }

    @Test
    void isValidWithTwoBracketsLeftSideReturnFalse() {
        String str = "((";

        boolean isValid = isValidParentheses.isValid(str);

        assertThat(isValid).isFalse();

    }

    @Test
    void isValidWithTwoBracketsLeftSideAndRightSideReturnFalse() {
        String str = ")(";

        boolean isValid = isValidParentheses.isValid(str);

        assertThat(isValid).isFalse();

    }

    @Test
    void isValidWithOnlyRightSideReturnFalse() {
        String str = ")";

        boolean isValid = isValidParentheses.isValid(str);

        assertThat(isValid).isFalse();

    }
    @Test
    void isValidWithOnlyLeftSideAndPairBracketReturnFalse() {
        String str = "([]";

        boolean isValid = isValidParentheses.isValid(str);

        assertThat(isValid).isFalse();

    }
    @Test
    void isValidWithMixedBracketsReturnFalse() {
        String str = "({)}";

        boolean isValid = isValidParentheses.isValid(str);

        assertThat(isValid).isFalse();

    }
}