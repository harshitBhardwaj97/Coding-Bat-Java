package com.harshitbhardwaj.solutions.array1;

// https://codingbat.com/prob/p175763
public class Sum3Solution {

    /*
    Given an array of ints length 3, return the sum of all the elements.
     */
    public static int sum3(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        /*
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
         */
        return sum;
    }
}