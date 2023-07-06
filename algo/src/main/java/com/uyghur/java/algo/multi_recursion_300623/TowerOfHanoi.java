package com.uyghur.java.algo.multi_recursion_300623;

import org.springframework.util.StopWatch;

import java.util.LinkedList;

/**
 * <><a href="https://www.mathsisfun.com/games/towerofhanoi.html">Tower Of Hanoi</a></>
 */
public class TowerOfHanoi {

    static LinkedList<Integer> columnA = new LinkedList<>();
    static LinkedList<Integer> columnB = new LinkedList<>();
    static LinkedList<Integer> columnC = new LinkedList<>();

    static void move(int diskNum,
                     LinkedList<Integer> columnA,
                     LinkedList<Integer> columnB,
                     LinkedList<Integer> columnC) {
        if (diskNum == 0) {
            return;
        }

        move(diskNum - 1, columnA, columnC, columnB);

        columnC.addLast(columnA.removeLast());
        printStatus();

        move(diskNum - 1, columnB, columnA, columnC);

    }

    // The elements are places from the button to top
    static void setUp(int diskNumbers) {
        for (int i = diskNumbers; i >= 1; i--) {
            columnA.addLast(i);
        }
    }

    public static void main(String[] args) {
        setUp(1);
        printStatus();

        StopWatch stopWatch = new StopWatch();
        stopWatch.start("The time for one disk..");
        move(1, columnA, columnB, columnC);
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());

    }

    private static void printStatus() {
        System.out.println("=================================================================");
        System.out.println(columnA);
        System.out.println(columnB);
        System.out.println(columnC);
    }
}
