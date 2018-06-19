package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "servce")
    public void test1(){
        System.out.println("这是servce组的方法1111");
    }

    @Test(groups = "servce")
    public void test2(){
        System.out.println("这是servce组的方法22222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("这是client组的方法3333");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("这是client组的方法4444");
    }

    @BeforeGroups("servce")
    public void beforeOnServces(){
        System.out.println("这是servce方法前运行的");
    }

    @AfterGroups("servce")
    public void afterOnServces(){
        System.out.println("这是servce方法后运行的");
    }
}
