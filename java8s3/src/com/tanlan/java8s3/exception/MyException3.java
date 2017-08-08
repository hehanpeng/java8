package com.tanlan.java8s3.exception;

public class MyException3 extends RuntimeException {
	public MyException3() {
	}

	public MyException3(String msg) {
		super(msg);
	}

	public MyException3(Throwable t) {
		super(t);
	}

	public MyException3(String msg, Throwable t) {
		super(msg, t);
	}
}
