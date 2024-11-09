package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.LessBy10Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LessBy10Tests {
    
   /*
   lessBy10(1, 7, 11) → true
   lessBy10(1, 7, 10) → false
   lessBy10(11, 1, 7) → true
   */

    @Test
    public void lessBy10TestOne() {
        Assert.assertEquals(LessBy10Solution.lessBy10(1, 7, 11), true);
    }

    @Test
    public void lessBy10TestTwo() {
        Assert.assertEquals(LessBy10Solution.lessBy10(1, 7, 10), false);
    }

    @Test
    public void lessBy10TestThree() {
        Assert.assertEquals(LessBy10Solution.lessBy10(11, 1, 7), true);
    }
}