package com.tanlan.java8s3.annotation;

public class TestAnnotation {
	@Test(num = 12)
	public void testAdd() {
		System.out.println("Hello Add");
	}

	@Test(num=20)
	public void testDiv() {
		System.out.println("Hello Div");
	}
}
