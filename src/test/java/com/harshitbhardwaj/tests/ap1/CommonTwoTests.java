package com.harshitbhardwaj.tests.ap1;

import com.harshitbhardwaj.solutions.ap1.CommonTwoSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CommonTwoTests {
    
   /*
   commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
   commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
   commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3
   */

    @Test
    public void commonTwoTestOne() {
        String[] a = new String[]{"a", "c", "x"};
        String[] b = new String[]{"b", "c", "d", "x"};
        Assert.assertEquals(CommonTwoSolution.commonTwo(a, b), 2);
    }

    @Test
    public void commonTwoTestTwo() {
        String[] a = new String[]{"a", "c", "x"};
        String[] b = new String[]{"a", "b", "c", "x", "z"};
        Assert.assertEquals(CommonTwoSolution.commonTwo(a, b), 3);
    }

    @Test
    public void commonTwoTestThree() {
        String[] a = new String[]{"a", "b", "c"};
        String[] b = new String[]{"a", "b", "c"};
        Assert.assertEquals(CommonTwoSolution.commonTwo(a, b), 3);
    }
}