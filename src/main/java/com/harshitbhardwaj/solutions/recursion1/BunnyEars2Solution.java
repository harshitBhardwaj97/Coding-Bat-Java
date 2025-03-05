package com.harshitbhardwaj.solutions.recursion1;

// https://codingbat.com/prob/p107330
public class BunnyEars2Solution {

    /*
    We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
    The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
    Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
    */
    public static int bunnyEars2(int bunnies) {
        if (bunnies < 0) {
            throw new IllegalArgumentException();
        } else if (bunnies == 0) {
            return 0;
        } else if (bunnies % 2 == 1) {
            return 2 + bunnyEars2(bunnies - 1);
        } else {
            return 3 + bunnyEars2(bunnies - 1);
        }
    }
}