package com.harshitbhardwaj.tests.array1;

import com.harshitbhardwaj.solutions.array1.MakeLastSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MakeLastTests {

    /*
    makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
    makeLast([1, 2]) → [0, 0, 0, 2]
    makeLast([3]) → [0, 3]
    */


    @Test
    public void makeLastTestOne() {
        Assert.assertEquals(MakeLastSolution.makeLast(new int[]{4, 5, 6}),
                new int[]{0, 0, 0, 0, 0, 6});
    }

    @Test
    public void makeLastTestTwo() {
        Assert.assertEquals(MakeLastSolution.makeLast(new int[]{1, 2}),
                new int[]{0, 0, 0, 2});
    }

    @Test
    public void makeLastTestThree() {
        Assert.assertEquals(MakeLastSolution.makeLast(new int[]{3}),
                new int[]{0, 3});
    }
}