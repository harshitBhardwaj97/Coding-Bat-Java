package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.DelDelSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DelDelTests {

    /*
    delDel("adelbc") → "abc"
    delDel("adelHello") → "aHello"
    delDel("adedbc") → "adedbc"
    */

    @Test
    public void delDelTestOne() {
        Assert.assertEquals(DelDelSolution.delDel("adelbc"), "abc");
    }

    @Test
    public void delDelTestTwo() {
        Assert.assertEquals(DelDelSolution.delDel("adelHello"), "aHello");
    }

    @Test
    public void delDelTestThree() {
        Assert.assertEquals(DelDelSolution.delDel("adedbc"), "adedbc");
    }
}