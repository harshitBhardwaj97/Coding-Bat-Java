package com.harshitbhardwaj.tests.recursion1;

import com.harshitbhardwaj.solutions.recursion1.TriangleSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleTests {
    
   /*
   triangle(0) → 0
   triangle(1) → 1
   triangle(2) → 3
   */

    @Test
    public void TriangleSolutionTestOne() {
        Assert.assertEquals(TriangleSolution.triangle(0), 0);
    }

    @Test
    public void TriangleSolutionTestTwo() {
        Assert.assertEquals(TriangleSolution.triangle(1), 1);
    }

    @Test
    public void TriangleSolutionTestThree() {
        Assert.assertEquals(TriangleSolution.triangle(2), 3);
    }
}