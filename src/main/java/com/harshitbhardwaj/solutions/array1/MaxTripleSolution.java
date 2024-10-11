package com.harshitbhardwaj.solutions.array1;

// https://codingbat.com/prob/p185176
public class MaxTripleSolution {

    /*
    Given an array of ints of odd length, look at the first, last, and middle values in the array
    and return the largest. The array length will be atleast 1.
     */
    public static int maxTriple(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        } else {
            int first = nums[0], last = nums[len - 1], mid = nums[len / 2];
            return Math.max(first, Math.max(mid, last));
        }
    }
}