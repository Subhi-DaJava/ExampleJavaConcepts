package com.uyghur.java.algo.multi_recursion_300623;

/**
 * <h5><a href="https://fr.wikipedia.org/wiki/Triangle_de_Pascal">Link</a></h2>
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 1
 * number of spaces : (row - 1 - i) * 2
 *            1                       10
 *        1       1                  8
 *      1     2     1                6
 *    1    3    3    1              4
 *   1   4    6     4   1           2
 * 1   5   10    10   5   1        0
 * 1
 * 1   1
 * 1   2   1
 * 1   3   3   1
 * 1   4   6   4   1
 * 1   5   10  10  5   1
 */
public class PascalSTriangle {

    public int findPascalSTriangleElement(int i, int j) {
        if (j == 0 || i == j) {
            return 1;
        }

        return findPascalSTriangleElement(i - 1, j - 1) + findPascalSTriangleElement(i - 1, j);
    }

    public void printPascalSTriangleWithoutSpace(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(findPascalSTriangleElement(i, j) + " ");
            }
            System.out.println();
        }
    }

    public void printPascalSTriangleWithFormat(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-4d", findPascalSTriangleElement(i, j));
            }
            System.out.println();
        }
    }

    public void printPascalSTriangleWithSpaceTriangle(int row) {
        for (int i = 0; i < row; i++) {
            printSpaceForEveryRow(row, i);
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-6d", findPascalSTriangleElement(i, j)); // System.out.printf("%-4d",findPascalSTriangleElement(i, j));
            }
            System.out.println();
        }
    }

    private void printSpaceForEveryRow(int row, int i) {
        int spaceNumber = (row - 1 - i) * 3;  // row - 1 - i) * 3
        for (int j = 0; j < spaceNumber; j++) {
            System.out.print(" ");
        }
    }

    // with cache 2D

    public int findPascalSTriangleElementWithCache2D(int[][] triangle, int i, int j) {
        if (triangle[i][j] > 0) {
            return triangle[i][j];
        }
        if (j == 0 || i == j) {
            triangle[i][j] = 1;
            return 1;
        }
        triangle[i][j] = findPascalSTriangleElementWithCache2D(triangle, i - 1, j - 1) + findPascalSTriangleElementWithCache2D(triangle, i - 1, j);
        return triangle[i][j];
    }

    public void printPascalSTriangleWithSpaceTriangleWithCache2D(int row) {
        int[][] triangle = new int[row][];

        for (int i = 0; i < row; i++) {

            triangle[i] = new int[i + 1];

            printSpaceForEveryRow(row, i);
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-6d", findPascalSTriangleElementWithCache2D(triangle, i, j)); // System.out.printf("%-4d",findPascalSTriangleElement(i, j));
            }
            System.out.println();
        }
    }

    // with cache 1D
    /*
     * 0   0   0   0   0   0
     * 1   0   0   0   0   0 i=0
     * 1   1   0   0   0   0 i=1
     * 1   2   1   0   0   0 i=2
     * 1   3   3   1   0   0 i=3
     * create new row with last row
     * 1  (3+3)   (3+3)   (3+1)  (1+0)  0 i=4
     *
     */

    public void printPascalSTriangleWithSpaceTriangleWithCache1D(int rowNumber) {
        int[] row = new int[rowNumber];

        for (int i = 0; i < rowNumber; i++) {

            createNewRow(row, i);

            for (int j = 0; j <= i; j++) {
                System.out.printf("%-6d", row[j]);
            }
            System.out.println();
        }
    }

    // i th row
    private void createNewRow(int[] row, int i) {
        if (i==0) {
            row[0] = 1;
            return;
        }

        for (int j = i; j > 0; j--) {
            row[j] = row[j] + row[j-1];
        }
    }
}
