package com.harshitbhardwaj.tests.array1;

import com.harshitbhardwaj.solutions.array1.MiddleWaySolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MiddleWayTests {

    /*
    middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
    middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
    middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
    */

    @Test
    public void middlewayTestOne() {
        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{4, 5, 6};
        Assert.assertEquals(MiddleWaySolution.middleWay(a, b), new int[]{2, 5});
    }

    @Test
    public void middlewayTestTwo() {
        int[] a = new int[]{7, 7, 7};
        int[] b = new int[]{3, 8, 0};
        Assert.assertEquals(MiddleWaySolution.middleWay(a, b), new int[]{7, 8});
    }

    @Test
    public void middlewayTestThree() {
        int[] a = new int[]{5, 2, 9};
        int[] b = new int[]{1, 4, 5};
        Assert.assertEquals(MiddleWaySolution.middleWay(a, b), new int[]{2, 4});
    }
}