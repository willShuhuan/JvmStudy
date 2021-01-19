package com.dsh.thingkinginjava.polymorphism;


import static com.dsh.thingkinginjava.util.PrintUtil.print;

/**
 * @author dongshuhuan
 * date 2019/6/24
 * version
 */
public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    public static void main(String[]args){
        Shape s[] = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
            //System.out.println(s[i]);
            print(s[i]);
        }
        System.out.println("------------------");
        for (Shape shp : s){
            shp.draw();
        }
    }
}
