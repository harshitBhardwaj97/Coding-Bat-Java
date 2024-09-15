package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.HasTeenSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HasTeenTests {

    /*
    hasTeen(13, 20, 10) → true
    hasTeen(20, 19, 10) → true
    hasTeen(20, 10, 13) → true
    */

    @Test
    public void hasTeenTestOne() {
        Assert.assertEquals(HasTeenSolution.hasTeen(13, 20, 10), true);
    }

    @Test
    public void hasTeenTestTwo() {
        Assert.assertEquals(HasTeenSolution.hasTeen(20, 19, 10), true);
    }

    @Test
    public void hasTeenTestThree() {
        Assert.assertEquals(HasTeenSolution.hasTeen(20, 10, 13), true);
    }
}