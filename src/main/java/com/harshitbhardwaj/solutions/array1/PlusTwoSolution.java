package com.harshitbhardwaj.solutions.array1;

// https://codingbat.com/prob/p180840
public class PlusTwoSolution {

    /*
    Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
    */
    public static int[] plusTwo(int[] a, int[] b) {
        int[] result = new int[4];
        /*
        result[0] = a[0];
        result[1] = a[1];
        result[2] = b[0];
        result[3] = b[1];
         */

        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
            result[i + 2] = b[i];
        }
        
        return result;
    }
}