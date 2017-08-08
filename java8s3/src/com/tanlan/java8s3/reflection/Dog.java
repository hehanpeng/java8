package com.tanlan.java8s3.reflection;

public class Dog {
	private String name;
	
	public Dog() {
		System.out.println("Dog 构造方法");
	}

	public Dog(String name) {
		System.out.println("Dog 构造方法:" + name);
	}
	
	public void m1(){
		System.out.println("m1");
	}
	
	public int m2(String s){
		System.out.println("m2");
		return 1;
	}

}
