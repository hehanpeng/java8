package com.tanlan.java8s4.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DataInputStreamDemo {

	public static void main(String[] args) throws Exception {
		DataInputStream dis=new DataInputStream(new FileInputStream("f4.laotan"));
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		System.out.println(dis.readUTF());
	}

}
