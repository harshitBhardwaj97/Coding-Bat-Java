package com.harshitbhardwaj.solutions.array1;

// https://codingbat.com/prob/p185685
public class FirstLast6Solution {

    public static boolean firstLast6(int[] nums) {
        int firstElement = nums[0];
        int lastElement = nums[nums.length - 1];
        return firstElement == 6 || lastElement == 6;
    }
}