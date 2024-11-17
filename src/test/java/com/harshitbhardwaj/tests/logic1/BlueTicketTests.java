package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.BlueTicketSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlueTicketTests {
    
   /*
   blueTicket(9, 1, 0) → 10
   blueTicket(9, 2, 0) → 0
   blueTicket(6, 1, 4) → 10
   */

    @Test
    public void blueTicketTestOne() {
        Assert.assertEquals(BlueTicketSolution.blueTicket(9, 1, 0), 10);
    }

    @Test
    public void blueTicketTestTwo() {
        Assert.assertEquals(BlueTicketSolution.blueTicket(9, 2, 0), 0);
    }

    @Test
    public void blueTicketTestThree() {
        Assert.assertEquals(BlueTicketSolution.blueTicket(6, 1, 4), 10);
    }
}