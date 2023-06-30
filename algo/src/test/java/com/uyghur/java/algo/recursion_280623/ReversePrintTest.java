package com.uyghur.java.algo.recursion_280623;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class ReversePrintTest {

    @InjectMocks
    private ReversePrint reversePrint;

    @Test
    public void reverseStringTest() {
        String str = "string";
        reversePrint.reverseStringPrint(str);
    }
    @Test
    public void reverseStringPrintTest() {
        String str = "string";
        String reverseStr = reversePrint.returnReverseString(0, str);
        assertThat(reverseStr).isEqualTo("gnirts");
    }

    @Test
    public void reverseSrtTest() {
        String str = "string";
        reversePrint.reversePrintStr(0, str);

    }


}