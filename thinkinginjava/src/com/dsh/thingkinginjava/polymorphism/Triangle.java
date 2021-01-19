package com.dsh.thingkinginjava.polymorphism;

/**
 * @author dongshuhuan
 * date 2019/6/24
 * version
 */
public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle draw");
    }

    @Override public void erase() {
        System.out.println("Triangle earse");
    }
}
