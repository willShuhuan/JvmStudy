package com.dsh.thingkinginjava.innerclass;

/** 嵌套类
 * @author dongshuhuan
 * date 2019/7/16
 * version
 */
public class NestedInnerClass {
    private static class  PContents implements Contents{
        private int i = 11;

        @Override public int value() {
            return i;
        }
    }


    protected static class PDestination implements Destination{
        String label;

        @Override public String readLabel() {
            return label;
        }
        private PDestination(String where){
            this.label = where;
        }

        public static void f(){

        }
        static int x = 10;
        //嵌套类可以包含嵌套类和static数据及字段，但是普通内部类不可以
        static class AnnotherLevel{
            void f(){

            }
            static int x = 10;
        }

        AnnotherLevel getLevel(){
            return new AnnotherLevel(){
                @Override void f() {
                    System.out.println("嵌套类可真神奇啊"+x);
                }
            };
        }
    }

    public static Destination destination(String s){
        return new PDestination(s);
    }

    public static Contents contents(){
        return new PContents();
    }

    public static void main(String[] args) {
        Contents c = contents();
        PDestination d = (PDestination) destination("shanghai");
        PDestination.AnnotherLevel level = d.getLevel();
        level.f();

    }

}
