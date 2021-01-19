package com.dsh.thingkinginjava.interfaces.example2;

/**
 * @author dongshuhuan
 * date 2019/7/5
 * version
 */
public class Adventure {

    public static void main(String[] args) {
        Hero h = new Hero();
        swim(h);
        fly(h);
        //fight(h);
        action(h);
    }

    private static void swim(CanSwim h) {
        h.swim();
    }
    private static void fly(CanFly h) {
        h.fly();
    }
    private static void fight(CanFight h) {
        h.fight();
    }
    private static void action(ActionCharacter h) {
        h.fight();
    }
}
