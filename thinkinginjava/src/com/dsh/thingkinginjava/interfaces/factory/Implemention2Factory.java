package com.dsh.thingkinginjava.interfaces.factory;

/**
 * @author dongshuhuan
 * date 2019/7/9
 * version
 */
public class Implemention2Factory implements ServiceFactory {
    @Override public Servcie getService() {
        return new Implemention2();
    }
}
