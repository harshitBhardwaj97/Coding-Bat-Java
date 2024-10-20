package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.AtFirstSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AtFirstTests {

    /*
    atFirst("hello") → "he"
    atFirst("hi") → "hi"
    atFirst("h") → "h@"
    */

    @Test
    public void atFirstTestOne() {
        Assert.assertEquals(AtFirstSolution.atFirst("hello"), "he");
    }

    @Test
    public void atFirstTestTwo() {
        Assert.assertEquals(AtFirstSolution.atFirst("hi"), "hi");
    }

    @Test
    public void atFirstTestThree() {
        Assert.assertEquals(AtFirstSolution.atFirst("h"), "h@");
    }
}