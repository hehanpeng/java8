package com.tanlan.java8s3.exception;

import java.io.IOException;

public class TestException {
	public void test() throws IOException,ClassNotFoundException {
		try {
			System.in.read();
			Class.forName("");
		} catch (Exception e) {
			throw e;
		}
	}
}
