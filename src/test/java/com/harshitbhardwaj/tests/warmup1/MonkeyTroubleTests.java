package com.harshitbhardwaj.tests.warmup1;

import com.harshitbhardwaj.solutions.warmup1.MonkeyTroubleSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MonkeyTroubleTests {

     /*
    monkeyTrouble(true, true) → true
    monkeyTrouble(false, false) → true
    monkeyTrouble(true, false) → false
      */

    @Test
    public void monkeyTroubleTestOne() {
        Assert.assertEquals(MonkeyTroubleSolution.monkeyTrouble(true, true), true);
    }

    @Test
    public void monkeyTroubleTestTwo() {
        Assert.assertEquals(MonkeyTroubleSolution.monkeyTrouble(false, false), true);
    }

    @Test
    public void monkeyTroubleTestThree() {
        Assert.assertEquals(MonkeyTroubleSolution.monkeyTrouble(true, false), false);
    }
}
 