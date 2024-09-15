package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.LoneTeenSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoneTeenTests {

     /*
     loneTeen(13, 99) → true
     loneTeen(21, 19) → true
     loneTeen(13, 13) → false
     */

    @Test
    public void loneTeenTestOne() {
        Assert.assertEquals(LoneTeenSolution.loneTeen(13, 99), true);
    }

    @Test
    public void loneTeenTestTwo() {
        Assert.assertEquals(LoneTeenSolution.loneTeen(21, 19), true);
    }

    @Test
    public void loneTeenTestThree() {
        Assert.assertEquals(LoneTeenSolution.loneTeen(13, 13), false);
    }
}