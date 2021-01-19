package com.dsh.thingkinginjava.innerclass;

import java.util.ArrayList;
import java.util.List;


/** 为什么需要内部类
 * @author dongshuhuan
 * date 2019/7/17
 * version
 */
public class ClassD {


    //内部类的继承
    class InheritClass extends DotThis.inner2{
        InheritClass(DotThis dt){
            //必须提供外部类的引用
            //想要继承，必须使用 xxx.super()
            dt.super();
        }
    }

    interface DContents{
        int value();
    }

    abstract class E{}
    class F extends ClassD{
        E makeE(){
            return new E() {};
        }

        AbstractClass makeA(){
            return new AbstractClass() {
                @Override void abstractF() {
                    System.out.println("makeA");
                }
            };
        }
    }

    //ClassD拥有了抽象类E或者具体类F，E或F只有ClassD的内部类才可以继承他们，从而实现多继承
    //内部类使得java多重继承的解决方案变得完整
    class EImpl extends E{

    }

    //内部类只能继承自己外围类的具体类或抽象类成员
    class I implements Contents{
        @Override public int value() {
            //闭包,只有在内部类的方法内可以这样写
            ClassD.this.method();
            return 0;
        }
    }

    //内部类集成外部抽象类
    class G extends AbstractClass{

        @Override void abstractF() {
        }
    }
    //内部类继承外部接口
    class H implements Contents{

        @Override public int value() {
            return 0;
        }
    }

    void method(){
        List<ClassD> clazz = new ArrayList<>();
        clazz.add(this);
        ClassD cl = this;

        System.out.println("call method");
    }

    public static void main(String[] args) {

    }

}
