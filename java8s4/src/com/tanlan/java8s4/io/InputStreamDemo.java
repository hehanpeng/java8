package com.tanlan.java8s4.io;

import java.io.FileInputStream;

/*
* 表示数据源：文件，网络连接
* 使用该数据源构建输入流
* 从输入流中读取数据：通常使用循环
* 关闭输入流：可以使用try-with-resources
* */
public class InputStreamDemo {

    public static void main(String[] args) {
        //会自动关闭输入流
        try (FileInputStream fis = new FileInputStream("f2.txt")) {
            byte byteData;
            while ((byteData = (byte) fis.read()) != -1) {
                System.out.println((char) byteData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
