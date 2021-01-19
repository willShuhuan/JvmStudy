package com.dsh.kt.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.charset.Charset;

/**
 * @author DSH
 * @date 2020/11/11
 * @description
 */
public class NIOMain {
    public static void main(String[] args) {
//        nio1();//NIO
//        nio2();//非阻塞式NIO
        String s = "http://gusteau-test.oss-cn-hangzhou.aliyuncs.com/material/original/image/2020/11/12/gtbdvqXB_1605192368083.jpg";
        String s2 = "http://gusteau-test.oss-cn-hangzhou.aliyuncs.com/material/original/image/2020/11/12/gtbdvqXB_1605192368083.jpg?xxxx";

        if (s.length()>s2.length()){
            s = s.substring(0,s2.length());
        }
        if (s.length()<s2.length()){
            s2 = s2.substring(0,s.length());
        }

        System.out.println(s);
        System.out.println(s2);


    }

    //阻塞式
    private static void nio1() {
        try {
            RandomAccessFile file = new RandomAccessFile("text.txt","r");
            FileChannel channel = file.getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            channel.read(byteBuffer);
            //limit 和 position 可以用flip一句代码解决
//            byteBuffer.limit(byteBuffer.position());
//            byteBuffer.position(0);
            byteBuffer.flip();
            System.out.println(Charset.defaultCharset().decode(byteBuffer));
            byteBuffer.clear();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void nio2() {
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.bind(new InetSocketAddress(99));
            //非阻塞 start -> 以下代码为非阻塞配置代码
            serverSocketChannel.configureBlocking(false);//非阻塞
            Selector selector = Selector.open();
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
            while (true){
                selector.select();//阻塞
                for (SelectionKey key:selector.selectedKeys()) {
                    SocketChannel socketChannel = serverSocketChannel.accept();
                    ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                    while (socketChannel.read(byteBuffer)!=-1){
                        byteBuffer.flip();
                        socketChannel.write(byteBuffer);
                        byteBuffer.clear();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
