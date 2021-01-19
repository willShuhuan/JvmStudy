package com.dsh.thingkinginjava.interfaces.example3;

/**
 * @author dongshuhuan
 * date 2019/7/9
 * version
 */
public interface Vampire extends DangerousMonster,Lethal {
    //接口可以多继承
    void drinkBlood();
}
