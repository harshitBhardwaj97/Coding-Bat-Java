package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.Right2Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Right2Tests {

    /*
    right2("Hello") → "loHel"
    right2("java") → "vaja"
    right2("Hi") → "Hi"
    */

    @Test
    public void right2TestOne() {
        Assert.assertEquals(Right2Solution.right2("Hello"), "loHel");
    }

    @Test
    public void right2TestTwo() {
        Assert.assertEquals(Right2Solution.right2("java"), "vaja");
    }

    @Test
    public void right2TestThree() {
        Assert.assertEquals(Right2Solution.right2("Hi"), "Hi");
    }
}