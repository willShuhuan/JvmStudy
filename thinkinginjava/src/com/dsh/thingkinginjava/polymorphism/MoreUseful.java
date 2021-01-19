package com.dsh.thingkinginjava.polymorphism;

/**
 * @author dongshuhuan
 * date 2019/6/24
 * version
 */
public class MoreUseful extends Useful {
    public String filed = "MoreUseful";
    @Override void f() {
        super.f();
        System.out.println("MoreUseful f()");
    }

    @Override void g() {
        super.g();
        System.out.println("MoreUseful g()");
    }
    void x(){
        System.out.println("MoreUseful x()");
    }
    void y(){
        System.out.println("MoreUseful y()");
    }
    void z(){
        System.out.println("MoreUseful z()");
    }
}
