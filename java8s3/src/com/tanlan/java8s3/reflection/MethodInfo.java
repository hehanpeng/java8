package com.tanlan.java8s3.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class Class3 extends Class2{

	@Override
	void m4() {
		// TODO Auto-generated method stub
		
	}
	
}

abstract class Class2 {

	public Class2() {

	}

	public Class2(int num) {

	}

	public void m1() {

	}

	public void m1(int num) {

	}

	public void m1(int num, String s) {

	}

	void m2() {

	}

	static void m3() {

	}

	abstract void m4();
}

public class MethodInfo {

	public static void main(String[] args) {
		Class<Class2> c = Class2.class;
		Method[] m1 = c.getMethods();
		for (Method method : m1) {
			System.out.println(method.getName());
		}
		System.out.println("----------------");
		Method[] m2 = c.getDeclaredMethods();
		for (Method method : m2) {
			System.out.println(method.getName());
		}
		System.out.println("-------------------");
		try {
			Method m3 = c.getDeclaredMethod("m1", int.class, String.class);
			System.out.println(m3.getName());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		System.out.println("--------------------------");
		Constructor<?>[] cs = MethodInfo.class.getConstructors();
		for (Constructor<?> constructor : cs) {
			System.out.println(constructor.getName());
		}
		
		Constructor<?>[] cs2 = Class3.class.getDeclaredConstructors();
		for (Constructor<?> constructor : cs2) {
			System.out.println(constructor.getName());
		}
	}

}
