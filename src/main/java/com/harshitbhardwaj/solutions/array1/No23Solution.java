package com.harshitbhardwaj.solutions.array1;

// https://codingbat.com/prob/p175689
public class No23Solution {

    /*
    Given an int array length 2, return true if it does not contain a 2 or 3.
     */
    public static boolean no23(int[] nums) {
        for (int num : nums) {
            if (num == 2 || num == 3) {
                return false;
            }
        }
        return true;
    }
}