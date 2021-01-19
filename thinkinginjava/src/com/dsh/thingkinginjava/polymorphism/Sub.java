package com.dsh.thingkinginjava.polymorphism;

/**
 * @author dongshuhuan
 * date 2019/6/24
 * version
 */
public class Sub extends Super {
    public int field = 1;
    @Override
    public int getField(){
        return field;
    }
    public int geytSuperField(){
        return super.field;
    }
}
