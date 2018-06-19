package com.course.testng;


import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分

    @Test
    public void testCase1(){
        System.out.println("这是测试用例");
        System.out.printf("Thread ID: %s%n",Thread.currentThread().getId());
    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
        System.out.printf("Thread ID: %s%n",Thread.currentThread().getId());
    }

    @BeforeMethod
    public void beforeTest(){
        System.out.println("用例前发生的");
    }

    @AfterMethod
    public void afterTest() {
        System.out.println("用例后发生的");

    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("classbefore整个类之前");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("classafter整个类之后");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("这是BeforeSuite套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("这是AfterSuit套件");
    }

}
