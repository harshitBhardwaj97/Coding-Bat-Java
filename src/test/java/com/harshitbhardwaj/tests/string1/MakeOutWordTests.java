package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.MakeOutWordSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MakeOutWordTests {

    /*
    makeOutWord("<<>>", "Yay") → "<<Yay>>"
    makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
    makeOutWord("[[]]", "word") → "[[word]]"
    */

    @Test
    public void makeOutWordTestOne() {
        Assert.assertEquals(MakeOutWordSolution.makeOutWord("<<>>", "Yay"),
                "<<Yay>>");
    }

    @Test
    public void makeOutWordTestTwo() {
        Assert.assertEquals(MakeOutWordSolution.makeOutWord("<<>>", "WooHoo"),
                "<<WooHoo>>");
    }

    @Test
    public void makeOutWordTestThree() {
        Assert.assertEquals(MakeOutWordSolution.makeOutWord("[[]]", "word"),
                "[[word]]");
    }
}