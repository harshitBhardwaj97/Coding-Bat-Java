package com.harshitbhardwaj.tests.functional1;

import com.harshitbhardwaj.solutions.functional1.Copies3Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Copies3Tests {

   /*
   copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
   copies3(["24", "a", ""]) → ["242424", "aaa", ""]
   copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
   */

    @Test
    public void copies3TestOne() {
        List<String> input = List.of("a", "bb", "ccc");
        List<String> expected = List.of("aaa", "bbbbbb", "ccccccccc");
        Assert.assertEquals(Copies3Solution.copies3(input), expected);
    }

    @Test
    public void copies3TestTwo() {
        List<String> input = List.of("24", "a", "");
        List<String> expected = List.of("242424", "aaa", "");
        Assert.assertEquals(Copies3Solution.copies3(input), expected);
    }

    @Test
    public void copies3TestThree() {
        List<String> input = List.of("hello", "there");
        List<String> expected = List.of("hellohellohello", "theretherethere");
        Assert.assertEquals(Copies3Solution.copies3(input), expected);
    }
}