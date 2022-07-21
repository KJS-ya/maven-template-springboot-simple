package org.example.file;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        String fileName = "D:"+ File.separator+"filepackage";
        File file = new File(fileName);
        //file.mkdir();//创建

        //列出所有文件
        String[] str = file.list();
        for (int i = 0;i < str.length;i++){
            System.out.println(str[i]);
        }

        /**
         *
         */

        //使用file.listFiles();列出所有文件，包括隐藏文件。
        //使用file.isDirectory();判断指定路径是否是目录。
    }
}
