package com.harshitbhardwaj.solutions.map1;

import java.util.Map;

// https://codingbat.com/prob/p115011
public class MapAB2Solution {

    /*
    Modify and return the given map as follows: if the keys "a" and "b" are both in the map
    and have equal values, remove them both.
    */
    public static Map<String, String> mapAB2(Map<String, String> map) {
        boolean bothAAndBKeysArePresent = map.containsKey("a") && map.containsKey("b");
        if (bothAAndBKeysArePresent && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }
}