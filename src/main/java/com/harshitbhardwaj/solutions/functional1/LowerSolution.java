package com.harshitbhardwaj.solutions.functional1;

import java.util.List;
import java.util.stream.Collectors;

// https://codingbat.com/prob/p186894
public class LowerSolution {

    /*
    Given a list of strings, return a list where each string is converted to lower case.
    */
    public static List<String> lower(List<String> strings) {
        /*
        return strings.stream().map(s -> s.toLowerCase())
                .collect(Collectors.toList());
         */
        return strings.stream().map(String::toLowerCase)
                .collect(Collectors.toList());
    }
}