package com.dsh.jvm.runtimedata;

/**
 * 虚拟机栈
 */
public class StackTest {

    public static void main(String[] args) {
        StackTest test = new StackTest();
        test.methodA();
    }

    public void methodA(){
        int i = 10;
        int j = 20;
        methodB();
    }

    public void methodB(){
        int k = 30;
        int m = 40;
    }

}
