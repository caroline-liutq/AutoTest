package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {

    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test1(){
        System.out.println(1);
        System.out.printf("Thread ID: %d%n",Thread.currentThread().getId());
    }
}
