package com.dsh.thingkinginjava.interfaces.examples;

/**
 * @author dongshuhuan
 * date 2019/7/5
 * version
 */
public class Apply {
    public static void process(Processor processor,Object s){
        System.out.println("Using processor "+processor.name());
        System.out.println(processor.process(s));
    }
}
