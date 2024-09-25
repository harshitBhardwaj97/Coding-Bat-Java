package com.harshitbhardwaj.solutions.warmup1;

// https://codingbat.com/prob/p173784
public class StringESolution {

    /*
    Return true if the given string contains between 1 and 3 'e' chars.
     */
    public static boolean stringE(String str) {
        int indexOfE = str.indexOf("e");
        if (indexOfE == -1) return false;

        char[] charArr = str.toCharArray();
        int countOfE = 0;
        for (char ch : charArr) {
            if (ch == 'e') countOfE++;
        }
        // Return true if countOfE lies in the range [1,3]
        return countOfE >= 1 && countOfE <= 3;
    }
}