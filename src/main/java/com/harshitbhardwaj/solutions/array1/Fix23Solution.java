package com.harshitbhardwaj.solutions.array1;

// https://codingbat.com/prob/p120347
public class Fix23Solution {

    /*
    Given an int array length 3, if there is a 2 in the array immediately followed by a 3,
    set the 3 element to 0. Return the changed array.
     */
    public static int[] fix23(int[] nums) {
        int len = nums.length;

        for (int i = 0; i < len - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }
        return nums;
    }
}