package com.dsh.jvm.runtimedata;

/**
 * 动态链接
 */
public class DynamicLinkingTest {
    int number = 10;
    public void methodA(){
        System.out.println("methodA()");
    }
    public void methodB(){
        System.out.println("methodB()");
        methodA();
        number++;
    }
}
