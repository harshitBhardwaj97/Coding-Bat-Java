package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.Diff21Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Diff21Tests {

    /*
    diff21(19) → 2
    diff21(10) → 11
    diff21(21) → 0
     */

    @Test
    public void diff21TestOne() {
        Assert.assertEquals(Diff21Solution.diff21(19), 2);
    }

    @Test
    public void diff21TestTwo() {
        Assert.assertEquals(Diff21Solution.diff21(10), 11);
    }

    @Test
    public void diff21TestThree() {
        Assert.assertEquals(Diff21Solution.diff21(21), 0);
    }
}