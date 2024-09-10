package com.harshitbhardwaj.solutions.warmup1;

public class NotStringSolution {

    /*
    Return a new string where "not " has been added to the front.
    However, if the string already begins with "not", return the string unchanged.
     */
    public static String notString(String str) {
        return str.startsWith("not") ? str : "not " + str;

        /*if (str.startsWith("not")) {
            return str;
        } else {
            return "not " + str;
        }*/
    }

}