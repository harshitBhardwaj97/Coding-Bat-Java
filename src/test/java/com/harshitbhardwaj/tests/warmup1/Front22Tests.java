package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.Front22Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Front22Tests {

     /*
     front22("kitten") → "kikittenki"
     front22("Ha") → "HaHaHa"
     front22("abc") → "ababcab"
     */

    @Test
    public void front22TestOne() {
        Assert.assertEquals(Front22Solution.front22("kitten"), "kikittenki");
    }

    @Test
    public void front22TestTwo() {
        Assert.assertEquals(Front22Solution.front22("Ha"), "HaHaHa");
    }

    @Test
    public void front22TestThree() {
        Assert.assertEquals(Front22Solution.front22("abc"), "ababcab");
    }
}