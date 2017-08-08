package com.tanlan.java8s4.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws Exception {
		System.out.println(System.getProperty("user.dir"));
		File f1 = new File("f2.txt");
		// //f1.delete();
		// File f2=new File("test/a/b");
		// System.out.println(f2.exists());
		// f2.mkdir();
		// System.out.println(f1.exists());
		// System.out.println(f1.createNewFile());
		// f1.renameTo(new File("f2.txt"));
		// System.out.println(System.getProperty("java.io.tmpdir"));
		// File.createTempFile("aaa", "tmp");
		System.out.println(f1.length());
		for (File f : File.listRoots()) {
			System.out.println(f.getPath());
		}

		File src = new File("src/com/tanlan/java8s4/collection");
		File[] files=src.listFiles(file->file.getName().endsWith("Demo.java"));
		for (File file2 : files) {
			System.out.println(file2.getName());
		}
//		for (String string : src.list()) {
//			System.out.println(string);
//		}
	}

}
