package org.example.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("D:\\file.txt");
        try {
            file.createNewFile();
            System.out.println(File.pathSeparator);  //路径分隔符
            System.out.println(File.separator);      //与系统有关的路径名称分隔符
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
