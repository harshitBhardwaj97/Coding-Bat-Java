package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.InOrderEqualSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InOrderEqualTests {
    
   /*
   inOrderEqual(2, 5, 11, false) → true
   inOrderEqual(5, 7, 6, false) → false
   inOrderEqual(5, 5, 7, true) → true
   */

    @Test
    public void inOrderEqualTestOne() {
        Assert.assertEquals(InOrderEqualSolution.inOrderEqual(2, 5, 11, false)
                , true);
    }

    @Test
    public void inOrderEqualTestTwo() {
        Assert.assertEquals(InOrderEqualSolution.inOrderEqual(5, 7, 6, false)
                , false);
    }

    @Test
    public void inOrderEqualTestThree() {
        Assert.assertEquals(InOrderEqualSolution.inOrderEqual(5, 5, 7, true)
                , true);
    }
}