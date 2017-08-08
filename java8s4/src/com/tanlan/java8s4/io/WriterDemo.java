package com.tanlan.java8s4.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {

	public static void main(String[] args) throws Exception {
		try(BufferedWriter bw=new BufferedWriter(new FileWriter("f5.txt"))){
			bw.append("Hello");
			bw.newLine();
			bw.append("Jack");
			bw.flush();
		}
	}

}
