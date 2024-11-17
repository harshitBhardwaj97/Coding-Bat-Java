package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.GreenTicketSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GreenTicketTests {
    
   /*
   greenTicket(1, 2, 3) → 0
   greenTicket(2, 2, 2) → 20
   greenTicket(1, 1, 2) → 10
   */

    @Test
    public void greenTicketTestOne() {
        Assert.assertEquals(GreenTicketSolution.greenTicket(1, 2, 3), 0);
    }

    @Test
    public void greenTicketTestTwo() {
        Assert.assertEquals(GreenTicketSolution.greenTicket(2, 2, 2), 20);
    }

    @Test
    public void greenTicketTestThree() {
        Assert.assertEquals(GreenTicketSolution.greenTicket(1, 1, 2), 10);
    }
}