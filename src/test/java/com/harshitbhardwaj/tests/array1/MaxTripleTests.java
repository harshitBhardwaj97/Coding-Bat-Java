package com.harshitbhardwaj.tests.array1;

import com.harshitbhardwaj.solutions.array1.MaxTripleSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MaxTripleTests {

    /*
    maxTriple([1,2,3]) → 3
    maxTriple([1,5,3]) → 5
    maxTriple([5,2,3]) → 5
    */

    @Test
    public void maxTripleTestOne() {
        Assert.assertEquals(MaxTripleSolution.maxTriple(new int[]{1, 2, 3}), 3);
    }

    @Test
    public void maxTripleTestTwo() {
        Assert.assertEquals(MaxTripleSolution.maxTriple(new int[]{1, 5, 3}), 5);
    }

    @Test
    public void maxTripleTestThree() {
        Assert.assertEquals(MaxTripleSolution.maxTriple(new int[]{5, 2, 3}), 5);
    }
}