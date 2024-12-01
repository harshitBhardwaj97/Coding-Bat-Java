package com.harshitbhardwaj.solutions.functional1;

import java.util.List;
import java.util.stream.Collectors;

// https://codingbat.com/prob/p181634
public class Copies3Solution {

    /*
    Given a list of strings, return a list where each string is
    replaced by 3 copies of the string concatenated together.
    */
    public static List<String> copies3(List<String> strings) {
        return strings.stream()
                .map(s -> s + s + s).collect(Collectors.toList());
        /*
        return strings.stream()
                .map(s -> s.repeat(3)).collect(Collectors.toList());
         */
    }
}