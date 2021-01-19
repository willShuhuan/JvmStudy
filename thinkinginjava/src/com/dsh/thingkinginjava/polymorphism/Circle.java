package com.dsh.thingkinginjava.polymorphism;

/**
 * @author dongshuhuan
 * date 2019/6/24
 * version
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("circle draw");
    }

    @Override public void erase() {
        System.out.println("circle earse");
    }
     public void drawCircle() {
        System.out.println("circle drawCircle");
    }
}
