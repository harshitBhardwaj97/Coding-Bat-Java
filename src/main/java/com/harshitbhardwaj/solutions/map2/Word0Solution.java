package com.harshitbhardwaj.solutions.map2;

import java.util.HashMap;
import java.util.Map;

// https://codingbat.com/prob/p152303
public class Word0Solution {

    /*
    Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
    always with the value 0. For example the string "hello" makes the pair "hello":0.
    We'll do more complicated counting later, but for this problem the value is simply 0.
    */
    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        for (String string : strings) {
            /*
            if (!result.containsKey(string)) {
                result.put(string, 0);
            }
            */
            result.putIfAbsent(string, 0);
        }
        return result;
    }
}