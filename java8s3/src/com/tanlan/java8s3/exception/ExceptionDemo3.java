package com.tanlan.java8s3.exception;

import java.io.IOException;

public class ExceptionDemo3 {

	{
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static {
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ExceptionDemo3() {
	}

	public void test() throws IOException {
		System.in.read();
	}

	public void test1() throws IOException {
		throw new IOException();
		// try {
		// System.out.println("test1");
		// } catch (IOException e) {
		//
		// }
	}

	public static void main(String[] args) {
		int num1 = 10, num2 = 0;
		try {
			System.out.println(num1 / num2);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		ExceptionDemo3 demo = new ExceptionDemo3();
		// demo.test();

	}
}
