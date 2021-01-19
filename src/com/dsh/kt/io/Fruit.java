package com.dsh.kt.io;

/**
 * @author DSH
 * @date 2020/11/14
 * @description
 */
public class Fruit {

    class Apple extends Fruit {
    }

    public static void main(String[] args) {

        String s = "sssssdasfsasafa/abcd.jpg";
        int end = s.lastIndexOf(".");
        String title = s.substring(s.lastIndexOf("/") + 1,end);
        System.out.println(title);
    }
}
