package com.dsh.thingkinginjava.innerclass;

/**
 * @author dongshuhuan
 * date 2019/7/17
 * version
 */
public class WithInner {
    Inner inner;
    class Inner{
        Inner(){
            System.out.println("WithInner.Inner");
        }
        void f(){
            System.out.println("WithInner.Inner.f()");
        }
    }
    //提供对外调用内部类f()的方法
    public void g(){
        inner.f();
    }

    public void insertInner(Inner i){
        inner = i;
    }

    WithInner(){
        System.out.println("WithInner");
        //inner = new Inner();
    }
}
