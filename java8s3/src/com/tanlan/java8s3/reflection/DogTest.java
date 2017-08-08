package com.tanlan.java8s3.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DogTest {

	public static void main(String[] args) {
		Class<?> c = null;
		try {
			c = Class.forName("com.tanlan.java8s3.reflection.Dog");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Dog dog = (Dog) c.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}

		try {
			Constructor constructor = c.getConstructor(String.class);
			Dog d = (Dog) constructor.newInstance("旺财");

			Method m = c.getDeclaredMethod("m1");
			System.out.println(m.invoke(d));

			Method m2 = c.getDeclaredMethod("m2", String.class);
			System.out.println(m2.invoke(d, "test"));

		} catch (NoSuchMethodException | SecurityException
				| InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		System.out.println("--------------------");
		try {
			Field f = c.getDeclaredField("name");
			f.setAccessible(true);
			Constructor constructor = c.getConstructor(String.class);
			Dog d = (Dog) constructor.newInstance("旺财");
			f.set(d, "小花");
			
			System.out.println(f.get(d));

		} catch (NoSuchFieldException | SecurityException
				| IllegalArgumentException | IllegalAccessException
				| NoSuchMethodException | InstantiationException
				| InvocationTargetException e) {
			e.printStackTrace();
		}

	}
}
