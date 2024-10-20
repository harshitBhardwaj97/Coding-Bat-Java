package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.MiddleThreeSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MiddleThreeTests {

    /*
    middleThree("Candy") → "and"
    middleThree("and") → "and"
    middleThree("solving") → "lvi"
    */

    @Test
    public void middleThreeTestOne() {
        Assert.assertEquals(MiddleThreeSolution.middleThree("Candy"), "and");
    }

    @Test
    public void middleThreeTestTwo() {
        Assert.assertEquals(MiddleThreeSolution.middleThree("and"), "and");
    }

    @Test
    public void middleThreeTestThree() {
        Assert.assertEquals(MiddleThreeSolution.middleThree("solving"), "lvi");
    }
}