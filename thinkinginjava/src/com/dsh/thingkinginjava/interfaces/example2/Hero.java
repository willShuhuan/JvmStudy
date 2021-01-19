package com.dsh.thingkinginjava.interfaces.example2;

/**
 * @author dongshuhuan
 * date 2019/7/5
 * version
 */
public class Hero extends ActionCharacter implements CanFight,CanFly,CanSwim{
    @Override public void fly() {
        System.out.println("hero fly");
    }

    @Override public void swim() {
        System.out.println("hero swim");
    }

    //接口和父类都有fight（）方法
    //优先父类而不是接口的fight
    @Override public void fight() {
        super.fight();
        System.out.println("hero fight");
    }
}
