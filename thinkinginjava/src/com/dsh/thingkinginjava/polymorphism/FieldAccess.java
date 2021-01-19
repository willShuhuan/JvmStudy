package com.dsh.thingkinginjava.polymorphism;

/**
 * @author dongshuhuan
 * date 2019/6/24
 * version
 */
public class FieldAccess {
    public static void main(String[]args){
        Super sup = new Sub();
        System.out.println(sup.field+" =sup= "+sup.getField());
        Sub sub = new Sub();
        System.out.println(sub.field+"=sub="+sub.getField()+"=sub="+sub.geytSuperField());
    }
}
