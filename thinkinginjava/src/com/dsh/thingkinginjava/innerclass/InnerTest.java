package com.dsh.thingkinginjava.innerclass;

/**
 * @author dongshuhuan
 * date 2019/7/17
 * version
 */
public class InnerTest {
    int count = 0;
    int counter(){
        System.out.println("InnerTest");
        //return count ++;//先取值 在运算 0 1 2 3 4
        return ++count ;//先运算，再取值 1 2 3 4 5
    }

    public static void main(String[] args) {
        InnerTest it = new InnerTest();
        for (int i = 0; i < 5; i++) {
            System.out.println(it.counter());
        }

    }

}
