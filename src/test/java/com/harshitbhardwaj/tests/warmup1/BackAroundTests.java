package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.BackAroundSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BackAroundTests {

     /*backAround("cat") → "tcatt"
     backAround("Hello") → "oHelloo"
     backAround("a") → "aaa"
     */

    @Test
    public void backAroundTestOne() {
        Assert.assertEquals(BackAroundSolution.backAround("cat"), "tcatt");
    }

    @Test
    public void backAroundTestTwo() {
        Assert.assertEquals(BackAroundSolution.backAround("Hello"), "oHelloo");
    }

    @Test
    public void backAroundTestThree() {
        Assert.assertEquals(BackAroundSolution.backAround("a"), "aaa");
    }
}