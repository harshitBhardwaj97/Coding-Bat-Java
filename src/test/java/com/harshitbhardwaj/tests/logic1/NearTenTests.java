package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.NearTenSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NearTenTests {
    
   /*
   nearTen(12) → true
   nearTen(17) → false
   nearTen(19) → true
   */

    @Test
    public void nearTenTestOne() {
        Assert.assertEquals(NearTenSolution.nearTen(12), true);
    }

    @Test
    public void nearTenTestTwo() {
        Assert.assertEquals(NearTenSolution.nearTen(17), false);
    }

    @Test
    public void nearTenTestThree() {
        Assert.assertEquals(NearTenSolution.nearTen(19), true);
    }
}