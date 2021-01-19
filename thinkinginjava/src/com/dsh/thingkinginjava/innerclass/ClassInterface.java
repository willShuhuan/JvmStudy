package com.dsh.thingkinginjava.innerclass;

/**接口内部类
 * @author dongshuhuan
 * date 2019/7/16
 * version
 */
public interface ClassInterface {
    void howDy();
    //接口中的类自动是public 和 static的
    class Test implements ClassInterface{
        @Override public void howDy() {
            System.out.println("howDy");
        }

        public static void main(String[] args) {
            new Test().howDy();
        }
    }
}
