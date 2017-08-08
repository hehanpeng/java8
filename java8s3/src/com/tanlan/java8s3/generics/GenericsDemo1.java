package com.tanlan.java8s3.generics;

class Wrapper1<T> {
	private T data;

	public Wrapper1(T data) {
		this.data = data;
	}

	public T get() {
		return data;
	}
}

public class GenericsDemo1 {
	
	@SafeVarargs
	public static void test(Wrapper1<String> ... ws){
		Object[] obj=ws;
	}
	
	public static void main(String[] args) {
		Wrapper1<String> w1 = new Wrapper1<>("abc");
		Wrapper1<Object> w2 = new Wrapper1<>(new Integer(100));
		Wrapper1<Integer> w4 = new Wrapper1<>(200);
		Wrapper1 temp=w4;
		w1 = temp;

		System.out.println(w1.getClass().getName());
		System.out.println(w2.getClass().getName());

		Wrapper1 w3 = new Wrapper1(new Integer(200));// raw type
		w1 = w3;
		// w3=w1;
		String data = w1.get();
		System.out.println(data);
	}
}
