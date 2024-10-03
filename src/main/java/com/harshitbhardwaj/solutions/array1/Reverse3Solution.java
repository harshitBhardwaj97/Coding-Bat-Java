package com.harshitbhardwaj.solutions.array1;

// https://codingbat.com/prob/p112409
public class Reverse3Solution {

    /*
    Given an array of ints length 3, return a new array with the elements in reverse order,
    so {1, 2, 3} becomes {3, 2, 1}.
     */
    public static int[] reverse3(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = nums[len - i - 1];
        }
        /*
        for (int i = 0, j = len - 1; i < len && j >= 0; i++, j--) {
            result[i] = nums[j];
        }
         */
        return result;
    }
}