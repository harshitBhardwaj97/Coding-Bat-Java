package com.harshitbhardwaj.solutions.map2;

import java.util.HashMap;
import java.util.Map;

// https://codingbat.com/prob/p126332
public class PairsSolution {

    /*
    Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add
    its first character as a key with its last character as the value.
    */
    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> result = new HashMap<>();
        for (String string : strings) {
            if (string != null && !result.containsKey(string)) {
                result.put(string.substring(0, 1), string.substring(string.length() - 1));
            }
        }
        return result;
    }
}