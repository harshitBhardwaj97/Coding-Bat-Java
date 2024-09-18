package com.harshitbhardwaj.solutions.warmup1;

// https://codingbat.com/prob/p151713
public class MixStartSolution {

    /*
    Return true if the given string begins with "mix",
    except the 'm' can be anything, so "pix", "9ix" .. all count.
     */
    public static boolean mixStart(String str) {
        int len = str.length();
        if (len < 3) {
            return false;
        } else {
            return str.substring(1, 3).equals("ix");
        }
    }
}