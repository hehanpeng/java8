package com.tanlan.java8s4.nio;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class FileLockDemo {

	public static void main(String[] args) throws Exception {
		RandomAccessFile r=new RandomAccessFile("f2.txt", "rw");
		FileChannel c=r.getChannel();
		//FileLock lock=c.lock();
		FileLock lock=c.lock(0, c.size(), true);
		Thread.sleep(5000);
		lock.release();
	}

}
