package com.harshitbhardwaj.tests.ap1;

import com.harshitbhardwaj.solutions.ap1.MergeTwoSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MergeTwoTests {
    
   /*
   mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]
   mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]
   mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]
   */

    @Test
    public void mergeTwoTestOne() {
        String[] a = new String[]{"a", "c", "z"};
        String[] b = new String[]{"b", "f", "z"};
        String[] expected = new String[]{"a", "b", "c"};
        Assert.assertEquals(MergeTwoSolution.mergeTwo(a, b, 3), expected);
    }

    @Test
    public void mergeTwoTestTwo() {
        String[] a = new String[]{"a", "c", "z"};
        String[] b = new String[]{"c", "f", "z"};
        String[] expected = new String[]{"a", "c", "f"};
        Assert.assertEquals(MergeTwoSolution.mergeTwo(a, b, 3), expected);
    }

    @Test
    public void mergeTwoTestThree() {
        String[] a = new String[]{"f", "g", "z"};
        String[] b = new String[]{"c", "f", "g"};
        String[] expected = new String[]{"c", "f", "g"};
        Assert.assertEquals(MergeTwoSolution.mergeTwo(a, b, 3), expected);
    }
}