package com.harshitbhardwaj.tests.ap1;

import com.harshitbhardwaj.solutions.ap1.HasOneSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HasOneTests {
    
   /*
   hasOne(10) → true
   hasOne(22) → false
   hasOne(220) → false
   */

    @Test
    public void hasOneTestOne() {
        Assert.assertEquals(HasOneSolution.hasOne(10), true);
    }

    @Test
    public void hasOneTestTwo() {
        Assert.assertEquals(HasOneSolution.hasOne(22), false);
    }

    @Test
    public void hasOneTestThree() {
        Assert.assertEquals(HasOneSolution.hasOne(220), false);
    }
}