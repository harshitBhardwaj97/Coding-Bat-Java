package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.Without2Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Without2Tests {

    /*
    without2("HelloHe") → "lloHe"
    without2("HelloHi") → "HelloHi"
    without2("Hi") → ""
    */

    @Test
    public void without2TestOne() {
        Assert.assertEquals(Without2Solution.without2("HelloHe"), "lloHe");
    }

    @Test
    public void without2TestTwo() {
        Assert.assertEquals(Without2Solution.without2("HelloHi"), "HelloHi");
    }

    @Test
    public void without2TestThree() {
        Assert.assertEquals(Without2Solution.without2("Hi"), "");
    }
}