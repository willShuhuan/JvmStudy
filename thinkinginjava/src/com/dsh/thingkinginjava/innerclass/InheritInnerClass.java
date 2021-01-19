package com.dsh.thingkinginjava.innerclass;

/**内部类的继承
 * @author dongshuhuan
 * date 2019/7/17
 * version
 */
//public class InheritInnerClass extends WithInner.Inner {
//    InheritInnerClass(WithInner withInner) {
//        //想要继承，必须使用 xxx.super()
//        //这样才能提供必要的引用，程序才能编译通过
//        withInner.super();
//    }
//
//    public static void main(String[] args) {
//        WithInner wi = new WithInner();
//        InheritInnerClass ii = new InheritInnerClass(wi);
//    }
//}


/**
 * 内部类的覆盖,不覆盖
  */
//public class InheritInnerClass extends WithInner {
//
//    //与WithInner内的Inner同名
//    class Inner{
//        Inner(){
//            System.out.println("InheritInnerClass.Inner");
//        }
//    }
//
//    public static void main(String[] args) {
//        new InheritInnerClass();
//        //输出了
//        // WithInner
//        //WithInner.Inner
//
//        //这说明当继承了外围类的时候，内部同名类并没有被覆盖；
//        // 这两个内部类是两国各完全独立的两个实体，各自在自己的命名空间内
//    }
//
//
//
//
//}

/**
 * 内部类的覆盖，内部类明确继承可以覆盖
 */
public class InheritInnerClass extends WithInner {
    class Inner extends WithInner.Inner {
        Inner(){
            System.out.println("InheritInnerClass.Inner");
        }
        @Override void f() {
            System.out.println("InheritInnerClass.Inner.f()");
        }
    }

    public InheritInnerClass(){
        insertInner(new Inner());
    }

    public static void main(String[] args) {
        WithInner innerClass = new InheritInnerClass();
        //insert方法允许InheritInnerClass将自己的Inner对象向上转型为WithInner的引用inner
        //g调用inner.f时，覆盖后的新版f被执行了
        innerClass.g();
    }

}