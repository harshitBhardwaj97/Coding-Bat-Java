package com.harshitbhardwaj.solutions.logic1;

// https://codingbat.com/prob/p120633
public class GreenTicketSolution {

    /*
    You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other, the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10.
    */
    public static int greenTicket(int a, int b, int c) {
        boolean allTheNumbersAreSame = a == b && b == c;
        boolean allTheNumbersAreDifferent = a != b && b != c && a != c;

        if (allTheNumbersAreSame) {
            return 20;
        } else if (allTheNumbersAreDifferent) {
            return 0;
        } else {
            return 10;
        }
    }
}