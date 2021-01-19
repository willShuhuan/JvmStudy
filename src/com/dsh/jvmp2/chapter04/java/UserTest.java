package com.dsh.jvmp2.chapter04.java;

/**
 * @author shkstart
 * @create 10:36
 */
public class UserTest {
    public static void main(String[] args) {
        User user = new User(); //隐式加载
        try {
            Class clazz = Class.forName("com.dsh.jvmp2.chapter04.java.User"); //显式加载
            ClassLoader.getSystemClassLoader().loadClass("com.dsh.jvmp2.chapter04.java.User");//显式加载
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
