package com.dsh.thingkinginjava.polymorphism;

/** Thinking in java 第八章
 * 多态部分代码
 * @author dongshuhuan
 * date 2019/6/24
 * version
 */
public class PolyMain {
    public static void main(String[] args){
        //向上转型
        Shapes.main(null);
        //域与静态方法
        FieldAccess.main(null);
        //构造器和多态
        PolyConstructors.main(null);
        //向上转型与向下转型
        RTTI.main(null);
    }
}
