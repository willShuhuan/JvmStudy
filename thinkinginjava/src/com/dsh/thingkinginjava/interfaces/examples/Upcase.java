package com.dsh.thingkinginjava.interfaces.examples;

/**
 * @author dongshuhuan
 * date 2019/7/5
 * version
 */
public class Upcase extends StringProcessor {
    @Override public String process(Object input) {
        return ((String)input).toUpperCase();
    }
}
