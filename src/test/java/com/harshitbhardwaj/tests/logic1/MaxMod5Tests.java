package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.MaxMod5Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MaxMod5Tests {
    
   /*
   maxMod5(2, 3) → 3
   maxMod5(6, 2) → 6
   maxMod5(3, 2) → 3
   */

    @Test
    public void maxMod5TestOne() {
        Assert.assertEquals(MaxMod5Solution.maxMod5(2, 3), 3);
    }

    @Test
    public void maxMod5TestTwo() {
        Assert.assertEquals(MaxMod5Solution.maxMod5(6, 2), 6);
    }

    @Test
    public void maxMod5TestThree() {
        Assert.assertEquals(MaxMod5Solution.maxMod5(3, 2), 3);
    }
}