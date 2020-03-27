package com.dsh.jvm.runtimedata.method;

/**
 * 体会invokeDynamic指令
 */
public class Lambda {

    public void lambda(Func func){
        return;
    }

    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        Func func = s -> {
            return true;
        };

        lambda.lambda(func);
        lambda.lambda(s ->{
            return true;
        });
    }

}

@FunctionalInterface
interface Func{
    public boolean func(String str);
}
