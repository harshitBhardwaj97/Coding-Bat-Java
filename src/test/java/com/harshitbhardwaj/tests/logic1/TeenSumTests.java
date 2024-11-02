package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.TeenSumSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TeenSumTests {

    /*
    teenSum(3, 4) → 7
    teenSum(10, 13) → 19
    teenSum(13, 2) → 19
    */

    @Test
    public void teenSumTestOne() {
        Assert.assertEquals(TeenSumSolution.teenSum(3, 4), 7);
    }

    @Test
    public void teenSumTestTwo() {
        Assert.assertEquals(TeenSumSolution.teenSum(10, 13), 19);
    }

    @Test
    public void teenSumTestThree() {
        Assert.assertEquals(TeenSumSolution.teenSum(13, 2), 19);
    }
}