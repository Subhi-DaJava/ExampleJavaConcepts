package com.uyghur.java.algo.multi_recursion_300623;
/**
 * <h5><a href="https://fr.wikipedia.org/wiki/Triangle_de_Pascal">Link</a></h2>
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 1
 * 1
 * 1       1
 * 1     2     1
 * 1    3    3    1
 * 1   4    6     4   1
 * 1   5   10    10   5   1
 * <p>
 * 1
 * 1   1
 * 1   2   1
 * 1   3   3   1
 * 1   4   6   4   1
 * 1   5   10  10  5   1
 */

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.util.StopWatch;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class PascalSTriangleTest {

    @InjectMocks
    private PascalSTriangle pascalSTriangle;

    @Test
    @DisplayName("Search i = 0 & j = 0 element")
    void findPascalSTriangleElement00() {
        assertThat(pascalSTriangle.findPascalSTriangleElement(0, 0)).isEqualTo(1);
    }

    @Test
    @DisplayName("Search i = 1 & j = 1 element")
    void findPascalSTriangleElement11() {
        assertThat(pascalSTriangle.findPascalSTriangleElement(1, 1)).isEqualTo(1);
    }

    @Test
    @DisplayName("Search i = 2 & j = 0 element")
    void findPascalSTriangleElement20() {
        assertThat(pascalSTriangle.findPascalSTriangleElement(2, 0)).isEqualTo(1);
    }

    @Test
    @DisplayName("Search i = 4 & j = 2 element")
    void findPascalSTriangleElement42() {
        assertThat(pascalSTriangle.findPascalSTriangleElement(4, 2)).isEqualTo(6);
    }

    @Test
    @DisplayName("Search i = 5 & j = 3 element")
    void findPascalSTriangleElement53() {
        assertThat(pascalSTriangle.findPascalSTriangleElement(5, 3)).isEqualTo(10);
    }

    @Test
    void printPascalSTriangleWithoutSpace() {
        pascalSTriangle.printPascalSTriangleWithoutSpace(7);
    }
    /*
    1
    1 1
    1 2 1
    1 3 3 1
    1 4 6 4 1
    1 5 10 10 5 1
    1 6 15 20 15 6 1
     */

    @Test
    void printPascalSTriangleWithFormat() {
        pascalSTriangle.printPascalSTriangleWithFormat(7);
    }
    /*
    1
    1 1
    1 2 1
    1 3 3 1
    1 4 6 4 1
    1 5 10 10 5 1
    1 6 15 20 15 6 1
     */

    @Test
    void printPascalSTriangleWithFormatTriangle() {
        pascalSTriangle.printPascalSTriangleWithSpaceTriangle(6);
    }
    /*
               1     with %-6d
            1     1
         1     2     1
      1     3     3     1
   1     4     6     4     1
1     5     10    10    5     1

 *           1   with %-4d
 *         1   1
 *       1   2   1
 *     1   3   3   1
 *   1   4   6   4   1
 * 1   5   10  10  5   1

     */

    @Test
    void printPascalSTriangleWithSpaceTriangleWithCache10Row() {
        pascalSTriangle.printPascalSTriangleWithSpaceTriangleWithCache2D(10);
    }

    @Test
    void findPascalSTriangleElementWithCache10_4() {
        int[][] triangle = new int[10][9];
        assertThat(pascalSTriangle.findPascalSTriangleElementWithCache2D(triangle, 9, 5)).isEqualTo(126);
    }


    /*
                           1
                        1     1
                     1     2     1
                  1     3     3     1
               1     4     6     4     1
            1     5     10    10    5     1
         1     6     15    20    15    6     1
      1     7     21    35    35    21    7     1
   1     8     28    56    70    56    28    8     1
1     9     36    84    126   126   84    36    9     1


    */


    @Test
    void compareTheTimeComplexityBetweenTwoMethods() {
        int[][] triangle = new int[20][19];
        StopWatch stopWatch = new StopWatch();

        stopWatch.start("findPascalSTriangleElementWithCache method starts....");
        pascalSTriangle.findPascalSTriangleElementWithCache2D(triangle, 19, 15);
        stopWatch.stop();

        stopWatch.start("findPascalSTriangleElement method starts....");
        pascalSTriangle.findPascalSTriangleElement(19, 15);
        stopWatch.stop();

        System.out.println(stopWatch.prettyPrint());
    }

    /*
    StopWatch '': running time = 950299 ns
---------------------------------------------
ns         %     Task name
---------------------------------------------
000046100  005%  findPascalSTriangleElementWithCache method starts....
000904199  095%  findPascalSTriangleElement method starts....


StopWatch '': running time = 523000 ns
---------------------------------------------
ns         %     Task name
---------------------------------------------
000025500  005%  findPascalSTriangleElementWithCache method starts....
000497500  095%  findPascalSTriangleElement method starts....
     */


    @Test
    @Disabled
    void printPascalSTriangleWithSpaceTriangleWithCache1D() {
        StopWatch stopWatch = new StopWatch();

        stopWatch.start("printPascalSTriangleWithSpaceTriangleWithCache1D");
        pascalSTriangle.printPascalSTriangleWithSpaceTriangleWithCache1D(30);
        stopWatch.stop();

        stopWatch.start("printPascalSTriangleWithSpaceTriangleWithCache2D");
        pascalSTriangle.printPascalSTriangleWithSpaceTriangleWithCache2D(30);
        stopWatch.stop();

        stopWatch.start("printPascalSTriangleWithFormat");
        pascalSTriangle.printPascalSTriangleWithFormat(30);
        stopWatch.stop();

        System.out.println(stopWatch.prettyPrint());
    }

    /*
    StopWatch '': running time = 3954461000 ns
---------------------------------------------
ns         %     Task name
---------------------------------------------
058275000  001%  printPascalSTriangleWithSpaceTriangleWithCache1D
036727900  001%  printPascalSTriangleWithSpaceTriangleWithCache2D
3859458100  098%  printPascalSTriangleWithFormat
     */

}