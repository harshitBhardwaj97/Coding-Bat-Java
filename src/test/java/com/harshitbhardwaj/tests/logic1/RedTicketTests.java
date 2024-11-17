package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.RedTicketSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RedTicketTests {
    
   /*
   redTicket(2, 2, 2) → 10
   redTicket(2, 2, 1) → 0
   redTicket(0, 0, 0) → 5
   */

    @Test
    public void redTicketTestOne() {
        Assert.assertEquals(RedTicketSolution.redTicket(2, 2, 2), 10);
    }

    @Test
    public void redTicketTestTwo() {
        Assert.assertEquals(RedTicketSolution.redTicket(2, 2, 1), 0);
    }

    @Test
    public void redTicketTestThree() {
        Assert.assertEquals(RedTicketSolution.redTicket(0, 0, 0), 5);
    }
}