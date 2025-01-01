package com.harshitbhardwaj.tests.ap1;

import com.harshitbhardwaj.solutions.ap1.Scores100Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scores100Tests {
    
   /*
   scores100([1, 100, 100]) → true
   scores100([1, 100, 99, 100]) → false
   scores100([100, 1, 100, 100]) → true
   */

    @Test
    public void scores100TestOne() {
        Assert.assertEquals(Scores100Solution.scores100(new int[]{1, 100, 100}), true);
    }

    @Test
    public void scores100TestTwo() {
        Assert.assertEquals(Scores100Solution.scores100(new int[]{1, 100, 99, 100}), false);
    }

    @Test
    public void scores100TestThree() {
        Assert.assertEquals(Scores100Solution.scores100(new int[]{100, 1, 100, 100}), true);
    }
}