package com.harshitbhardwaj.solutions.warmup1;

public class MissingCharSolution {

    /*
    Return a new string where the char at index n has been removed.
     */
    public static String missingChar(String str, int n) {
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(n);
        return sb.toString();
    }
}