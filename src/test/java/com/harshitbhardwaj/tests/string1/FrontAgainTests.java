package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.FrontAgainSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FrontAgainTests {

    /*
    frontAgain("edited") → true
    frontAgain("edit") → false
    frontAgain("ed") → true
    */

    @Test
    public void frontAgainTestOne() {
        Assert.assertEquals(FrontAgainSolution.frontAgain("edited"), true);
    }

    @Test
    public void frontAgainTestTwo() {
        Assert.assertEquals(FrontAgainSolution.frontAgain("edit"), false);
    }

    @Test
    public void frontAgainTestThree() {
        Assert.assertEquals(FrontAgainSolution.frontAgain("ed"), true);
    }
}