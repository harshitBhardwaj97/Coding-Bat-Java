package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.Old35Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Old35Tests {
    
   /*
   old35(3) → true
   old35(10) → true
   old35(15) → false
   */

    @Test
    public void old35TestOne() {
        Assert.assertEquals(Old35Solution.old35(3), true);
    }

    @Test
    public void old35TestTwo() {
        Assert.assertEquals(Old35Solution.old35(10), true);
    }

    @Test
    public void old35TestThree() {
        Assert.assertEquals(Old35Solution.old35(15), false);
    }
}