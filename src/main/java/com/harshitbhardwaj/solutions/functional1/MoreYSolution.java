package com.harshitbhardwaj.solutions.functional1;

import java.util.List;
import java.util.stream.Collectors;

// https://codingbat.com/prob/p177528
public class MoreYSolution {

    /*
    Given a list of strings, return a list where each string has "y" added at its start and end.
    */
    public static List<String> moreY(List<String> strings) {
        return strings.stream()
                .map(s -> "y" + s + "y").collect(Collectors.toList());
    }
}