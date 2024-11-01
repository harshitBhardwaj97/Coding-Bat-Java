package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.Less20Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Less20Tests {
    
   /*
   less20(18) → true
   less20(19) → true
   less20(20) → false
   */

    @Test
    public void less20TestOne() {
        Assert.assertEquals(Less20Solution.less20(18), true);
    }

    @Test
    public void less20TestTwo() {
        Assert.assertEquals(Less20Solution.less20(19), true);
    }

    @Test
    public void less20TestThree() {
        Assert.assertEquals(Less20Solution.less20(20), false);
    }
}