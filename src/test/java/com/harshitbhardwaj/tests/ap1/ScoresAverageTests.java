package com.harshitbhardwaj.tests.ap1;

import com.harshitbhardwaj.solutions.ap1.ScoresAverageSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScoresAverageTests {
    
   /*
   scoresAverage([2, 2, 4, 4]) → 4
   scoresAverage([4, 4, 4, 2, 2, 2]) → 4
   scoresAverage([3 ,4, 5, 1, 2, 3]) → 4
   */

    @Test
    public void scoresAverageTestOne() {
        int[] input = new int[]{2, 2, 4, 4};
        Assert.assertEquals(ScoresAverageSolution.scoresAverage(input), 4);
    }

    @Test
    public void scoresAverageTestTwo() {
        int[] input = new int[]{4, 4, 4, 2, 2, 2};
        Assert.assertEquals(ScoresAverageSolution.scoresAverage(input), 4);
    }

    @Test
    public void scoresAverageTestThree() {
        int[] input = new int[]{3, 4, 5, 1, 2, 3};
        Assert.assertEquals(ScoresAverageSolution.scoresAverage(input), 4);
    }
}