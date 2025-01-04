package com.harshitbhardwaj.tests.ap1;

import com.harshitbhardwaj.solutions.ap1.ScoresSpecialSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScoresSpecialTests {
    
   /*
   scoresSpecial([12, 10, 4], [2, 20, 30]) → 40
   scoresSpecial([20, 10, 4], [2, 20, 10]) → 40
   scoresSpecial([12, 11, 4], [2, 20, 31]) → 20
   */

    @Test
    public void scoresSpecialTestOne() {
        int[] inputOne = new int[]{10, 12, 4};
        int[] inputTwo = new int[]{2, 20, 30};
        Assert.assertEquals(ScoresSpecialSolution.scoresSpecial(inputOne, inputTwo), 40);
    }

    @Test
    public void scoresSpecialTestTwo() {
        int[] inputOne = new int[]{20, 10, 4};
        int[] inputTwo = new int[]{2, 20, 10};
        Assert.assertEquals(ScoresSpecialSolution.scoresSpecial(inputOne, inputTwo), 40);
    }

    @Test
    public void scoresSpecialTestThree() {
        int[] inputOne = new int[]{12, 11, 4};
        int[] inputTwo = new int[]{2, 20, 31};
        Assert.assertEquals(ScoresSpecialSolution.scoresSpecial(inputOne, inputTwo), 20);
    }
}