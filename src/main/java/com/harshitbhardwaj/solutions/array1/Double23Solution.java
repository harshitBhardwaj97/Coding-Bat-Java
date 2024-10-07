package com.harshitbhardwaj.solutions.array1;

// https://codingbat.com/prob/p145365
public class Double23Solution {

    /*
    Given an int array, return true if the array contains 2 twice, or 3 twice.
    The array will be length 0, 1, or 2.
     */
    public static boolean double23(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return false;
        } else {
            int countOf2 = 0, countOf3 = 0;

            for (int num : nums) {
                if (num == 2) countOf2++;
                if (num == 3) countOf3++;
            }

            return countOf2 == 2 || countOf3 == 2;

            /*
            boolean isTwoPresentTwice = nums[0] == 2 && nums[1] == 2;
            boolean isThreePresentTwice = nums[0] == 3 && nums[1] == 3;
            return isTwoPresentTwice || isThreePresentTwice;
             */
        }
    }
}