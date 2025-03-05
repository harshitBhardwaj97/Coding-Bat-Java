package com.harshitbhardwaj.tests.recursion1;

import com.harshitbhardwaj.solutions.recursion1.BunnyEars2Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BunnyEars2Tests {
    
   /*
   bunnyEars2(0) → 0
   bunnyEars2(1) → 2
   bunnyEars2(2) → 5
   */

    @Test
    public void BunnyEars2SolutionTestOne() {
        Assert.assertEquals(BunnyEars2Solution.bunnyEars2(0), 0);
    }

    @Test
    public void BunnyEars2SolutionTestTwo() {
        Assert.assertEquals(BunnyEars2Solution.bunnyEars2(1), 2);
    }

    @Test
    public void BunnyEars2SolutionTestThree() {
        Assert.assertEquals(BunnyEars2Solution.bunnyEars2(2), 5);
    }
}