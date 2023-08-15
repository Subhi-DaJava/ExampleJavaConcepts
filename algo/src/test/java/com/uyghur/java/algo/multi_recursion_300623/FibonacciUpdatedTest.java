package com.uyghur.java.algo.multi_recursion_300623;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.util.StopWatch;

import static org.assertj.core.api.Assertions.assertThat;
@ExtendWith(MockitoExtension.class)
class FibonacciUpdatedTest {
    @InjectMocks
    private FibonacciUpdated fibonacciUpdated;

    @Test
    void fibonacci() {
        assertThat(fibonacciUpdated.fibonacci(5)).isEqualTo(5);
        assertThat(fibonacciUpdated.fibonacci(6)).isEqualTo(8);
        assertThat(fibonacciUpdated.fibonacci(7)).isEqualTo(13);
        assertThat(fibonacciUpdated.fibonacci(8)).isEqualTo(21);
        assertThat(fibonacciUpdated.fibonacci(9)).isEqualTo(34);
        assertThat(fibonacciUpdated.fibonacci(10)).isEqualTo(55);
        assertThat(fibonacciUpdated.fibonacci(11)).isEqualTo(89);
        assertThat(fibonacciUpdated.fibonacci(12)).isEqualTo(144);
        assertThat(fibonacciUpdated.fibonacci(13)).isEqualTo(233);
        assertThat(fibonacciUpdated.fibonacci(14)).isEqualTo(377);
    }

    @Test
    void fibonacciOriginal() {
        assertThat(fibonacciUpdated.fibonacciOriginal(5)).isEqualTo(5);
        assertThat(fibonacciUpdated.fibonacciOriginal(6)).isEqualTo(8);
        assertThat(fibonacciUpdated.fibonacciOriginal(7)).isEqualTo(13);
        assertThat(fibonacciUpdated.fibonacciOriginal(8)).isEqualTo(21);
        assertThat(fibonacciUpdated.fibonacciOriginal(9)).isEqualTo(34);
        assertThat(fibonacciUpdated.fibonacciOriginal(10)).isEqualTo(55);
        assertThat(fibonacciUpdated.fibonacciOriginal(11)).isEqualTo(89);
        assertThat(fibonacciUpdated.fibonacciOriginal(12)).isEqualTo(144);
        assertThat(fibonacciUpdated.fibonacciOriginal(13)).isEqualTo(233);
        assertThat(fibonacciUpdated.fibonacciOriginal(14)).isEqualTo(377);
    }

    @Test
    void compareTowMethods() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("fibonacci with BigO(N) time complexity");
        fibonacciUpdated.fibonacci(35);
        stopWatch.stop();

        stopWatch.start("fibonacci with Zita(1.618^n) time complexity");
        fibonacciUpdated.fibonacciOriginal(35);
        stopWatch.stop();

        System.out.println(stopWatch.prettyPrint());
    }

    /*
    StopWatch '': running time = 74969100 ns
    ---------------------------------------------
    ns         %     Task name
    ---------------------------------------------
    000024400  000%  fibonacci with BigO(N) time complexity
    074944700  100%  fibonacci with Zita(1.618^n) time complexity
     */
}