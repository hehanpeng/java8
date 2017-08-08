package com.tanlan.java8s3.annotation;
@SuppressWarnings("all")
class Parent {

	private int num;
	public void m() {

	}
}

@SuppressWarnings("all")
@Deprecated
class Son extends Parent {
	@Override
	public void m() {

	}
	
	@Deprecated
	void m2(){
		
	}
	
	@Deprecated
	@Annotation1
	int num;
}

@FunctionalInterface
interface Interface2{
	@Annotation1
	void m();
}

@Annotation1
public class JdkAnnotationDemo {
	public static void main(String[] args) {
		Son son=new Son();
		son.m2();
	}
}
