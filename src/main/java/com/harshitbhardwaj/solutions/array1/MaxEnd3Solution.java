package com.harshitbhardwaj.solutions.array1;

// https://codingbat.com/prob/p146256
public class MaxEnd3Solution {

    /*
    Given an array of ints length 3, figure out which is larger,
    the first or last element in the array, and set all the other elements
    to be that value. Return the changed array.
     */
    public static int[] maxEnd3(int[] nums) {
        int len = nums.length;
//       int larger = nums[0] > nums[len - 1] ? nums[0] : nums[len - 1];
        int larger = Math.max(nums[0], nums[len - 1]);
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
            result[i] = larger;
        }
        return result;
    }
}