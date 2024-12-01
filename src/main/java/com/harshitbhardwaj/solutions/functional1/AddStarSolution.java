package com.harshitbhardwaj.solutions.functional1;

import java.util.List;
import java.util.stream.Collectors;

// https://codingbat.com/prob/p170181
public class AddStarSolution {

    /*
    Given a list of strings, return a list where each string has "*" added at its end.
    */
    public static List<String> addStar(List<String> strings) {
        /*
        return strings.stream()
                .map(string -> string + "*").collect(Collectors.toList());
         */
        return strings.stream()
                .map(string -> string.concat("*")).collect(Collectors.toList());
    }
}