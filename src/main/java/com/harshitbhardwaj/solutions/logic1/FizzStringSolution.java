package com.harshitbhardwaj.solutions.logic1;

// https://codingbat.com/prob/p137136
public class FizzStringSolution {

    /*
    Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz".
    If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged.
    */
    public static String fizzString(String str) {
        boolean strStartsWithF = str.startsWith("f");
        boolean strEndsWithB = str.endsWith("b");
        if (strStartsWithF && strEndsWithB) {
            return "FizzBuzz";
        } else if (strStartsWithF) {
            return "Fizz";
        } else if (strEndsWithB) {
            return "Buzz";
        } else {
            return str;
        }
    }
}