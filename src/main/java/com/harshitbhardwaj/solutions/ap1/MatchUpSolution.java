package com.harshitbhardwaj.solutions.ap1;

// https://codingbat.com/prob/p139677
public class MatchUpSolution {

    /*
    Given 2 arrays that are the same length containing strings, compare the 1st string in one array to the
    1st string in the other array, the 2nd to the 2nd and so on.Count the number of times that the 2 strings
    are non-empty and start with the same char. The strings may be any length, including 0.
    */
    public static int matchUp(String[] a, String[] b) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            if (areNonEmptySameChar(a[i], b[i])) {
                result++;
            }
        }
        return result;
    }

    public static boolean areNonEmptySameChar(String s1, String s2) {
        return !s1.isEmpty() && !s2.isEmpty() && s1.charAt(0) == s2.charAt(0);
    }
}