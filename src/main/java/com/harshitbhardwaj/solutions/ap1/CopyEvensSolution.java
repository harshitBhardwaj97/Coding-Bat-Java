package com.harshitbhardwaj.solutions.ap1;

// https://codingbat.com/prob/p134174
public class CopyEvensSolution {

    /*
    Given an array of positive ints, return a new array of length "count" containing the first even numbers
    from the original array. The original array will contain at least "count" even numbers.
    */
    public static int[] copyEvens(int[] nums, int count) {
        int i = 0, j = 0;
        int[] result = new int[count];
        while (i < nums.length && j < count) {
            if (nums[i] % 2 == 0) {
                result[j] = nums[i];
                j++;
            }
            i++;
        }
        return result;
    }
}