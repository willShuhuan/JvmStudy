package com.dsh.thingkinginjava.io;

import java.io.File;

/**
 * @author dongshuhuan
 * date 2020-01-21
 * version
 */
public class MakeDirectories {
    private static void fileData(File file){
        System.out.println(
                "Absolute path:" + file.getAbsolutePath()
                +"\n can read" + file.canRead()
                +"\n can write" + file.canWrite()
                +"\n getName" + file.getName()
                +"\n getParent" + file.getParent()
                +"\n getPath" + file.getPath()
                +"\n length" + file.length()
                +"\n lastModified" + file.lastModified()
        );
        if (file.isFile()){
            System.out.println("It's a file");
        }else if (file.isDirectory()){
            System.out.println("It's a directory");
        }
    }
}
