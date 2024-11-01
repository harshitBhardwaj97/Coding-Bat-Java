package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.More20Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class More20Tests {
    
   /*
   more20(20) → false
   more20(21) → true
   more20(22) → true
   */

    @Test
    public void more20TestOne() {
        Assert.assertEquals(More20Solution.more20(20), false);
    }

    @Test
    public void more20TestTwo() {
        Assert.assertEquals(More20Solution.more20(21), true);
    }

    @Test
    public void more20TestThree() {
        Assert.assertEquals(More20Solution.more20(22), true);
    }
}