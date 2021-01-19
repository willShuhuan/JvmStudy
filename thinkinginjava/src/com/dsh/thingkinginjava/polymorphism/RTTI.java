package com.dsh.thingkinginjava.polymorphism;

/**
 * 向上转型与向下转型
 * @author dongshuhuan
 * date 2019/6/24
 * version
 * RTTI 运行时类型识别缩写
 */
public class RTTI {

    public static void main(String[] args){
        Useful[] u = {new Useful(),new MoreUseful()};
        u[0].f();
        u[1].g();
        System.out.println(u[0].filed);
        System.out.println(u[1].filed);//域访问不能多态，所以打印出来的不是MoreUseful
        ((MoreUseful)u[1]).x();//向下转型，可以调用导出类方法x();
        //((MoreUseful)u[0]).x();//无法向下转型，抛出ClassCastException编译时出错信息

        System.out.println("-----------------------");
        /**
         * 向上类型转换：
         * 语法规则：<父类型> <引用变量名> = new <子类型>();
         * 1.此时通过父类引用变量调用的方法是子类覆盖或继承
         * 父类的方法，不是父类的方法。
         * 2.此时通过父类引用变量无法调用子类特有的方法。
         */
        Useful uu = new MoreUseful();//父类声明uu指向子类对象，向上转型，继承关系是向上的
        uu.f();
        uu.g();
        //uu.x();//向上转型后父类引用不能调用子类自己的方法
        ((MoreUseful) uu).x();//需要转换成子类才可以调用子类的方法

        System.out.println("-----------------------");
        /**
         * 向下类型转换
         * 向下转型的前提是先向上转型，保证安全
         * uf指向子类对象，所以子类的实例muf也能够指向uf
         */
        Useful uf =  new MoreUseful();//向上转型
        uf.f();
        MoreUseful muf = (MoreUseful)uf;//向下转型，编译和执行皆不会出错
        muf.f();
        muf.x();

        //向下转型-错误示范
        //uf2指向父类对象，子类的实例muf2不能指向父类uf2
        Useful uf2 = new Useful();
        MoreUseful muf2 = (MoreUseful) uf2;//不安全的，编译无措但是执行会出错
        muf2.f();
        muf2.x();

        System.out.println("-----------------------");
        //为了类型安全转换，用 instanceof 判断一下
        Useful uf3 = new Useful();
        if (uf3 instanceof MoreUseful){
            System.out.println("可以向下转型");
            MoreUseful muf3 = (MoreUseful) uf3;//不安全的，编译无措但是执行会出错
            muf3.f();
            muf3.x();
        }else {
            System.out.println("不能向下转型");
        }



    }
}
