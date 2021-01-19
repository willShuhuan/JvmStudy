package com.dsh.thingkinginjava.interfaces.nestinginterface;

/**
 * @author dongshuhuan
 * date 2019/7/9
 * version
 */
public class AImpl implements A.Ainterface,A.Ainterface.innerInterface{
    //类中嵌套接口可以直接调用A.Ainterface
    //不能调用A.B 因为B是私有接口
    @Override public void f() {

    }

    @Override public void g() {
        //可以调用接口内的接口
        A a = new A();
        a.getB().u();//无法访问接口的成员
        A a2 = new A();
        a2.receiveB(a.getB());//只用另外一个A可以对getB做任何事情
    }
}
