package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.WithoutXSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WithoutXTests {

    /*
    withoutX("xHix") → "Hi"
    withoutX("xHi") → "Hi"
    withoutX("Hxix") → "Hxi"
    */

    @Test
    public void withoutXTestOne() {
        Assert.assertEquals(WithoutXSolution.withoutX("xHix"), "Hi");
    }

    @Test
    public void withoutXTestTwo() {
        Assert.assertEquals(WithoutXSolution.withoutX("xHi"), "Hi");
    }

    @Test
    public void withoutXTestThree() {
        Assert.assertEquals(WithoutXSolution.withoutX("Hxix"), "Hxi");
    }
}