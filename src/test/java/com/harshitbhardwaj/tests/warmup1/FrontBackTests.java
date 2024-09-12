package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.FrontBackSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FrontBackTests {

     /*
    frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba"
      */

    @Test
    public void frontBackTestOne() {
        Assert.assertEquals(FrontBackSolution.frontBack("code"), "eodc");
    }

    @Test
    public void frontBackTestTwo() {
        Assert.assertEquals(FrontBackSolution.frontBack("a"), "a");
    }

    @Test
    public void frontBackTestThree() {
        Assert.assertEquals(FrontBackSolution.frontBack("ab"), "ba");
    }
}