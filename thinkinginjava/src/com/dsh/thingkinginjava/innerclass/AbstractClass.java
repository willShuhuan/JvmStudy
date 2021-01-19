package com.dsh.thingkinginjava.innerclass;

import static com.dsh.thingkinginjava.innerclass.ClassD.*;

/**
 * @author dongshuhuan
 * date 2019/7/17
 * version
 */
abstract class AbstractClass {
//public class AbstractClass extends ClassD.E{ 这样写也是不可以的

    //内部类不能继承 外部类内部的内部具体类或者内部抽象类
    //只有ClassD的内部类才能继承具体类或抽象类
    //class innerD extends ClassD.E{
    //}
    //class innerF extends ClassD.F{
    //}

    abstract void abstractF();

    //可以实现外部类的内部接口
    class innerC implements InnerClassUpcast.Destination{

        @Override public String readLabel() {
            return null;
        }
    }
}
