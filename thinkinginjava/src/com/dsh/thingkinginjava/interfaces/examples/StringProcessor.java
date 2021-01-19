package com.dsh.thingkinginjava.interfaces.examples;

/**
 * @author dongshuhuan
 * date 2019/7/5
 * version
 */
public abstract class StringProcessor implements Processor {

    public static String s = "a b c d e";

    @Override public String name() {
        return getClass().getSimpleName();
    }
    @Override
    public abstract String process(Object input);

    public static void main(String[] args) {
        Apply.process(new Upcase(),s);
        Apply.process(new Lowercase(),s);
        Apply.process(new Splittercase(),s);
    }
}
