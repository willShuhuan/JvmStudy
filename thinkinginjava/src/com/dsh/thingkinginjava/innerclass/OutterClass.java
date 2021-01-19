package com.dsh.thingkinginjava.innerclass;

/**
 * @author dongshuhuan
 * date 2019/7/15
 * version
 */
public class OutterClass {
    class InnerClass{
        private int i ;
        public InnerClass(int j){
            i = j;
            System.out.println("i=="+i);
        }

    }

    public InnerClass getInner(){
        return new InnerClass(6);
    }

    public static void main(String[] args) {
        OutterClass outterClass = new OutterClass();
        outterClass.getInner();
    }
}
