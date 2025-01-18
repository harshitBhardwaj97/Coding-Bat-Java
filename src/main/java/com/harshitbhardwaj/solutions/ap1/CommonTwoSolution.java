package com.harshitbhardwaj.solutions.ap1;

// https://codingbat.com/prob/p100369
public class CommonTwoSolution {

    /*
    Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates.
    Return the count of the number of strings which appear in both arrays.
    The best "linear" solution makes a single pass over both arrays, taking advantage of the fact that
    they are in alphabetical order.
    */
    public static int commonTwo(String[] a, String[] b) {
        int i = 0, j = 0, result = 0;
        while (i < a.length && j < b.length) {
            if (i > 0 && a[i].equals(a[i - 1])) {
                i++;
                continue;
            }
            if (j > 0 && b[j].equals(b[j - 1])) {
                j++;
                continue;
            }
            if (a[i].equals(b[j])) {
                result++;
                i++;
                j++;
            } else if (a[i].compareTo(b[j]) < 0) {
                i++;
            } else {
                j++;
            }
        }
        return result;
    }
}