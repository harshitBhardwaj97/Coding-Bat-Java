package com.harshitbhardwaj.tests.functional1;

import com.harshitbhardwaj.solutions.functional1.RightDigitSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class RightDigitTests {

   /*
   rightDigit([1, 22, 93]) → [1, 2, 3]
   rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
   rightDigit([10, 0]) → [0, 0]
   */

    @Test
    public void rightDigitTestOne() {
        List<Integer> input = List.of(1, 22, 93);
        List<Integer> expected = List.of(1, 2, 3);
        Assert.assertEquals(RightDigitSolution.rightDigit(input), expected);
    }

    @Test
    public void rightDigitTestTwo() {
        List<Integer> input = List.of(16, 8, 886, 8, 1);
        List<Integer> expected = List.of(6, 8, 6, 8, 1);
        Assert.assertEquals(RightDigitSolution.rightDigit(input), expected);
    }

    @Test
    public void rightDigitTestThree() {
        List<Integer> input = List.of(10, 0);
        List<Integer> expected = List.of(0, 0);
        Assert.assertEquals(RightDigitSolution.rightDigit(input), expected);
    }
}