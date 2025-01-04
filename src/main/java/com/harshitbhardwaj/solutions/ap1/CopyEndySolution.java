package com.harshitbhardwaj.solutions.ap1;

// https://codingbat.com/prob/p130124
public class CopyEndySolution {

    /*
    We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive).
    Given an array of positive ints, return a new array of length "count" containing the first
    endy numbers from the original array. Decompose out a separate isEndy(int n) method to test if a number is endy.
    The original array will contain at least "count" endy numbers.
    */
    public static int[] copyEndy(int[] nums, int count) {
        int[] result = new int[count];
        int i = 0, j = 0;
        while (i < nums.length && j < count) {
            if (isEndy(nums[i])) {
                result[j] = nums[i];
                j++;
            }
            i++;
        }
        return result;
    }

    public static boolean isEndy(int n) {
        return (n >= 0 && n <= 10) || (n >= 90 && n <= 100);
    }
}