package com.harshitbhardwaj.tests.recursion1;

import com.harshitbhardwaj.solutions.recursion1.FactorialSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTests {
    
   /*
   factorial(1) → 1
   factorial(2) → 2
   factorial(3) → 6
   */

    @Test
    public void FactorialSolutionTestOne() {
        Assert.assertEquals(FactorialSolution.factorial(1), 1);
    }

    @Test
    public void FactorialSolutionTestTwo() {
        Assert.assertEquals(FactorialSolution.factorial(2), 2);
    }

    @Test
    public void FactorialSolutionTestThree() {
        Assert.assertEquals(FactorialSolution.factorial(3), 6);
    }
}