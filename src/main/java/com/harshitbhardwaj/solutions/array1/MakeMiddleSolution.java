package com.harshitbhardwaj.solutions.array1;

// https://codingbat.com/prob/p199519
public class MakeMiddleSolution {

    /*
    Given an array of ints of even length, return a new array length 2
    containing the middle two elements from the original array.
    The original array will be length 2 or more.
    */
    public static int[] makeMiddle(int[] nums) {
        int len = nums.length;
        int first = nums[(len / 2) - 1];
        int last = nums[(len / 2)];
        return new int[]{first, last};
    }
}