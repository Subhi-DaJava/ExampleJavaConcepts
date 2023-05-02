package multi_dimensional_array;

import java.util.Scanner;

/**
 * input :
 * 3 4
 * 1 2 3 4
 * 0 2 3 5
 * 5 6 4 7
 * output:
 * 2 3
 */
public class MaxEltMatrix {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] matrix = new int[n][m];

            // read in the matrix
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            // find the maximum element and its indexes
            int maxElement = matrix[0][0];
            int maxRow = 0;
            int maxCol = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (matrix[i][j] > maxElement) {
                        maxElement = matrix[i][j];
                        maxRow = i;
                        maxCol = j;
                    }
                }
            }

            // output the result
            System.out.println(maxRow + " " + maxCol);
        }


}
