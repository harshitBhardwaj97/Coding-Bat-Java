package com.harshitbhardwaj.solutions.array1;

// https://codingbat.com/prob/p197308
public class Unlucky1Solution {

    /*
    We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
    Return true if the given array contains an unlucky 1, in the first 2 or last 2 positions in the array.
    */
    public static boolean unlucky1(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 1 && nums[i + 1] == 3 && isIndexInTheValidRange(i, len)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isIndexInTheValidRange(int index, int len) {
        return index == 0 || index == 1 || index == len - 2 || index == len - 1;
    }
}

