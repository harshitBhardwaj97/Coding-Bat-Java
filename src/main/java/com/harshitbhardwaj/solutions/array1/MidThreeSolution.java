package com.harshitbhardwaj.solutions.array1;

// https://codingbat.com/prob/p155713
public class MidThreeSolution {

    /*
     Given an array of ints of odd length, return a new array length 3,
     containing the elements from the middle of the array. The array length will be at least 3.
     */
    public static int[] midThree(int[] nums) {
        int len = nums.length;
        int midIndex = len / 2;
        int first = nums[midIndex - 1];
        int mid = nums[midIndex];
        int last = nums[midIndex + 1];
        return new int[]{first, mid, last};
    }
}