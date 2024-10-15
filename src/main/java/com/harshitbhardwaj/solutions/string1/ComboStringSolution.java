package com.harshitbhardwaj.solutions.string1;

// https://codingbat.com/prob/p168564
public class ComboStringSolution {

    /*
    Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on
    the outside and the longer string on the inside.
    The strings will not be the same length, but they may be empty (length 0).
    */
    public static String comboString(String a, String b) {
        int lenA = a.length(), lenB = b.length();

        // a is shorter -> a + b + a
        if (lenA < lenB) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }
}