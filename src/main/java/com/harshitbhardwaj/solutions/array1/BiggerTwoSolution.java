package com.harshitbhardwaj.solutions.array1;

// https://codingbat.com/prob/p109537
public class BiggerTwoSolution {

    /*
    Start with 2 int arrays, a and b, each length 2.
    Consider the sum of the values in each array. Return the array which has the largest sum.
    In event of a tie, return a.
    */
    public static int[] biggerTwo(int[] a, int[] b) {
        int sumOfA = a[0] + a[1];
        int sumOfB = b[0] + b[1];

        return sumOfA >= sumOfB ? a : b;
        /*
        if (sumOfA >= sumOfB) {
            return a;
        } else {
            return b;
        }
         */
    }
}