package com.tanlan.java8s3.reflection;

import java.lang.reflect.Field;

interface Interface1 {
	public static final int NUM = 10;
}

class Class1 {
	int num1;
	public String name;
}

class MyClass extends Class1 implements Interface1 {
	int num2;
	public int num3;
	private int num4;
}

public class FieldInfo {

	public static void main(String[] args) {
		Class<MyClass> c = MyClass.class;
		Field[] fields1 = c.getFields();
		for (Field field : fields1) {
			System.out.println(field.getName());
		}
		System.out.println("---------------------");
		Field[] fields2=c.getDeclaredFields();
		for (Field field : fields2) {
			System.out.println(field.getName());
		}
		
		System.out.println("---------------------");
		try {
			Field f1=c.getField("num3");
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
		
		System.out.println("---------------------");
		try {
			Field f1=c.getDeclaredField("num2");
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
		
	}

}
