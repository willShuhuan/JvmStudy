package com.dsh.thingkinginjava.innerclass;

/**
 * @author dongshuhuan
 * date 2019/7/16
 * version
 */
public class TestBad {
    public void f(){
        System.out.println("TestBad.f()");
    }
    public static class Tester{
        public static void main(String[] args) {
            TestBad tb = new TestBad();
            tb.f();
        }
    }
}
