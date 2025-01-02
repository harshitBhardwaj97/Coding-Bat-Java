package com.harshitbhardwaj.tests.ap1;

import com.harshitbhardwaj.solutions.ap1.DividesSelfSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DividesSelfTests {
    
   /*
   dividesSelf(128) → true
   dividesSelf(12) → true
   dividesSelf(120) → false
   */

    @Test
    public void dividesSelfTestOne() {
        Assert.assertEquals(DividesSelfSolution.dividesSelf(128), true);
    }

    @Test
    public void dividesSelfTestTwo() {
        Assert.assertEquals(DividesSelfSolution.dividesSelf(12), true);
    }

    @Test
    public void dividesSelfTestThree() {
        Assert.assertEquals(DividesSelfSolution.dividesSelf(120), false);
    }
}