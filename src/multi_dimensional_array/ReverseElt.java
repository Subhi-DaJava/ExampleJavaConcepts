package multi_dimensional_array;

import java.util.Arrays;

/**
 * Reverse elements
 * In this task, you need to implement reverseElements method. It should reverse all rows of the twoDimArray as in the example below.
 * <p>
 * 0 0 9 9              9 9 0 0
 * 1 2 3 4 will become: 4 3 2 1
 * 5 6 7 8              8 7 6 5
 * It is guaranteed that twoDimArray has at least 1 row.
 * <p>
 * P.S. You don't need to print anything in this task or create a new array: just modify the existing twoDimArray.
 */
public class ReverseElt {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[][]{{0, 0, 9, 9}, {1, 2, 3, 4}, {5, 6, 7, 8}};
        reverseElements(twoDimArray);
        System.out.println(Arrays.toString(twoDimArray[0]));
        System.out.println(Arrays.toString(twoDimArray[1]));
        System.out.println(Arrays.toString(twoDimArray[2]));
        System.out.println("*******************************************************");
        int[][] oneDimArray = new int[][]{{0, 0, 9, 1}}; // 1, 9, 0, 0
        reverseElements(oneDimArray);
        System.out.println(Arrays.toString(oneDimArray[0]));
    }

    public static void reverseElements(int[][] twoDimArray) {
   /*     if(twoDimArray.length == 1) {
            for (int i = 0, j = 1; j < twoDimArray[0].length-1; i++, j++) {
                int temp = twoDimArray[0][i];
                twoDimArray[0][i] = twoDimArray[0][twoDimArray[0].length - j];
                twoDimArray[0][twoDimArray[0].length - j] = temp;
            }
        } else {*/
  /*          for(int i = 0; i < twoDimArray.length; i++) {
                for(int j = 0, k = 1; j < twoDimArray[i].length && k < twoDimArray[i].length -1; j++, k++) {
                    int temp = twoDimArray[i][j];
                    twoDimArray[i][j] = twoDimArray[i][twoDimArray[i].length-k];
                    twoDimArray[i][twoDimArray[i].length-k] = temp;
                }
            //}
        }*/

        for (int j = 0; j < twoDimArray.length; j++) {
            for (int i = 0; i < twoDimArray[j].length / 2; i++) {
                int temp = twoDimArray[j][i];
                twoDimArray[j][i] = twoDimArray[j][twoDimArray[j].length - i - 1];
                twoDimArray[j][twoDimArray[j].length - i - 1] = temp;
            }
        }

    }
}
