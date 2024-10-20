package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.HasBadSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HasBadTests {

    /*
    hasBad("badxx") → true
    hasBad("xbadxx") → true
    hasBad("xxbadxx") → false
    */

    @Test
    public void hasBadTestOne() {
        Assert.assertEquals(HasBadSolution.hasBad("badxx"), true);
    }

    @Test
    public void hasBadTestTwo() {
        Assert.assertEquals(HasBadSolution.hasBad("xbadxx"), true);
    }

    @Test
    public void hasBadTestThree() {
        Assert.assertEquals(HasBadSolution.hasBad("xxbadxx"), false);
    }
}