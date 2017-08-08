package com.tanlan.java8s3.generics;

class Student<T>{
	public Student(){
		//T[] t=new T[10];
	}
}

public class GenercisArrayDemo {
	public static void main(String[] args) {
		//Student<String>[] students=new Student<String>[10];
		Student<?>[] students=new Student<?>[10];
		students[0]=new Student<String>();
		students[1]=new Student<Integer>();
	}
}
