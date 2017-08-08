package com.tanlan.java8s3.exception;

import java.io.IOException;

public class TestMultiCatch {
	public static void main(String[] args) {
		try {
			System.in.read();
			Class.forName("");
		} catch (IOException | ClassNotFoundException e) {
			
		}
	}
}
