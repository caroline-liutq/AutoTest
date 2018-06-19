package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest {

    @Test
    @Parameters({"name","age"})
    public void paratersTest1(String name,int age){
        System.out.println("name="+name+";age="+age);
    }
}
