package com.harshitbhardwaj.tests.array1;

import com.harshitbhardwaj.solutions.array1.MakeEndsSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MakeEndsTests {

    /*
    makeEnds([1, 2, 3]) → [1, 3]
    makeEnds([1, 2, 3, 4]) → [1, 4]
    makeEnds([7, 4, 6, 2]) → [7, 2]
    */

    @Test
    public void makeEndsTestOne() {
        Assert.assertEquals(MakeEndsSolution.makeEnds(new int[]{1, 2, 3}),
                new int[]{1, 3});
    }

    @Test
    public void makeEndsTestTwo() {
        Assert.assertEquals(MakeEndsSolution.makeEnds(new int[]{1, 2, 3, 4}),
                new int[]{1, 4});
    }

    @Test
    public void makeEndsTestThree() {
        Assert.assertEquals(MakeEndsSolution.makeEnds(new int[]{7, 4, 6, 2}),
                new int[]{7, 2});
    }
}