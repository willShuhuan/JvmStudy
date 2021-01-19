package com.dsh.thingkinginjava.innerclass;

/**局部内部类
 * @author dongshuhuan
 * date 2019/7/16
 * version
 */
public class LocalInnerClass {

    interface Destination {
        String readLabel();
    }

    public Destination destination(String s){
        //局部内部类
        class PDestination implements Destination{
            private String label;
            private PDestination(String s){
                label = s;
            }
            @Override public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Destination innerD= lic.destination("hangzhou");
        System.out.println("inner label=="+innerD.readLabel());
        lic.track();
    }


    /*在作用域中嵌入一个内部类*/
    private void internalTracking(boolean b){
        if (b){
            class TrackingSlip{
                private String id;
                TrackingSlip(String Id){
                    id = Id;
                }
                String getSlip(){
                    return id;
                }
            }
            TrackingSlip ts = new TrackingSlip("6666");
            System.out.println("TrackingSlip id =="+ts.getSlip());

        }
        //不能这样写，因为它定义在作用域之外，方法内的外部类不是外围类的一部分
        //TrackingSlip ts = new TrackingSlip("6666");
    }

    public void track(){
        internalTracking(true);
    }


}
