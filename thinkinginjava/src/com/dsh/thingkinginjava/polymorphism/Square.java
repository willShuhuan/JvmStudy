package com.dsh.thingkinginjava.polymorphism;

/**
 * @author dongshuhuan
 * date 2019/6/24
 * version
 */
public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square draw");
    }

    @Override public void erase() {
        System.out.println("Square earse");
    }
}
