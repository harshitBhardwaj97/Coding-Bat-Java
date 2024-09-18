package com.harshitbhardwaj.solutions.warmup1;

// https://codingbat.com/prob/p100905
public class DelDelSolution {

    /*
    Given a string, if the string "del" appears starting at index 1,
    return a string where that "del" has been deleted. Otherwise, return the string unchanged.
     */
    public static String delDel(String str) {
        int indexOfDel = str.indexOf("del");
        return indexOfDel == 1 ? str.replace("del", "") : str;
    }
}