package com.harshitbhardwaj.solutions.map1;

import java.util.Map;

// https://codingbat.com/prob/p115012
public class MapAB3Solution {

    /*
    Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map
    (but not both), set the other to have that same value in the map.
    */
    public static Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a") && !map.containsKey("b")) {
            map.put("b", map.get("a"));
        }
        if (!map.containsKey("a") && map.containsKey("b")) {
            map.put("a", map.get("b"));
        }
        return map;
    }
}