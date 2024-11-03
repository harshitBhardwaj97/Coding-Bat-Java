package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.InOrderSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InOrderTests {
    
   /*
   inOrder(1, 2, 4, false) → true
   inOrder(1, 2, 1, false) → false
   inOrder(1, 1, 2, true) → true
   */

    @Test
    public void inorderTestOne() {
        Assert.assertEquals(InOrderSolution.inOrder(1, 2, 4, false), true);
    }

    @Test
    public void inorderTestTwo() {
        Assert.assertEquals(InOrderSolution.inOrder(1, 2, 1, false), false);
    }

    @Test
    public void inorderTestThree() {
        Assert.assertEquals(InOrderSolution.inOrder(1, 1, 2, true), true);
    }
}