package com.harshitbhardwaj.tests.array1;

import com.harshitbhardwaj.solutions.array1.CommonEndSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CommonEndTests {

    /*
    commonEnd([1, 2, 3], [7, 3]) → true
    commonEnd([1, 2, 3], [7, 3, 2]) → false
    commonEnd([1, 2, 3], [1, 3]) → true
    */

    @Test
    public void commonEndTestOne() {
        Assert.assertEquals(CommonEndSolution.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}), true);
    }

    @Test
    public void commonEndTestTwo() {
        Assert.assertEquals(CommonEndSolution.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}), false);
    }

    @Test
    public void commonEndTestThree() {
        Assert.assertEquals(CommonEndSolution.commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}), true);
    }
}