package com.harshitbhardwaj.tests.logic1;

import com.harshitbhardwaj.solutions.logic1.AnswerCellSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AnswerCellTests {
    
   /*
   answerCell(false, false, false) → true
   answerCell(false, false, true) → false
   answerCell(true, false, false) → false
   */

    @Test
    public void answerCellTestOne() {
        Assert.assertEquals(AnswerCellSolution.answerCell(false, false, false)
                , true);
    }

    @Test
    public void answerCellTestTwo() {
        Assert.assertEquals(AnswerCellSolution.answerCell(false, false, true)
                , false);
    }

    @Test
    public void answerCellTestThree() {
        Assert.assertEquals(AnswerCellSolution.answerCell(true, false, false)
                , false);
    }
}