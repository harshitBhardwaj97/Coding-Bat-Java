package com.harshitbhardwaj.tests.array1;

import com.harshitbhardwaj.solutions.array1.SwapEndsSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwapEndsTests {

    /*
    swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
    swapEnds([1, 2, 3]) → [3, 2, 1]
    swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
    */

    @Test
    public void swapEndsTestOne() {
        Assert.assertEquals(SwapEndsSolution.swapEnds(new int[]{1, 2, 3, 4}),
                new int[]{4, 2, 3, 1});
    }

    @Test
    public void swapEndsTestTwo() {
        Assert.assertEquals(SwapEndsSolution.swapEnds(new int[]{1, 2, 3}),
                new int[]{3, 2, 1});
    }

    @Test
    public void swapEndsTestThree() {
        Assert.assertEquals(SwapEndsSolution.swapEnds(new int[]{8, 6, 7, 9, 5}),
                new int[]{5, 6, 7, 9, 8});
    }
}