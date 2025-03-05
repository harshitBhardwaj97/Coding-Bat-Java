package com.harshitbhardwaj.tests.recursion1;

import com.harshitbhardwaj.solutions.recursion1.BunnyEarsSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BunnyEarsTests {
    
   /*
   bunnyEars(0) → 0
   bunnyEars(1) → 2
   bunnyEars(2) → 4
   */

    @Test
    public void BunnyEarsSolutionTestOne() {
        Assert.assertEquals(BunnyEarsSolution.bunnyEars(0), 0);
    }

    @Test
    public void BunnyEarsSolutionTestTwo() {
        Assert.assertEquals(BunnyEarsSolution.bunnyEars(1), 2);
    }

    @Test
    public void BunnyEarsSolutionTestThree() {
        Assert.assertEquals(BunnyEarsSolution.bunnyEars(2), 4);
    }
}