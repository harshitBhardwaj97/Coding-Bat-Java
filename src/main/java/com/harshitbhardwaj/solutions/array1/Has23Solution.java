package com.harshitbhardwaj.solutions.array1;

// https://codingbat.com/prob/p171022
public class Has23Solution {

    /*
    Given an int array length 2, return true if it contains a 2 or a 3.
     */
    public static boolean has23(int[] nums) {
        int len = nums.length;
        for (int num : nums) {
            if (num == 2 || num == 3) {
                return true;
            }
        }
        return false;
        /*
        boolean isTwoPresent = nums[0] == 2 || nums[len - 1] == 2;
        boolean isThreePresent = nums[0] == 3 || nums[len - 1] == 3;
        return isTwoPresent || isThreePresent;
         */
    }
}