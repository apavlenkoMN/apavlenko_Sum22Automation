package com.provectus.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestEx {

    @Parameters({"par1", "par2", "par3"})
    @Test

    public void testExample(String p1, String p2, String p3){
        System.out.println("I'm a test");

        System.out.println(p1 + "par1 was, and par2 is " + p2);
        System.out.println(p3);
    }
}
