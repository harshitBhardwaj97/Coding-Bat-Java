package com.harshitbhardwaj.solutions.array1;

// https://codingbat.com/prob/p118976
public class SameFirstLastSolution {

    /*
    Given an array of ints, return true if the array is length 1 or more,
    and the first element and the last element are equal.
     */
    public static boolean sameFirstLast(int[] nums) {
        int len = nums.length;
        return len == 0 ? false : nums[0] == nums[len - 1];
    }
}