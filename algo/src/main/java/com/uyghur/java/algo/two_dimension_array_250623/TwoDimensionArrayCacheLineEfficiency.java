package com.uyghur.java.algo.two_dimension_array_250623;

import org.springframework.util.StopWatch;

/**
 * Comparer the efficiency of reading the data in Cache Line in Memory(RAM)
 * the speed in RAM /10^-9 nanosecond and in CPU or in Cache 10^-12 nanosecond
 * Read the data from RAM, if the data exists in Cache
 */

public class TwoDimensionArrayCacheLineEfficiency {

    public static void main(String[] args) {
        int rows = 1_500_000;
        int columns = 15;

        int[][] arr = new int[rows][columns];

        StopWatch stopWatch = new StopWatch();
        stopWatch.start("ij starts.....");
        ij(arr, rows, columns);
        stopWatch.stop();

        stopWatch.start("ji starts....");
        ji(arr, rows, columns);
        stopWatch.stop();

        System.out.println(stopWatch.prettyPrint());

    }


    public static void ij(int[][] arr, int rows, int columns) {
        long sum = 0L;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += arr[i][j];
            }
        }

        System.out.println(sum);

        System.out.println("---------------------------------------------------- Array-Sum -> Outer-To-Inner ---------------------------------------------------");
    }

    public static void ji(int[][] arr, int rows, int columns) {
        long sum = 0L;

        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
        System.out.println("---------------------------------------------------- Array-Sum -> Inner-To-Outer ---------------------------------------------------");
    }



}
