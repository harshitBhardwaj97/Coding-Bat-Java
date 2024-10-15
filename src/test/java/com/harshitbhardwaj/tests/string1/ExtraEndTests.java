package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.ExtraEndSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExtraEndTests {

    /*
    extraEnd("Hello") → "lololo"
    extraEnd("ab") → "ababab"
    extraEnd("Hi") → "HiHiHi"
    */

    @Test
    public void extraEndTestOne() {
        Assert.assertEquals(ExtraEndSolution.extraEnd("Hello"), "lololo");
    }

    @Test
    public void extraEndTestTwo() {
        Assert.assertEquals(ExtraEndSolution.extraEnd("ab"), "ababab");
    }

    @Test
    public void extraEndTestThree() {
        Assert.assertEquals(ExtraEndSolution.extraEnd("Hi"), "HiHiHi");
    }
}