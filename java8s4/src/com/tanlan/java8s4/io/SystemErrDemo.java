package com.tanlan.java8s4.io;

import java.io.IOException;

public class SystemErrDemo {

	public static void main(String[] args) throws Exception {
		System.err.println("Error");
		int num = -1;
		while ((num = System.in.read()) != '\n') {
			System.out.print((char)num);
		}
	}

}
