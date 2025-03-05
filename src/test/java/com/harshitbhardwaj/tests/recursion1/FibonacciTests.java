package com.harshitbhardwaj.tests.recursion1;

import com.harshitbhardwaj.solutions.recursion1.FibonacciSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FibonacciTests {
    
   /*
   fibonacci(0) → 0
   fibonacci(1) → 1
   fibonacci(2) → 1
   */

    @Test
    public void FibonacciSolutionTestOne() {
        Assert.assertEquals(FibonacciSolution.fibonacci(0), 0);
    }

    @Test
    public void FibonacciSolutionTestTwo() {
        Assert.assertEquals(FibonacciSolution.fibonacci(1), 1);
    }

    @Test
    public void FibonacciSolutionTestThree() {
        Assert.assertEquals(FibonacciSolution.fibonacci(2), 1);
    }
}