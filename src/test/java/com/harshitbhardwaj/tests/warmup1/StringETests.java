package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.StringESolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringETests {

    /*
    stringE("Hello") → true
    stringE("Heelle") → true
    stringE("Heelele") → false
    */

    @Test
    public void stringETestOne() {
        Assert.assertEquals(StringESolution.stringE("Hello"), true);
    }

    @Test
    public void stringETestTwo() {
        Assert.assertEquals(StringESolution.stringE("Heelle"), true);
    }

    @Test
    public void stringETestThree() {
        Assert.assertEquals(StringESolution.stringE("Heelele"), false);
    }
}