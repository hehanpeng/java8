package com.tanlan.java8s3.generics;

class Class1<T> {

}

class User<T> {
	public User(Class1<T> c) {

	}

	public User(T t) {

	}

	public User() {

	}

}

public class TestInferType {

	static void test(User<String> user) {

	}

	public static void main(String[] args) {
		User<String> user1 = new User<>("Tom");
		User<String> user2 = new User<>();

		test(new User<>());
		
		User<Integer> user3=new User<>(new Class1<>());
	}

}
