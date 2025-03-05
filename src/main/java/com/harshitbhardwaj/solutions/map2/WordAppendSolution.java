package com.harshitbhardwaj.solutions.map2;

import java.util.LinkedHashMap;
import java.util.Map;

// https://codingbat.com/prob/p103593
public class WordAppendSolution {

    /*
    Loop over the given array of strings to build a result string like this: when a string appears the
    2nd, 4th, 6th, etc. time in the array, append the string to the result.
    Return the empty string if no string appears a 2nd time.
    */
    public static String wordAppend(String[] strings) {
        Map<String, Integer> map = new LinkedHashMap<>();
        StringBuilder result = new StringBuilder();
        for (String string : strings) {
            map.put(string, map.getOrDefault(string, 0) + 1);
            if (map.get(string) % 2 == 0) {
                result.append(string);
            }
        }
        return result.toString();
    }
}