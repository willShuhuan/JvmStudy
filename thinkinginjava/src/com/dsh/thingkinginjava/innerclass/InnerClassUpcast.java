package com.dsh.thingkinginjava.innerclass;

/**内部类与向上转型
 * @author dongshuhuan
 * date 2019/7/15
 * version
 */
public class InnerClassUpcast {
    interface Destination{
        String readLabel();
    }
    interface Contents{
        int value();
    }

    private class PContents implements Contents{
        int i = 11;
        @Override public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination{
        private String label;
        @Override public String readLabel() {
            return label;
        }
        private PDestination(String where){
            this.label = where;
        }
    }

    public Contents getContent(){
        return new PContents();
    }

    public Destination getDestination(String s){
        return new PDestination(s);
    }

    public static void main(String[] args) {
        InnerClassUpcast inc = new InnerClassUpcast();
        Contents c = inc.getContent();
        Destination d = inc.getDestination("Shanghai");
    }

}
