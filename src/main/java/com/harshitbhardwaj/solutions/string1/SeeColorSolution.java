package com.harshitbhardwaj.solutions.string1;

// https://codingbat.com/prob/p199216
public class SeeColorSolution {

    /*
    Given a string, if the string begins with "red" or "blue" return that color string,
    otherwise return the empty string.
    */
    public static String seeColor(String str) {
        boolean doesStrBeginsWithRed = str.startsWith("red");
        boolean doesStrBeginsWithBlue = str.startsWith("blue");
        if (doesStrBeginsWithRed) {
            return "red";
        } else if (doesStrBeginsWithBlue) {
            return "blue";
        } else {
            return "";
        }
    }
}