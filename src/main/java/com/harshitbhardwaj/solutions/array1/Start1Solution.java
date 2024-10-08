package com.harshitbhardwaj.solutions.array1;

// https://codingbat.com/prob/p109660
public class Start1Solution {

    /*
    Start with 2 int arrays, a and b, of any length.
    Return how many of the arrays have 1 as their first element.
     */
    public static int start1(int[] a, int[] b) {
        int aLen = a.length;
        int bLen = b.length;
        boolean bothAAndBAreNotEmpty = aLen > 0 && bLen > 0;
        boolean isANotEmpty = (aLen > 0);
        boolean isBNotEmpty = (bLen > 0);

        if (bothAAndBAreNotEmpty && a[0] == 1 && b[0] == 1) {
            return 2;
        } else if ((isANotEmpty && a[0] == 1) || (isBNotEmpty && b[0] == 1)) {
            return 1;
        } else {
            return 0;
        }
    }
}