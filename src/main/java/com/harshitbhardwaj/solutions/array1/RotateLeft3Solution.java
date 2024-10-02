package com.harshitbhardwaj.solutions.array1;

// https://codingbat.com/prob/p185139
public class RotateLeft3Solution {

    /*
    Given an array of ints length 3, return an array with the elements "rotated left",
    so {1, 2, 3} yields {2, 3, 1}.
     */
    public static int[] rotateLeft3(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        for (int i = 0; i < len - 1; i++) {
            result[i] = nums[i + 1];
        }
        result[len - 1] = nums[0];
        return result;
    }
}