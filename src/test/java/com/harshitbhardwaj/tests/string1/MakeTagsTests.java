package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.MakeTagsSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MakeTagsTests {

    /*
    makeTags("i", "Yay") → "<i>Yay</i>"
    makeTags("i", "Hello") → "<i>Hello</i>"
    makeTags("cite", "Yay") → "<cite>Yay</cite>"
    */

    @Test
    public void makeTagsTestOne() {
        Assert.assertEquals(MakeTagsSolution.makeTags("i", "Yay"), "<i>Yay</i>");
    }

    @Test
    public void makeTagsTestTwo() {
        Assert.assertEquals(MakeTagsSolution.makeTags("i", "Hello"), "<i>Hello</i>");
    }

    @Test
    public void makeTagsTestThree() {
        Assert.assertEquals(MakeTagsSolution.makeTags("cite", "Yay"), "<cite>Yay</cite>");
    }
}