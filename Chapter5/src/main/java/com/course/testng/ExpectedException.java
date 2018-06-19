package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {

    @Test(expectedExceptions=RuntimeException.class)
    public void runtimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runtimeExceptionSuccess(){
        System.out.println("这是成功的异常测试");
        throw new RuntimeException();
    }
}
