package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.IntMaxSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IntMaxTests {

     /*
     intMax(1, 2, 3) → 3
     intMax(1, 3, 2) → 3
     intMax(3, 2, 1) → 3
     */

    @Test
    public void intMaxTestOne() {
        Assert.assertEquals(IntMaxSolution.intMax(1, 2, 3), 3);
    }

    @Test
    public void intMaxTestTwo() {
        Assert.assertEquals(IntMaxSolution.intMax(1, 3, 2), 3);
    }

    @Test
    public void intMaxTestThree() {
        Assert.assertEquals(IntMaxSolution.intMax(3, 2, 1), 3);
    }
}