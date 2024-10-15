package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.FirstTwoSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTwoTests {

    /*
    firstTwo("Hello") → "He"
    firstTwo("abcdefg") → "ab"
    firstTwo("ab") → "ab"
    */

    @Test
    public void firstTwoTestOne() {
        Assert.assertEquals(FirstTwoSolution.firstTwo("Hello"), "He");
    }

    @Test
    public void firstTwoTestTwo() {
        Assert.assertEquals(FirstTwoSolution.firstTwo("abcdefg"), "ab");
    }

    @Test
    public void firstTwoTestThree() {
        Assert.assertEquals(FirstTwoSolution.firstTwo("ab"), "ab");
    }
}