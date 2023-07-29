package com.uyghur.java.algo.algo_problems_100723.merget_two_sroted_array_290723;

import java.util.Arrays;

/**
 * You are given one integer array nums1, sorted in non-decreasing order in two parts and one integer array num2 with the same number of elements of nums1
 * Merge nums1 (two parts in non-decreasing order) array sorted in non-decreasing order.
 * input nums1 = [1,2,3,2,4,5,6], nums2 = new int[nums1.length]
 * output : nums2 or nums1 = [1,2,2,3,4,5,6]
 *
 * merge([1,2,3],[2,4,5,6], sum2[]){
 *     merge([2,3],[2,4,5,6], sum2[1]) {
 *         merge([3],[4,5,6], sum2[1,2]) {
 *             merge([],[4,5,6], sum2[1,2,3]) {
 *                 sum2[1,2,2,3,4,5,6];
 *             }
 *         }
 *     }
 * }
 */
public class MergeTwoSortedArrays {

    //[1,2,3,2,4,5,6]: part 1 iStart = 0 ---- iEnd = 2, part 2 jStart = 3, jEnd = 6
    public void mergeArray(int[] num1, int iStart, int iEnd, int jStart, int jEnd, int[] num2, int kStart) {
        if (iStart > iEnd) {
//            for (int i = jStart; i <= jEnd; i++, kStart++) {
//                num2[kStart] = num1[i];
//            }
            // arraycopy
            System.arraycopy(num1, jStart, num2, kStart, jEnd - jStart + 1);

            return;
        }
        if (jStart > jEnd) {
            //System.arraycopy(num1, iStart, num2, kStart, iEnd - iStart + 1);

            for (int i = iStart; i <= iEnd; i++, kStart++) {
                num2[kStart] = num1[i];
            }
            return;
        }

        if (num1[iStart] < num1[jStart]) {
            num2[kStart] = num1[iStart];
            mergeArray(num1, iStart + 1, iEnd, jStart, jEnd, num2, kStart + 1);
        } else {
            num2[kStart] = num1[jStart];
            mergeArray(num1, iStart, iEnd, jStart + 1, jEnd, num2, kStart + 1);
        }

        System.arraycopy(num2, 0, num1, 0, num1.length);
    }

    public void mergeArrayWithLoopMethod(int[] num1, int iStart, int iEnd, int jStart, int jEnd, int[] num2) {
        int kStart = 0;

        while (iStart <= iEnd & jStart <= jEnd) {
            if(num1[iStart] < num1[jStart]) {
                num2[kStart] = num1[iStart];
                iStart++;
            } else {
                num2[kStart] = num1[jStart];
                jStart++;
            }
            kStart++;
        }

        if(iStart > iEnd) {
            System.arraycopy(num1, jStart, num2, kStart, jEnd - jStart + 1);
        }

        if(jStart > jEnd) {
            System.arraycopy(num1, iStart, num2, kStart, iEnd - iStart + 1);
        }

        System.arraycopy(num2, 0, num1, 0, num1.length);
    }


    /**
     * Two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
     * @param nums1 nums1
     * @param m numbers
     * @param nums2 nums2
     * @param n numbers
     */

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;

        System.arraycopy(nums2, 0, nums1, m, n);

        int[] nums3 = new int[nums1.length];
        int i = 0, j = m;

        while(i <= m-1 && j < n+m) {
            if(nums1[i] < nums1[j]) {
                nums3[k] = nums1[i];
                i++;
            } else {
                nums3[k] = nums1[j];
                j++;
            }
            k++;
        }

        if(i > m - 1) {
            System.arraycopy(nums1, j, nums3, k, n+m -j);
        }

        if(j > n - 1) {
            System.arraycopy(nums1, i, nums3, k, m - i);
        }

        System.arraycopy(nums3, 0, nums1, 0, n + m);

    }

    public static void main(String[] args) {
        int[] num1 = {1,2,3,5,2,4,5,6,7,8};
        int[] num2 = new int[num1.length];

        int[] num3 = {1,2,3,5,2,4,5,6,7,8};
        int[] num4 = new int[num3.length];

        int[] num5 = {1,2,3,5,0,0,0,0,0,0};
        int[] num6 = {2,4,5,6,7,8};

        MergeTwoSortedArrays mergeTwoSortedArrays = new MergeTwoSortedArrays();

        System.out.println("------------------------------------ With Recursion -------------------------------------------------------");
        mergeTwoSortedArrays.mergeArray(num1, 0, 3, 4,9, num2,0);
        System.out.println(Arrays.toString(num2));
        System.out.println(Arrays.toString(num1));

        System.out.println("---------------------------------------- With Loop ---------------------------------------------------");
        mergeTwoSortedArrays.mergeArrayWithLoopMethod(num3, 0, 3, 4,9, num4);
        System.out.println(Arrays.toString(num4));
        System.out.println(Arrays.toString(num3));

        System.out.println("---------------------------------------- Other Solution  ---------------------------------------------------");
        mergeTwoSortedArrays.merge(num5, 4, num6, 6);
        System.out.println(Arrays.toString(num5));

    }
}
