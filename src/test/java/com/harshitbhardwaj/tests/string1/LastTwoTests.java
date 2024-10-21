package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.LastTwoSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LastTwoTests {

    /*
    lastTwo("coding") → "codign"
    lastTwo("cat") → "cta"
    lastTwo("ab") → "ba"
    */

    @Test
    public void lastTwoTestOne() {
        Assert.assertEquals(LastTwoSolution.lastTwo("coding"), "codign");
    }

    @Test
    public void lastTwoTestTwo() {
        Assert.assertEquals(LastTwoSolution.lastTwo("cat"), "cta");
    }

    @Test
    public void lastTwoTestThree() {
        Assert.assertEquals(LastTwoSolution.lastTwo("ab"), "ba");
    }
}