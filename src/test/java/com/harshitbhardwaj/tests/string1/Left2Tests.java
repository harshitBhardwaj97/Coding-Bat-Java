package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.Left2Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Left2Tests {

    /*
    left2("Hello") → "lloHe"
    left2("java") → "vaja"
    left2("Hi") → "Hi"
    */

    @Test
    public void left2TestOne() {
        Assert.assertEquals(Left2Solution.left2("Hello"), "lloHe");
    }

    @Test
    public void left2TestTwo() {
        Assert.assertEquals(Left2Solution.left2("java"), "vaja");
    }

    @Test
    public void left2TestThree() {
        Assert.assertEquals(Left2Solution.left2("Hi"), "Hi");
    }
}