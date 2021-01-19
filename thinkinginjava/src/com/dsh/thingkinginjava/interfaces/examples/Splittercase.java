package com.dsh.thingkinginjava.interfaces.examples;

import java.util.Arrays;

/**
 * @author dongshuhuan
 * date 2019/7/5
 * version
 */
public class Splittercase extends StringProcessor {
    @Override public String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}
