package com.harshitbhardwaj.solutions.functional1;

import java.util.List;
import java.util.stream.Collectors;

// https://codingbat.com/prob/p152194
public class RightDigitSolution {

    /*
    Given a list of non-negative integers, return an integer list of the rightmost digits.
    */
    public static List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream().map(num -> num % 10)
                .collect(Collectors.toList());
    }
}