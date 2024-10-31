package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.AlarmClockSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlarmClockTests {
    
   /*
   alarmClock(1, false) → "7:00"
   alarmClock(5, false) → "7:00"
   alarmClock(0, false) → "10:00"
   */

    @Test
    public void alarmClockTestOne() {
        Assert.assertEquals(AlarmClockSolution.alarmClock(1, false), "7:00");
    }

    @Test
    public void alarmClockTestTwo() {
        Assert.assertEquals(AlarmClockSolution.alarmClock(5, false), "7:00");
    }

    @Test
    public void alarmClockTestThree() {
        Assert.assertEquals(AlarmClockSolution.alarmClock(0, false), "10:00");
    }
}