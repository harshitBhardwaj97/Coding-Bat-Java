package com.harshitbhardwaj.solutions.ap1;

// https://codingbat.com/prob/p165941
public class DividesSelfSolution {

    /*
    We'll say that a positive int divides itself if every digit in the number divides into the number evenly.
    So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not
    divide into anything evenly, so no number with a 0 digit divides itself.
    */
    public static boolean dividesSelf(int n) {
        if (String.valueOf(n).contains("0")) {
            return false;
        }

        int temp = n;
        while (n > 0) {
            int rem = n % 10;
            if (temp % rem != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}