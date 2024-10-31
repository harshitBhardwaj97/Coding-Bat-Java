package com.harshitbhardwaj.solutions.logic1;

// https://codingbat.com/prob/p183071
public class SortaSumSolution {

    /*
    Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive,
    are forbidden, so in that case just return 20.
    */
    public static int sortaSum(int a, int b) {
        int sum = a + b;
        boolean isSumInTheForbiddenRange = sum >= 10 && sum <= 19;
        return isSumInTheForbiddenRange ? 20 : sum;
    }
}