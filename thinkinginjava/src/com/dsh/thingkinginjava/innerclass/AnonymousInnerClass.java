package com.dsh.thingkinginjava.innerclass;

/**匿名内部类
 * @author dongshuhuan
 * date 2019/7/16
 * version
 */
public class AnonymousInnerClass {

    interface Contents{
        int value();
    }

    interface Travel{
        String readLable();
    }

    //-------------------------------------------------------------

    //匿名内部类简化写法
    public Contents contents(){
        return  new Contents() {
            int i = 100;
            @Override public int value() {

                return i;
            }
        };//这里需要分号
    }
    //简化赋值写法，参数x必须是final的
    public Contents contents(final int x){
        return  new Contents() {
            int i = x;
            @Override public int value() {
                return x;
            }
        };//这里需要分号
    }

    //-------------------------------------------------------------

    //这是匿名内部类的完整写法
    class MyContents implements Contents{
        int i = 200;
        @Override public int value() {
            return i;
        }
    }
    public Contents getContents(){
        return new MyContents();
    }

    //-------------------------------------------------------------

    //Wrapping是一个参数构造器的普通类，但它还是被其导出类当做公共'接口'来使用
    public Wrapping wrapping(int x){
        return new Wrapping(x){
            @Override public int value() {
                return super.value()*66;
            }
        };

    }

    //-------------------------------------------------------------

    //匿名内部类初始化,不要求i是final的，因为i是被传递给匿名内部类的基类构造器，不会在内部类中直接使用
    public Base getBase(int i){
        return new Base(i) {
            {System.out.println("Inside instance intiializer ");}
            @Override public void f() {
                System.out.println("In Anonymous f() ");
            }
        };
    }

    //-------------------------------------------------------------

    //实例初始化
    public Travel getTravel(final int price,final String where){
        return new Travel() {
            private int cost;
            {
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println("over budget!");
                }
            }
            @Override public String readLable() {
                return w;
            }
            private String w = where;

        };
    }


    //-------------------------------------------------------------

    public static void main(String[] args) {
        AnonymousInnerClass ac = new AnonymousInnerClass();
        ac.contents();
        ac.getContents();
        System.out.println(ac.wrapping(66).value());
        //Wrapping实例
        Wrapping w = new Wrapping(666);
        //相当于创建了一个Wrraping导出类实例（'接口实现类'）
        Wrapping wp = new Wrapping(888){
            @Override public int value() {
                return super.value();
            }
        };
        Base base = ac.getBase(110);
        base.f();
        ac.getTravel(199,"beijing");

    }

}
