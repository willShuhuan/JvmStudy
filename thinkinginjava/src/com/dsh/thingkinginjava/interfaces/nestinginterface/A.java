package com.dsh.thingkinginjava.interfaces.nestinginterface;

/**
 * @author dongshuhuan
 * date 2019/7/9
 * version
 */
public class A {

    interface Ainterface{
        void f();
        //接口可以嵌套接口
        interface innerInterface{
            void g();
        }
    }

    private interface B{
        void u();
    }

    public class BImpl implements B{

        @Override public void u() {

        }
    }

    public BImpl getB(){
        return new BImpl();
    }

    private B bref;
    public void receiveB(B b){
        bref = b;
        bref.u();
    }
}
