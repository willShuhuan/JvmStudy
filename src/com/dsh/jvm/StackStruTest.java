package com.dsh.jvm;

/**
 * 指令集
 */
public class StackStruTest {

    public static final String s = "sss";

    public static void main(String[] args) throws InterruptedException {
        int i = 2;
        int j = 3;
        int k = i+j;
        Thread.sleep(6000);
        System.out.println("hello");

    }
}
