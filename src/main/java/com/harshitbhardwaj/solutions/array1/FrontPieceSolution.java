package com.harshitbhardwaj.solutions.array1;

// https://codingbat.com/prob/p142455
public class FrontPieceSolution {

    /*
    Given an int array of any length, return a new array of its first 2 elements.
    If the array is smaller than length 2, use whatever elements are present.
     */
    public static int[] frontPiece(int[] nums) {
        int len = nums.length;
        if (len <= 2) {
            return nums;
        } else {
            int first = nums[0], second = nums[1];
            return new int[]{first, second};
        }
    }
}