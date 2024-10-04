package com.harshitbhardwaj.solutions.array1;

// https://codingbat.com/prob/p190968
public class Sum2Solution {

    /*
    Given an array of ints, return the sum of the first 2 elements in the array.
    If the array length is less than 2, just sum up the elements that exist,
    returning 0 if the array is length 0.
     */
    public static int sum2(int[] nums) {
        int sum = 0;
        int len = nums.length;

        if (len > 1) {
            for (int i = 0; i < 2; i++) {
                sum += nums[i];
            }
        } else if (len == 1) {
            sum = nums[0];
        } else {
            sum = 0;
        }
        return sum;
    }
}