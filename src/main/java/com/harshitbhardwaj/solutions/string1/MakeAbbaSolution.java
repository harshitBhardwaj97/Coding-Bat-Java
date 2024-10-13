package com.harshitbhardwaj.solutions.string1;

// https://codingbat.com/prob/p161056
public class MakeAbbaSolution {

    /*
    Given two strings, a and b, return the result of putting them together in the order abba,
    e.g. "Hi" and "Bye" returns "HiByeByeHi".
    */
    public static String makeAbba(String a, String b) {
        return String.format("%s%s%s%s", a, b, b, a);
        // return a + b + b + a;
    }
}