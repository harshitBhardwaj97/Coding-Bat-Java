package com.harshitbhardwaj.solutions.ap1;

// https://codingbat.com/prob/p148138
public class SumHeightsSolution {

    /*
    We have an array of heights, representing the altitude along a walking trail. Given start/end indexes
    into the array, return the sum of the changes for a walk beginning at the start index and ending
    at the end index. For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1 + 5 = 6.
    The start and end index will both be valid indexes into the array with start <= end.
    */
    public static int sumHeights(int[] heights, int start, int end) {
        int result = 0;
        for (int i = start; i < end; i++) {
            result += Math.abs(heights[i] - heights[i + 1]);
        }
        return result;
    }
}