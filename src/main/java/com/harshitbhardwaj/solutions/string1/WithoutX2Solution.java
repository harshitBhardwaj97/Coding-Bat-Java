package com.harshitbhardwaj.solutions.string1;

// https://codingbat.com/prob/p151359
public class WithoutX2Solution {

    /*
    Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
    and otherwise return the string unchanged. This is a little harder than it looks.
    */
    public static String withoutX2(String str) {
        int len = str.length();
        StringBuilder result = new StringBuilder("");
        if (len > 0 && str.charAt(0) != 'x') {
            result.append(str.charAt(0) + "");
        }
        if (len > 1 && str.charAt(1) != 'x') {
            result.append(str.charAt(1) + "");
        }
        if (len > 2) {
            result.append(str.substring(2));
        }
        return result.toString();
    }
}