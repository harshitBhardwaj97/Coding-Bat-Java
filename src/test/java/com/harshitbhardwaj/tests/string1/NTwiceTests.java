package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.NTwiceSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NTwiceTests {

    /*
    nTwice("Hello", 2) → "Helo"
    nTwice("Chocolate", 3) → "Choate"
    nTwice("Chocolate", 1) → "Ce"
    */

    @Test
    public void nTwiceTestOne() {
        Assert.assertEquals(NTwiceSolution.nTwice("Hello", 2), "Helo");
    }

    @Test
    public void nTwiceTestTwo() {
        Assert.assertEquals(NTwiceSolution.nTwice("Chocolate", 3), "Choate");
    }

    @Test
    public void nTwiceTestThree() {
        Assert.assertEquals(NTwiceSolution.nTwice("Chocolate", 1), "Ce");
    }
}