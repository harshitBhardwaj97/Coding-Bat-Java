package com.harshitbhardwaj.solutions.functional1;

import java.util.List;
import java.util.stream.Collectors;

// https://codingbat.com/prob/p117665
public class DoublingSolution {

    /*
    Given a list of integers, return a list where each integer is multiplied by 2.
    */
    public static List<Integer> doubling(List<Integer> nums) {
        return nums.stream().
                map(num -> num * 2).collect(Collectors.toList());
    }
}