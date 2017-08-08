package com.tanlan.java8s4.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReaderDemo {

	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("f2.txt");
		BufferedReader br = new BufferedReader(reader);
		String s = "";
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}
		reader.close();
	}

}
