package com.dsh.thingkinginjava.interfaces.factory;

/**接口在工厂模式中的运用
 * @author dongshuhuan
 * date 2019/7/9
 * version
 */
public class Factories {
    public static void main(String[] args) {
        ServiceFactory s1 = new Implemention1Factory();
        ServiceFactory s2 = new Implemention2Factory();
        serviceCousumer(s1);
        serviceCousumer(s2);
    }

    public static void serviceCousumer(ServiceFactory serviceFactory) {
        Servcie servcie=serviceFactory.getService();
        servcie.method1();
        servcie.method2();
    }
}
