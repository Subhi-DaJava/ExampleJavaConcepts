package com.uyghur.java.algo.algo_problems_100723.stack_problems_210823;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class FromFixToSuffixTest {

    private FromFixToSuffix fromFixToSuffix;

    @BeforeEach
    public void setUp() {
        fromFixToSuffix = new FromFixToSuffix();
    }

    @Test
    void priority() {
        char cPlus = '+';
        char cMinus = '-';
        char cMul = '*';
        char cDivision = '/';
        char otherSign = 'o';

        int pPlus = fromFixToSuffix.priority(cPlus);
        int pMinus = fromFixToSuffix.priority(cMinus);
        int pMul = fromFixToSuffix.priority(cMul);
        int pDivision = fromFixToSuffix.priority(cDivision);
       // int pDefault = fromFixToSuffix.priority(otherSign);

        assertAll(
                () -> assertThat(pPlus).isEqualTo(1),
                () -> assertThat(pMinus).isEqualTo(1),
                () -> assertThat(pMul).isEqualTo(2),
                () -> assertThat(pDivision).isEqualTo(2),
                () -> assertThatThrownBy(() -> fromFixToSuffix.priority(otherSign))
                        .isInstanceOf(IllegalArgumentException.class)
                        .hasMessageContaining("Illegal argument: " + otherSign)
        );
    }

    @Test
    void transferInfixToSuffix() {
        String op1 = "a+b"; // ab+
        String op2 = "a+b-c"; // ab+c-
        String op3 = "a*b-c"; // ab*c-
        String op4 = "a*b+c"; // ab*c+
        String op5 = "a+b*c"; // abc*+
        String op6 = "a-b*c"; // abc*-
        String op7 = "a-b*c-d"; // abc*-d-
        String op8 = "a+b*c+d"; // abc*+d+
        String op9 = "(a+b)*c"; // ab+c*
        String op10 = "c*(a-b)"; // cab-*  stack steps : 1. * 2. ( 3.- 4.pop - and ( 5. pop *
        String op11 = "(a-b+c)*d"; // ab-c+d*
        String op12 = "(a-b+c*(e+f)-i)*d"; // ab-cef+*+i-d*
        String op13 = "(a-b*c-d)*i"; // abc*-d-i*

        assertAll(
                () -> assertThat(fromFixToSuffix.transferInfixToSuffix(op1)).isEqualTo("ab+"),
                () -> assertThat(fromFixToSuffix.transferInfixToSuffix(op2)).isEqualTo("ab+c-"),
                () -> assertThat(fromFixToSuffix.transferInfixToSuffix(op3)).isEqualTo("ab*c-"),
                () -> assertThat(fromFixToSuffix.transferInfixToSuffix(op4)).isEqualTo("ab*c+"),
                () -> assertThat(fromFixToSuffix.transferInfixToSuffix(op5)).isEqualTo("abc*+"),
                () -> assertThat(fromFixToSuffix.transferInfixToSuffix(op6)).isEqualTo("abc*-"),
                () -> assertThat(fromFixToSuffix.transferInfixToSuffix(op7)).isEqualTo("abc*-d-"),
                () -> assertThat(fromFixToSuffix.transferInfixToSuffix(op8)).isEqualTo("abc*+d+"),
                () -> assertThat(fromFixToSuffix.transferInfixToSuffix(op9)).isEqualTo("ab+c*"),
                () -> assertThat(fromFixToSuffix.transferInfixToSuffix(op10)).isEqualTo("cab-*"),
                () -> assertThat(fromFixToSuffix.transferInfixToSuffix(op11)).isEqualTo("ab-c+d*"),
                () -> assertThat(fromFixToSuffix.transferInfixToSuffix(op12)).isEqualTo("ab-cef+*+i-d*"),
                () -> assertThat(fromFixToSuffix.transferInfixToSuffix(op13)).isEqualTo("abc*-d-i*")
        );

    }
}