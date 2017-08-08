package com.tanlan.java8s3.generics;

class Parent<T> {
	public void test(T t) {

	}
}

class Son extends Parent<String> {
	@Override
	public void test(String t) {
		super.test(t);
	}

}

public class OverrideDemo {

}
