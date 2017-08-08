package com.tanlan.java8s4.io;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) throws Exception {
		init("f6.txt");
		read("f6.txt");
		read("f6.txt");
		read("f6.txt");
	}
	
	private static void read(String fileName) throws Exception{
		RandomAccessFile f=new RandomAccessFile(fileName, "rw");
		int num=f.readInt();
		String name=f.readUTF();
		System.out.println(num+","+name);
		long p=f.getFilePointer();
		f.seek(0);
		num=f.readInt();
		num++;
		f.seek(0);
		f.writeInt(num);
		f.seek(p);
	}
	
	private static void init(String fileName) throws Exception{
		RandomAccessFile f=new RandomAccessFile(fileName, "rw");
		f.writeInt(200);
		f.writeUTF("laotan");
		f.close();
	}

}
