package com.dsh.jvm.runtimedata.heap.java2;


/**
 * @author DSH
 * @date 2020/5/28
 * @description
 */
public class ScalarTest {
    public static void main(String[] args) {
        alloc();
    }
    public static void alloc(){
        Point point = new Point(1,2);
    }
}
class Point{
    private int x;
    private int y;
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
}