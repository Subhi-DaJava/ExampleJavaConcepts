package multi_dimensional_array;
/**
 * Symmetric matrix
 * Given the number n, not exceeding 10, and a matrix of size n × n.
 *
 * Check whether this matrix is symmetric in relation to the main diagonal. Output the word “YES”, if it is symmetric and the word “NO” otherwise.
 *
 * Keep in mind that the main diagonal runs from the top left corner to the bottom right corner.
 *
 * Sample Input 1:
 *
 * 3
 * 0 1 2
 * 1 2 3
 * 2 3 4
 * YES
 *
 * 3
 * 1 2 3 4
 * 12 3 3
 * 12 3 3
 * NO
 * */
import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean isSymmetric = true;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
        }

        if (isSymmetric) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
