package com.tanlan.java8s3.generics;

public class GenericsMethodDemo<T> {
	public <V> GenericsMethodDemo(V v) {

	}

	public GenericsMethodDemo() {

	}

	public <V> void m(V v, T t) {
		// T t=new T();
		System.out.println("m()");
	}

	public static <V> V m1(V v) {
		return null;
	}

	public static void main(String[] args) {
		GenericsMethodDemo<String> demo = new GenericsMethodDemo<>();
		demo.m("abc", "cde");
		demo.<String> m("1", "c");
		demo.<Integer> m(20, "cde");

		GenericsMethodDemo.m1("One");
		GenericsMethodDemo.<String> m1("One");
		GenericsMethodDemo.<Integer> m1(200);
		
		GenericsMethodDemo<String> demo1=new <String>GenericsMethodDemo<String>("Two"); 
		GenericsMethodDemo<Integer> demo2=new <Long>GenericsMethodDemo<Integer>(12L); 

	}

}
