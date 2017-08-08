package com.tanlan.java8s3.exception;

public class TestMyException {

	public void test2(int num) {
		if (num % 2 == 0) {
			throw new MyException3();
		}
	}

	public void test1() throws MyException2 {
		try {
			test(1);
		} catch (MyException e) {
			e.printStackTrace();
			throw new MyException2("error", e);
		}
	}

	public void test(int num) throws MyException {
		if (num < 10) {
			throw new MyException("num小于10");
		}
	}

	public static void main(String[] args) {
		TestMyException test = new TestMyException();
		// try {
		// test.test1();
		// } catch (MyException2 e) {
		// Throwable cause = e.getCause();
		// if (cause instanceof MyException) {
		// System.out.println("MyException");
		// }
		// e.printStackTrace();
		// }
		try {
			test.test2(2);
		} catch (MyException3 e) {
			e.printStackTrace();
		}
		System.out.println("hello");
	}

}
