package com.harshitbhardwaj.solutions.recursion1;

// https://codingbat.com/prob/p194781
public class TriangleSolution {

    /*
    We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks,
    the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication)
    the total number of blocks in such a triangle with the given number of rows.
    */
    public static int triangle(int rows) {
        if (rows < 0) {
            throw new IllegalArgumentException();
        } else if (rows <= 1) {
            return rows;
        } else {
            return rows + triangle(rows - 1);
        }
    }
}