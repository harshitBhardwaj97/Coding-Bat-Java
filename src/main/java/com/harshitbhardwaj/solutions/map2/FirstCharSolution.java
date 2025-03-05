package com.harshitbhardwaj.solutions.map2;

import java.util.HashMap;
import java.util.Map;

// https://codingbat.com/prob/p168493
public class FirstCharSolution {

    /*
    Given an array of non-empty strings, return a Map<String, String> with a key for every different first
    character seen, with the value of all the strings starting with that character appended together in the order they
    appear in the array.
    */
    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> result = new HashMap<>();
        for (String string : strings) {
            String firstChar = string.substring(0, 1);
            if (!result.containsKey(firstChar)) {
                result.put(firstChar, string);
            } else {
                String currentString = result.get(firstChar);
                result.replace(firstChar, currentString + string);
            }
        }
        return result;
    }
}