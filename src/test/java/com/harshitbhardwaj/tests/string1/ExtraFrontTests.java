package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.ExtraFrontSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExtraFrontTests {

    /*
    extraFront("Hello") → "HeHeHe"
    extraFront("ab") → "ababab"
    extraFront("H") → "HHH"
    */

    @Test
    public void extraFrontTestOne() {
        Assert.assertEquals(ExtraFrontSolution.extraFront("Hello"), "HeHeHe");
    }

    @Test
    public void extraFrontTestTwo() {
        Assert.assertEquals(ExtraFrontSolution.extraFront("ab"), "ababab");
    }

    @Test
    public void extraFrontTestThree() {
        Assert.assertEquals(ExtraFrontSolution.extraFront("H"), "HHH");
    }
}