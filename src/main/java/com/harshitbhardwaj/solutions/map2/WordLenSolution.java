package com.harshitbhardwaj.solutions.map2;

import java.util.HashMap;
import java.util.Map;

// https://codingbat.com/prob/p125327
public class WordLenSolution {

    /*
    Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
    and the value is that string's length.
    */
    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        for (String string : strings) {
            if (string != null) {
                result.putIfAbsent(string, string.length());
            }
        }
        return result;
    }
}