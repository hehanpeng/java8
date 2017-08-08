package com.tanlan.java8s4.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DataOutputStreamDemo {

	public static void main(String[] args) throws Exception {
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("f4.laotan"));
		dos.writeInt(100);
		dos.writeDouble(12.34);
		dos.writeUTF("Hello");
		dos.close();
	}

}
