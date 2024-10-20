package com.harshitbhardwaj.solutions.string1;

// https://codingbat.com/prob/p139075
public class HasBadSolution {

    /*
    Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
    such as with "badxxx" or "xbadxx" but not "xxbadxx".
    The string may be any length, including 0.
    */
    public static boolean hasBad(String str) {
        int len = str.length();
        if (len < 3) {
            return false;
        } else if (len == 3) {
            return str.equals("bad");
        } else {
            boolean badAppearsAtZeroIndex = str.substring(0, 3).equals("bad");
            boolean badAppearsAtFirstIndex = str.substring(1, 4).equals("bad");
            return badAppearsAtZeroIndex || badAppearsAtFirstIndex;
        }
    }
}