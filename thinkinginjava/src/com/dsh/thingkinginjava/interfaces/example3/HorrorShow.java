package com.dsh.thingkinginjava.interfaces.example3;

/**
 * @author dongshuhuan
 * date 2019/7/9
 * version
 */
public class HorrorShow {
    static void u(Monster b){
        b.menace();
    }
    static void v(DangerousMonster d){
        d.destroy();
        d.menace();
    }

    static void w(Lethal l){
        l.kill();
    }

    public static void main(String[] args) {
        //接口 接口名 = new 实现类；
        DangerousMonster dm = new DragonZilla();
        u(dm);
        v(dm);
        Vampire vampire = new VeryBadVampire();
        v(vampire);
        u(vampire);
        w(vampire);
    }

}
