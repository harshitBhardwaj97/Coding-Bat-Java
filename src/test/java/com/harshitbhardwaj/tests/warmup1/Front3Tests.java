package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.Front3Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Front3Tests {

     /*
     front3("Java") → "JavJavJav"
     front3("Chocolate") → "ChoChoCho"
     front3("abc") → "abcabcabc"
     */

    @Test
    public void front3TestOne() {
        Assert.assertEquals(Front3Solution.front3("Java"), "JavJavJav");
    }

    @Test
    public void front3TestTwo() {
        Assert.assertEquals(Front3Solution.front3("Chocolate"), "ChoChoCho");
    }

    @Test
    public void front3TestThree() {
        Assert.assertEquals(Front3Solution.front3("abc"), "abcabcabc");
    }
}