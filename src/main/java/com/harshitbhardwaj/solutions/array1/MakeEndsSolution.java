package com.harshitbhardwaj.solutions.array1;

// https://codingbat.com/prob/p101230
public class MakeEndsSolution {

    /*
    Given an array of ints, return a new array length 2 containing the first and last elements
    from the original array. The original array will be length 1 or more.
     */
    public static int[] makeEnds(int[] nums) {
        int len = nums.length;
        int firstElement = nums[0];
        int lastElement = nums[len - 1];
        return new int[]{firstElement, lastElement};
    }
}