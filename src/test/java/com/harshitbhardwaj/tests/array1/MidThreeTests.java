package com.harshitbhardwaj.tests.array1;

import com.harshitbhardwaj.solutions.array1.MidThreeSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MidThreeTests {

    /*
    midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
    midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
    midThree([1, 2, 3]) → [1, 2, 3]
    */

    @Test
    public void midThreeTestOne() {
        Assert.assertEquals(MidThreeSolution.midThree(new int[]{1, 2, 3, 4, 5}),
                new int[]{2, 3, 4});
    }

    @Test
    public void midThreeTestTwo() {
        Assert.assertEquals(MidThreeSolution.midThree(new int[]{8, 6, 7, 5, 3, 0, 9}),
                new int[]{7, 5, 3});
    }

    @Test
    public void midThreeTestThree() {
        Assert.assertEquals(MidThreeSolution.midThree(new int[]{1, 2, 3}),
                new int[]{1, 2, 3});
    }
}