package com.harshitbhardwaj.solutions.logic1;

// https://codingbat.com/prob/p170833
public class RedTicketSolution {

    /*
    You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2.
    If they are all the value 2, the result is 10. Otherwise, if they are all the same, the result is 5.
    Otherwise, so long as both b and c are different from a, the result is 1. Otherwise, the result is 0.
    */
    public static int redTicket(int a, int b, int c) {
        boolean allAreEqualTo2 = a == 2 && b == 2 && c == 2;
        boolean allAreEqual = a == b && b == c;
        boolean bothBAndCAreDifferentFromA = a != b && a != c;

        if (allAreEqualTo2) {
            return 10;
        } else if (allAreEqual) {
            return 5;
        } else if (bothBAndCAreDifferentFromA) {
            return 1;
        } else {
            return 0;
        }
    }
}