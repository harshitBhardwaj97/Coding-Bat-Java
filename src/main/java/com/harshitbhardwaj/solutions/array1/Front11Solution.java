package com.harshitbhardwaj.solutions.array1;

// https://codingbat.com/prob/p128270
public class Front11Solution {

    /*
    Given 2 int arrays, a and b, of any length, return a new array
    with the first element of each array. If either array is length 0, ignore that array.
    */
    public static int[] front11(int[] a, int[] b) {
        int aLen = a.length, bLen = b.length;
        if (aLen > 0 && bLen > 0) {
            return new int[]{a[0], b[0]};
        } else if (aLen > 0) {
            return new int[]{a[0]};
        } else if (bLen > 0) {
            return new int[]{b[0]};
        } else {
            return new int[]{};
        }
    }
}