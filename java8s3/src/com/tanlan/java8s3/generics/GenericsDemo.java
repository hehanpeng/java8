package com.tanlan.java8s3.generics;

class GenericWrapper<T> {
	private T data;

	public GenericWrapper(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}

public class GenericsDemo {

	public static void main(String[] args) {
		GenericWrapper<String> w1 = new GenericWrapper<>("One");
		String d1 = w1.getData();
		GenericWrapper<Integer> w2 = new GenericWrapper<>(100);
		// GenericWrapper<String> w2 = new GenericWrapper<String>(new
		// Integer(100));
		MyImplements<String> imp = new MyImplements<>();
		String s = imp.test("");
	}

}
