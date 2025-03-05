package com.harshitbhardwaj.tests.recursion1;

import com.harshitbhardwaj.solutions.recursion1.CountXSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CountXTests {
    
   /*
   countX("xxhixx") → 4
   countX("xhixhix") → 3
   countX("hi") → 0
   */

    @Test
    public void CountXSolutionTestOne() {
        Assert.assertEquals(CountXSolution.countX("xxhixx"), 4);
    }

    @Test
    public void CountXSolutionTestTwo() {
        Assert.assertEquals(CountXSolution.countX("xhixhix"), 3);
    }

    @Test
    public void CountXSolutionTestThree() {
        Assert.assertEquals(CountXSolution.countX("hi"), 0);
    }
}