package com.harshitbhardwaj.solutions.recursion1;

// https://codingbat.com/prob/p183649
public class BunnyEarsSolution {

    /*
    We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total
    number of ears across all the bunnies recursively (without loops or multiplication).
    */
    public static int bunnyEars(int bunnies) {
        if (bunnies < 0) {
            throw new IllegalArgumentException();
        } else if (bunnies == 0) {
            return 0;
        } else if (bunnies == 1) {
            return 2;
        } else {
            return 2 + bunnyEars(bunnies - 1);
        }
    }
}