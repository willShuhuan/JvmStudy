package com.dsh.thingkinginjava.annotation;


import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author dongshuhuan
 * date 2020-01-20
 * 注解的定义看起来很像接口的定义，事实上，与其他任何java接口一样，注解也会编译成class文件
 * Target Retention Documented Inherited 这四种是元注解 负责注解其他的注解
 */
@Target(ElementType.METHOD)//约束 只能用于该类型
@Retention(RetentionPolicy.RUNTIME)//
public @interface UseCase {
    String value() default "";
    public int id() default -1;
    public String description() default "no description";
}
