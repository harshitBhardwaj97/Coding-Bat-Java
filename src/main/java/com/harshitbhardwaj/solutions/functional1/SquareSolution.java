package com.harshitbhardwaj.solutions.functional1;

import java.util.List;
import java.util.stream.Collectors;

// https://codingbat.com/prob/p139586
public class SquareSolution {

    /*
    Given a list of integers, return a list where each integer is multiplied with itself.
    */
    public static List<Integer> square(List<Integer> nums) {
        return nums.stream()
                .map(num -> num * num).collect(Collectors.toList());
    }
}