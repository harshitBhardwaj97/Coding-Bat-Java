package com.harshitbhardwaj.solutions.warmup1;

// https://codingbat.com/prob/p199720
public class StartOzSolution {

    /*
    Given a string, return a string made of the first 2 chars (if present),
    however include first char only if it is 'o' and include the second only if it is 'z',
    so "ozymandias" yields "oz".
     */
    public static String startOz(String str) {
        String result = "";
        int len = str.length();
        if (len > 0 && str.charAt(0) == 'o') {
            result += "o";
        }
        if (len > 1 && str.charAt(1) == 'z') {
            result += "z";
        }
        return result;
    }
}