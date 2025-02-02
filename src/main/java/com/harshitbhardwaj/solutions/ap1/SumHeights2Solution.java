package com.harshitbhardwaj.solutions.ap1;

// https://codingbat.com/prob/p157900
public class SumHeights2Solution {

    /*
    (A variation on the sumHeights problem.) We have an array of heights, representing the altitude along
    a walking trail. Given start/end indexes into the array, return the sum of the changes for a walk
    beginning at the start index and ending at the end index, however increases in height count double.
    For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1*2 + 5 = 7.
    The start and end index will both be valid indexes into the array with start <= end.
    */
    public static int sumHeights2(int[] heights, int start, int end) {
        int result = 0;
        for (int i = start; i < end; i++) {
            int diff = Math.abs(heights[i] - heights[i + 1]);
            result += heights[i] < heights[i + 1] ? 2 * diff : diff;
        }
        return result;
    }
}