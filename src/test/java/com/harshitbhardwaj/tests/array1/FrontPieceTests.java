package com.harshitbhardwaj.tests.array1;

import com.harshitbhardwaj.solutions.array1.FrontPieceSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FrontPieceTests {

    /*
    frontPiece([1,2,3]) → [1,2]
    frontPiece([1,2]) → [1,2]
    frontPiece([1]) → [1]
    */

    @Test
    public void frontPieceTestOne() {
        Assert.assertEquals(FrontPieceSolution.frontPiece(new int[]{1, 2, 3}), new int[]{1, 2});
    }

    @Test
    public void frontPieceTestTwo() {
        Assert.assertEquals(FrontPieceSolution.frontPiece(new int[]{1, 2}), new int[]{1, 2});
    }

    @Test
    public void frontPieceTestThree() {
        Assert.assertEquals(FrontPieceSolution.frontPiece(new int[]{1}), new int[]{1});
    }
}