package com.harshitbhardwaj.tests.array1;

import com.harshitbhardwaj.solutions.array1.MakeMiddleSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MakeMiddleTests {

    /*
    makeMiddle([1, 2, 3, 4]) → [2, 3]
    makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
    makeMiddle([1, 2]) → [1, 2]
    */

    @Test
    public void makeMiddleTestOne() {
        Assert.assertEquals(MakeMiddleSolution.makeMiddle(new int[]{1, 2, 3, 4}),
                new int[]{2, 3});
    }

    @Test
    public void makeMiddleTestTwo() {
        Assert.assertEquals(MakeMiddleSolution.makeMiddle(new int[]{7, 1, 2, 3, 4, 9}),
                new int[]{2, 3});
    }

    @Test
    public void makeMiddleTestThree() {
        Assert.assertEquals(MakeMiddleSolution.makeMiddle(new int[]{1, 2}),
                new int[]{1, 2});
    }
}