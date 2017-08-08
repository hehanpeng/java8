package com.tanlan.java8s4.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("D:\\08_array.rar");
				FileOutputStream fos = new FileOutputStream("E:\\test.rar")) {
			byte[] data = new byte[2048];
			int length = 0;
			while ((length = fis.read(data, 0, data.length)) != -1) {
				fos.write(data, 0, length);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
