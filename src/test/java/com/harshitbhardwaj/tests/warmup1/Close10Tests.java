package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.Close10Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Close10Tests {

     /*
     close10(8,13) → 8
     close10(13,8) → 8
     close10(13,7) → 0
     */

    @Test
    public void close10TestOne() {
        Assert.assertEquals(Close10Solution.close10(8, 13), 8);
    }

    @Test
    public void close10TestTwo() {
        Assert.assertEquals(Close10Solution.close10(13, 8), 8);
    }

    @Test
    public void close10TestThree() {
        Assert.assertEquals(Close10Solution.close10(13, 7), 0);
    }
}