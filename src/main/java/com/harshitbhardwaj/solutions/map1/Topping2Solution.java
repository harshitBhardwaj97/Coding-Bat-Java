package com.harshitbhardwaj.solutions.map1;

import java.util.Map;

// https://codingbat.com/prob/p196458
public class Topping2Solution {

    /*
    Given a map of food keys and their topping values, modify and return the map as follows:
    if the key "ice cream" has a value, set that as the value for the key "yogurt" also.
    If the key "spinach" has a value, change that value to "nuts".
    */
    public static Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach")) {
            map.replace("spinach", "nuts");
        }
        return map;
    }
}