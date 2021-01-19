package com.dsh.jvmp2.chapter01.java;

/**
 * @author shkstart
 * @create 2020-09-01 22:31
 */
public class IntegerTest {
    public static void main(String[] args) {

        Integer x = 5;
        int y = 5;
        System.out.println(x == y);//自动拆箱

        Integer i1 = 10;
        Integer i2 = 10;
        System.out.println(i1 == i2);//true

        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4);//false

    }
}
