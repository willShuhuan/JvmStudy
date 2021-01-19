package com.dsh.thingkinginjava.polymorphism;

import java.util.Random;

/**
 * @author dongshuhuan
 * date 2019/6/24
 * version
 */
public class RandomShapeGenerator {
    private Random rand = new Random(47);
    public Shape next(){
        switch (rand.nextInt(3)){
            default:
                System.out.println("rand"+rand.nextInt());
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }
}
