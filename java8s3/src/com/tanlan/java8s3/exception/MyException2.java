package com.tanlan.java8s3.exception;

public class MyException2 extends Exception {
	public MyException2() {
	}

	public MyException2(String msg) {
		super(msg);
	}

	public MyException2(Throwable t) {
		super(t);
	}

	public MyException2(String msg, Throwable t) {
		super(msg, t);
	}
}
