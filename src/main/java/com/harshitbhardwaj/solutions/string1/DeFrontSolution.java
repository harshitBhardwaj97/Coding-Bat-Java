package com.harshitbhardwaj.solutions.string1;

// https://codingbat.com/prob/p110141
public class DeFrontSolution {

    /*
    Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a'
    and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
    */
    public static String deFront(String str) {
        int len = str.length();
        if (len == 0) {
            return "";
        } else if (len == 1) {
            return str.charAt(0) == 'a' ? str : "";
        } else {
            String result = "";
            if (str.charAt(0) == 'a') result += "a";
            if (str.charAt(1) == 'b') result += "b";
            return result + str.substring(2);
        }
    }
}