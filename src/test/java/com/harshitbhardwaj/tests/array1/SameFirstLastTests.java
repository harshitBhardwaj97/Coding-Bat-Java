package com.harshitbhardwaj.tests.array1;

import com.harshitbhardwaj.solutions.array1.SameFirstLastSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SameFirstLastTests {

    /*
    sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true
    sameFirstLast([1, 2, 1]) → true
    */

    @Test
    public void sameFirstLastTestOne() {
        Assert.assertEquals(SameFirstLastSolution.sameFirstLast(new int[]{1, 2, 3}), false);
    }

    @Test
    public void sameFirstLastTestTwo() {
        Assert.assertEquals(SameFirstLastSolution.sameFirstLast(new int[]{1, 2, 3, 1}), true);
    }

    @Test
    public void sameFirstLastTestThree() {
        Assert.assertEquals(SameFirstLastSolution.sameFirstLast(new int[]{1, 2, 1}), true);
    }
}