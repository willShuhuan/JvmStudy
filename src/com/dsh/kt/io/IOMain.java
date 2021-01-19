package com.dsh.kt.io;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author DSH
 * @date 2020/11/11
 * @description
 */
public class IOMain {
    public static void main(String[] args) {
//        writeIO();
//        readIO();
//        stringIO();
//        bosIO();
//        fileCopy();//文件拷贝
//        socketIO();//客户端socketIO
        serverSocketIO();
    }



    //写
    private static void writeIO() {
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("text.txt");
            outputStream.write('a');
            outputStream.write('b');
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //字符读取
    private static void readIO() {
        InputStream inputStream = null;
        try{
            inputStream = new FileInputStream("text.txt");
            char content = (char) inputStream.read();
            char content2 = (char) inputStream.read();
            System.out.println(content);//a
            System.out.println(content2);//b
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //字符串读取
    private static void stringIO() {
        //这样写流将自动关闭
        try( InputStream inputStream = new FileInputStream("text.txt");
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader)){
//            FileReader reader = new FileReader("text.txt");
            System.out.println(bufferedReader.readLine());//ab
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void bosIO() {
        try( OutputStream os = new FileOutputStream("text.txt");
             BufferedOutputStream bos = new BufferedOutputStream(os)){
             bos.write('c');
             bos.write('d');
             //如果bos不在try的括号内，需要手动冲一下
//             bos.flush();//或 bos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //文件拷贝
    public static void fileCopy(){
        try (InputStream is = new FileInputStream("text.txt");
              OutputStream os = new FileOutputStream("text_copy.txt")){
            //笨方法 一个一个地写入
//            os.write(is.read());
            byte[] data = new byte[1024];
            int readCount ;
            while ((readCount = is.read(data))!=-1){
                os.write(data,0,readCount);
            }

            //性能优化,BufferedXXX给流加上缓冲,减少交互频率
//            InputStream is2 = new BufferedInputStream(new FileInputStream("text.txt"));
//            OutputStream os2 = new BufferedOutputStream(new FileOutputStream("text_copy.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //socket请求方式
    public static void socketIO(){
        try {
            Socket socket = new Socket("hencoder.com",80);
            OutputStream os = socket.getOutputStream();//发送请求报文
            InputStream is = socket.getInputStream();//接收响应报文
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os));
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            writer.write("GET / HTTP/1.1\n"+
                    "Host: www.example.com\n\n");
            writer.flush();
            String message;
            while ((message = reader.readLine())!=null){
                System.out.println(message);//整个http的响应报文
            }
            System.out.println(reader.readLine());//HTTP/1.1 200 OK
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //serverSocket
    public static void serverSocketIO(){
        try (ServerSocket serverSocket = new ServerSocket(100);
                Socket socket = serverSocket.accept();
                OutputStream os = socket.getOutputStream();//发送请求报文
                InputStream is = socket.getInputStream();//接收响应报文
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os));
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                ){
            writer.write("HTTP/1.1 200 OK\n" +
                    "Date: Mon, 23 May 2005 22:38:34 GMT\n" +
                    "Content-Type: text/html; charset=UTF-8\n" +
                    "Content-Length: 138\n" +
                    "Last-Modified: Wed, 08 Jan 2003 23:11:55 GMT\n" +
                    "Server: Apache/1.3.3.7 (Unix) (Red-Hat/Linux)\n" +
                    "ETag: \"3f80f-1b6-3e1cb03b\"\n" +
                    "Accept-Ranges: bytes\n" +
                    "Connection: close\n" +
                    "\n" +
                    "<html>\n" +
                    "  <head>\n" +
                    "    <title>An Example Page</title>\n" +
                    "  </head>\n" +
                    "  <body>\n" +
                    "    <p>Hello World, this is a very simple HTML document.</p>\n" +
                    "  </body>\n" +
                    "</html>\n\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
