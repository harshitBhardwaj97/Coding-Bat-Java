package com.harshitbhardwaj.tests.recursion1;

import com.harshitbhardwaj.solutions.recursion1.PowerNSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PowerNTests {
    
   /*
   powerN(3, 1) → 3
   powerN(3, 2) → 9
   powerN(3, 3) → 27
   */

    @Test
    public void PowerNSolutionTestOne() {
        Assert.assertEquals(PowerNSolution.powerN(3, 1), 3);
    }

    @Test
    public void PowerNSolutionTestTwo() {
        Assert.assertEquals(PowerNSolution.powerN(3, 2), 9);
    }

    @Test
    public void PowerNSolutionTestThree() {
        Assert.assertEquals(PowerNSolution.powerN(3, 3), 27);
    }
}