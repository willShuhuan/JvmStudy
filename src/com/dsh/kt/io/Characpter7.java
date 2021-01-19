package com.dsh.kt.io;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dongshuhuan
 * date 2020/11/14
 * version
 */
class Characpter7 {
    public static void main(String[] args) {

//        Field filed = null;
//        filed.getType();
//        filed.getGenericType();
//        Method method = null;
//        method.getGenericReturnType();
//        method.getGenericParameterTypes();

        Test test = new Test<>();
        test.setList(new ArrayList<Fruit>());
        test.setList2(new ArrayList<Fruit.Apple>());
        try {
            Field field1 = test.getClass().getDeclaredField("list");
            Field field2 = test.getClass().getDeclaredField("list2");
            System.out.println(field1.getGenericType());//java.util.List<T>，无法获取到泛型的类型
            System.out.println(field2.getGenericType());//java.util.List<T>，无法获取到泛型的类型

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
