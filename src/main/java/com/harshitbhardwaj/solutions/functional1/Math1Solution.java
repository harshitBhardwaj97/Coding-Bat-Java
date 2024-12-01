package com.harshitbhardwaj.solutions.functional1;

import java.util.List;
import java.util.stream.Collectors;

// https://codingbat.com/prob/p103869
public class Math1Solution {

    /*
    Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.
    */
    public static List<Integer> math1(List<Integer> nums) {
        return nums.stream().map(num -> (num + 1) * 10)
                .collect(Collectors.toList());
    }
}