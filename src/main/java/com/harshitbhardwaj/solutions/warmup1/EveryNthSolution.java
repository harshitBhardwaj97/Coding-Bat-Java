package com.harshitbhardwaj.solutions.warmup1;

// https://codingbat.com/prob/p196441
public class EveryNthSolution {

    public static String everyNth(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i += n) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}