package com.harshitbhardwaj.tests.string1;

import com.harshitbhardwaj.solutions.string1.WithoutEnd2Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WithoutEnd2Tests {

    /*
    withoutEnd2("Hello") → "ell"
    withoutEnd2("abc") → "b"
    withoutEnd2("ab") → ""
    */

    @Test
    public void withoutEnd2TestOne() {
        Assert.assertEquals(WithoutEnd2Solution.withoutEnd2("Hello"), "ell");
    }

    @Test
    public void withoutEnd2TestTwo() {
        Assert.assertEquals(WithoutEnd2Solution.withoutEnd2("abc"), "b");
    }

    @Test
    public void withoutEnd2TestThree() {
        Assert.assertEquals(WithoutEnd2Solution.withoutEnd2("ab"), "");
    }
}