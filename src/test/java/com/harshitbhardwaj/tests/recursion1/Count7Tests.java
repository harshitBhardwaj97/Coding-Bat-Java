package com.harshitbhardwaj.tests.recursion1;

import com.harshitbhardwaj.solutions.recursion1.Count7Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Count7Tests {
    
   /*
   count7(717) → 2
   count7(7) → 1
   count7(123) → 0
   */

    @Test
    public void Count7SolutionTestOne() {
        Assert.assertEquals(Count7Solution.count7(717), 2);
    }

    @Test
    public void Count7SolutionTestTwo() {
        Assert.assertEquals(Count7Solution.count7(7), 1);
    }

    @Test
    public void Count7SolutionTestThree() {
        Assert.assertEquals(Count7Solution.count7(123), 0);
    }
}