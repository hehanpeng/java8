package com.tanlan.java8s3.exception;

class MyResource implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("close...");
	}

}

public class TestTryWithResource {

	public static void main(String[] args) {

		try (MyResource resource = new MyResource();
				MyResource resource1 = new MyResource()) {

		} catch (Exception e) {

		}

	}

}
