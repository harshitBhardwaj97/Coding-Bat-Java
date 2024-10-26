package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.WithoutX2Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WithoutX2Tests {

    /*
    withoutX2("xHi") → "Hi"
    withoutX2("Hxi") → "Hi"
    withoutX2("Hi") → "Hi"
    */

    @Test
    public void withoutX2TestOne() {
        Assert.assertEquals(WithoutX2Solution.withoutX2("xHi"), "Hi");
    }

    @Test
    public void withoutX2TestTwo() {
        Assert.assertEquals(WithoutX2Solution.withoutX2("Hxi"), "Hi");
    }

    @Test
    public void withoutX2TestThree() {
        Assert.assertEquals(WithoutX2Solution.withoutX2("Hi"), "Hi");
    }
}