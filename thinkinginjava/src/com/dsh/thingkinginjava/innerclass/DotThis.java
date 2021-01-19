package com.dsh.thingkinginjava.innerclass;

/**使用.this和.new
 * @author dongshuhuan
 * date 2019/7/15
 * version
 */
public class DotThis {
    void f(){
        System.out.println("DotThis.f()");
    }
    public class Inner{

        public DotThis outer(){
            return DotThis.this;
        }

        public void mainMethod() {
            System.out.println("Inner.main()");
        }

        public void mainMethod2() {
            System.out.println("Inner.main2()");
        }
    }

    class inner2{}

    public Inner getInner(){
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dotThis = new DotThis();
        dotThis.f();
        //获得内部类的实例 方法一
        Inner dotThisInner= dotThis.getInner();
        dotThisInner.mainMethod();
        dotThisInner.outer().f();//内部类调用外部类方法
        //方法二
        Inner inner= new DotThis().new Inner();
        inner.mainMethod();
        //方法三
        DotThis dot = new DotThis();
        Inner inner2= dot.new Inner();
        inner2.mainMethod2();

    }

}
