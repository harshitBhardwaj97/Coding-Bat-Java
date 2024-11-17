package com.harshitbhardwaj.solutions.logic1;

// https://codingbat.com/prob/p192267
public class BlueTicketSolution {

    /*
    You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll
    call ab, bc, and ac. Consider the sum of the numbers in each pair. If any pair sums to exactly 10,
    the result is 10. Otherwise, if the ab sum is exactly 10 more than either bc or ac sums, the result is 5.
    Otherwise, the result is 0.
    */
    public static int blueTicket(int a, int b, int c) {
        int abSum = a + b, bcSum = b + c, acSum = a + c;
        boolean sumOfAnyPairIsTen = abSum == 10 || bcSum == 10 || acSum == 10;
        boolean sumOfAbIsTenMoreThanBcOrAc = (abSum - acSum == 10) || (abSum - bcSum == 10);

        if (sumOfAnyPairIsTen) {
            return 10;
        } else if (sumOfAbIsTenMoreThanBcOrAc) {
            return 5;
        } else {
            return 0;
        }

    }
}