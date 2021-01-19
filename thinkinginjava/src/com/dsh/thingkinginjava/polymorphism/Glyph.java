package com.dsh.thingkinginjava.polymorphism;

/**
 * @author dongshuhuan
 * date 2019/6/24
 * version
 */
public class Glyph {
    Glyph(){
        System.out.println("Glyph before draw");
        draw();
        System.out.println("Glyph after draw");
    }

     void draw() {
        System.out.println("Glyph draw");
    }
}
