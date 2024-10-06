package com.harshitbhardwaj.solutions.array1;

// https://codingbat.com/prob/p137188
public class MakeLastSolution {

    /*
    Given an int array, return a new array with double the length, where its last element is
    the same as the original array, and all the other elements are 0.
    The original array will be length 1 or more.
     */
    public static int[] makeLast(int[] nums) {
        int lenOfNums = nums.length;
        int lenOfResult = 2 * lenOfNums;
        int[] result = new int[lenOfResult];
        result[lenOfResult - 1] = nums[lenOfNums - 1];
        return result;
    }
}