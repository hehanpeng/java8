package com.tanlan.java8s4.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelDemo {

	public static void main(String[] args) throws Exception {
		read();
		//write();
	}

	private static void read() throws FileNotFoundException, IOException {
		long now=System.currentTimeMillis();
		FileInputStream fis=new FileInputStream("f2.txt");
		FileChannel c=fis.getChannel();
		ByteBuffer buffer=ByteBuffer.allocate(1024);
		while(c.read(buffer)>0){
			buffer.flip();
			while(buffer.hasRemaining()){
				System.out.print((char)buffer.get());
			}
			buffer.clear();
		}
		System.out.println(System.currentTimeMillis()-now);
	}
	
	public static void write() throws Exception{
		FileOutputStream fos=new FileOutputStream("f7.txt");
		FileChannel c=fos.getChannel();
		String text="abcdefg";
		ByteBuffer buffer=ByteBuffer.wrap(text.getBytes());
		c.write(buffer);
	}

}
