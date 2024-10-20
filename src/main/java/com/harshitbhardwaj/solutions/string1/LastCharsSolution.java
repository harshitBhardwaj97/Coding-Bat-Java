package com.harshitbhardwaj.solutions.string1;

// https://codingbat.com/prob/p138183
public class LastCharsSolution {

    /*
    Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
    so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
    */
    public static String lastChars(String a, String b) {
        int aLen = a.length(), bLen = b.length();
        String front = aLen == 0 ? "@" : a.substring(0, 1);
        String end = bLen == 0 ? "@" : b.substring(bLen - 1);
        return front + end;
    }
}