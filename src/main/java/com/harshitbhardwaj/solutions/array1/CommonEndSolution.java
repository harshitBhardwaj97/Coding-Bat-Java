package com.harshitbhardwaj.solutions.array1;

// https://codingbat.com/prob/p191991
public class CommonEndSolution {

    /*
    Given 2 arrays of ints, a and b, return true if they have the same first element,
    or they have the same last element. Both arrays will be length 1 or more.
     */
    public static boolean commonEnd(int[] a, int[] b) {
        int aLen = a.length;
        int bLen = b.length;
        boolean firstElementMatch = a[0] == b[0];
        boolean lastElementMatch = a[aLen - 1] == b[bLen - 1];
        return firstElementMatch || lastElementMatch;
    }
}