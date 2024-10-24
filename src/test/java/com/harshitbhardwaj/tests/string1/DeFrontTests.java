package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.DeFrontSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeFrontTests {

    /*
    deFront("Hello") → "llo"
    deFront("java") → "va"
    deFront("away") → "aay"
    */

    @Test
    public void deFrontTestOne() {
        Assert.assertEquals(DeFrontSolution.deFront("Hello"), "llo");
    }

    @Test
    public void deFrontTestTwo() {
        Assert.assertEquals(DeFrontSolution.deFront("java"), "va");
    }

    @Test
    public void deFrontTestThree() {
        Assert.assertEquals(DeFrontSolution.deFront("away"), "aay");
    }
}