package com.harshitbhardwaj.tests.recursion1;

import com.harshitbhardwaj.solutions.recursion1.CountHiSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CountHiTests {
    
   /*
   countHi("xxhixx") → 1
   countHi("xhixhix") → 2
   countHi("hi") → 1
   */

    @Test
    public void CountHiSolutionTestOne() {
        Assert.assertEquals(CountHiSolution.countHi("xxhixx"), 1);
    }

    @Test
    public void CountHiSolutionTestTwo() {
        Assert.assertEquals(CountHiSolution.countHi("xhixhix"), 2);
    }

    @Test
    public void CountHiSolutionTestThree() {
        Assert.assertEquals(CountHiSolution.countHi("hi"), 1);
    }
}