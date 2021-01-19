package com.dsh.thingkinginjava.innerclass;

/** 多层嵌套类中访问外部成员
 * @author dongshuhuan
 * date 2019/7/16
 * version
 */
public class MNA {
    private void f(){
        System.out.println("MNA.f()");
    }
    class A{
        public void g(){
            System.out.println("A.g()");
        }
        class B{
            public void h(){
                f();
                g();
                System.out.println("B.h()");
            }
        }
    }


    //一个内部类不管嵌套多少层，都可以透明地访问它所嵌入的外围类的所有成员
    public static void main(String[] args) {
        MNA mna = new MNA();
        //mna.f();
        A innerA = mna.new A();
        //innerA.g();
        A.B  AinnerB = innerA.new B();
        AinnerB.h();
    }
}
