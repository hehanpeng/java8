package com.tanlan.java8s4.io;

import java.io.FileOutputStream;

public class OutputStreamDemo {

    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("f3.txt")) {
            fos.write("hello".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
