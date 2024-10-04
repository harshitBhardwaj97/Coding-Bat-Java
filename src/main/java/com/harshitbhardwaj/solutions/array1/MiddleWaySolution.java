package com.harshitbhardwaj.solutions.array1;

// https://codingbat.com/prob/p146449
public class MiddleWaySolution {

    /*
    Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
     */
    public static int[] middleWay(int[] a, int[] b) {
        int len = a.length;
        int middleElementOfA = a[len / 2];
        int middleElementOfB = b[len / 2];
        return new int[]{middleElementOfA, middleElementOfB};
    }
}