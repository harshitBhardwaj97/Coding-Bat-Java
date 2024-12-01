package com.harshitbhardwaj.solutions.functional1;

import java.util.List;
import java.util.stream.Collectors;

// https://codingbat.com/prob/p105967
public class NoXSolution {

    /*
    Given a list of strings, return a list where each string has all its "x" removed.
    */
    public static List<String> noX(List<String> strings) {
        return strings.stream().map(s -> s.replace("x", ""))
                .collect(Collectors.toList());
    }
}