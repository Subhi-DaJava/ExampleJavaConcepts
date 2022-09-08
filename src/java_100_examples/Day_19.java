package java_100_examples;

/**
 * Problem : Add two Arrays with integers
 * Input : {1,2,3} & {4,5,6}
 * Output : {1,2,3,4,5,6}
 */
public class Day_19 {
    public static void main(String[] args) {
        int[] arr1 = {0,1,2,3,4,5};
        int[] arr2 = {6,7,8,9};
        int[] newArr = new int[arr1.length + arr2.length];
        int indexNewArr = 0;

        for (int i : arr1){
            newArr[indexNewArr++] = i;
        }
        for (int i : arr2){
            newArr[indexNewArr++] = i;
        }
        for (int i : newArr){
            System.out.print(i + " ");
        }
    }
}
