package com.harshitbhardwaj.tests.ap1;

import com.harshitbhardwaj.solutions.ap1.UserCompareSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserCompareTests {
    
   /*
   userCompare("bb", 1, "zz", 2) → -1
   userCompare("bb", 1, "aa", 2) → 1
   userCompare("bb", 1, "bb", 1) → 0
   */

    @Test
    public void userCompareTestOne() {
        Assert.assertEquals(UserCompareSolution.userCompare("bb", 1, "zz", 2), -1);
    }

    @Test
    public void userCompareTestTwo() {
        Assert.assertEquals(UserCompareSolution.userCompare("bb", 1, "aa", 2), 1);
    }

    @Test
    public void userCompareTestThree() {
        Assert.assertEquals(UserCompareSolution.userCompare("bb", 1, "bb", 1), 0);
    }
}