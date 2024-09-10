package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.NotStringSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotStringTests {

     /*
    notString("candy") → "not candy"
    notString("x") → "not x"
    notString("not bad") → "not bad"
      */

    @Test
    public void notStringTestOne() {
        Assert.assertEquals(NotStringSolution.notString("candy"), "not candy");
    }

    @Test
    public void notStringTestTwo() {
        Assert.assertEquals(NotStringSolution.notString("x"), "not x");
    }

    @Test
    public void notStringTestThree() {
        Assert.assertEquals(NotStringSolution.notString("not bad"), "not bad");
    }
}