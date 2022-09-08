package java_100_examples;

import java.util.Scanner;

/**
 * Problem : Search an element in an array
 * Input : {1,5,2,3,-3,8,11} & 3
 * Output : at index of 3
 * The better way to find an element is BinarySearch !!
 */
public class Day_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,5,2,3,-3,8,11};
        System.out.println("Enter an number : "); // Only a positif number, better to create a loop for the check of the enter
        int elt = in.nextInt();
        int index = getTheIndexOfElement(arr, elt);

        if(index == -1) {
            System.out.println("The element :{" + elt +  "} does not existe in this Array.");
        } else {
            System.out.println("The element :{" + elt + "} is at the index of : " + index);
        }
    }

    public static int getTheIndexOfElement(int[] arr, int elt){
        for(int i=0; i < arr.length; i++){
            if(arr[i] == elt){
                return i;
            }
        }
        return -1;
    }
}
