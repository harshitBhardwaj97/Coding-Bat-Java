package com.harshitbhardwaj.tests.functional1;

import com.harshitbhardwaj.solutions.functional1.SquareSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SquareTests {

   /*
   square([1, 2, 3]) → [1, 4, 9]
   square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
   square([]) → []
   */

    @Test
    public void squareTestOne() {
        List<Integer> input = List.of(1, 2, 3);
        List<Integer> expected = List.of(1, 4, 9);
        Assert.assertEquals(SquareSolution.square(input), expected);
    }

    @Test
    public void squareTestTwo() {
        List<Integer> input = List.of(6, 8, -6, -8, 1);
        List<Integer> expected = List.of(36, 64, 36, 64, 1);
        Assert.assertEquals(SquareSolution.square(input), expected);
    }

    @Test
    public void squareTestThree() {
        List<Integer> input = List.of();
        List<Integer> expected = List.of();
        Assert.assertEquals(SquareSolution.square(input), expected);
    }
}