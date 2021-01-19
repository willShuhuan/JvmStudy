package com.dsh.thingkinginjava.interfaces;

/**
 * @author dongshuhuan
 * date 2019/7/5
 * version
 */
public interface Instrument {
    //接口名不声明public的话只具有包权限
    //方法名不管是否声明public都是public的
    int i=1;//接口中的域是隐式地static和final的
    void play();
    void adjust();
}
