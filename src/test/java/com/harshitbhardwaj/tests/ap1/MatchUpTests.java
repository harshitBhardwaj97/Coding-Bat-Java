package com.harshitbhardwaj.tests.ap1;

import com.harshitbhardwaj.solutions.ap1.MatchUpSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MatchUpTests {
    
   /*
   matchUp(["aa", "bb", "cc"], ["aaa", "xx", "bb"]) → 1
   matchUp(["aa", "bb", "cc"], ["aaa", "b", "bb"]) → 2
   matchUp(["aa", "bb", "cc"], ["", "", "ccc"]) → 1
   */

    @Test
    public void matchUpTestOne() {
        String[] inputOne = new String[]{"aa", "bb", "cc"};
        String[] inputTwo = new String[]{"aaa", "xx", "bb"};
        Assert.assertEquals(MatchUpSolution.matchUp(inputOne, inputTwo), 1);
    }

    @Test
    public void matchUpTestTwo() {
        String[] inputOne = new String[]{"aa", "bb", "cc"};
        String[] inputTwo = new String[]{"aaa", "b", "bb"};
        Assert.assertEquals(MatchUpSolution.matchUp(inputOne, inputTwo), 2);
    }

    @Test
    public void matchUpTestThree() {
        String[] inputOne = new String[]{"aa", "bb", "cc"};
        String[] inputTwo = new String[]{"", "", "ccc"};
        Assert.assertEquals(MatchUpSolution.matchUp(inputOne, inputTwo), 1);
    }
}