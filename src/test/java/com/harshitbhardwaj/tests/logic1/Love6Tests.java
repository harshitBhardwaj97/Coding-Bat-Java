package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.Love6Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Love6Tests {
    
   /*
   love6(6, 4) → true
   love6(4, 5) → false
   love6(1, 5) → true
   */

    @Test
    public void love6TestOne() {
        Assert.assertEquals(Love6Solution.love6(6, 4), true);
    }

    @Test
    public void love6TestTwo() {
        Assert.assertEquals(Love6Solution.love6(4, 5), false);
    }

    @Test
    public void love6TestThree() {
        Assert.assertEquals(Love6Solution.love6(1, 5), true);
    }
}