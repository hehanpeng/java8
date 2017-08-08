package com.tanlan.java8s3.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestRun {

	public static void main(String[] args) {
		Class<TestAnnotation> c = TestAnnotation.class;
		Method[] ms = c.getDeclaredMethods();
		for (Method method : ms) {
			if (method.isAnnotationPresent(Test.class)) {
				Test t = method.getAnnotation(Test.class);
				int num = t.num();
				if (num > 10 && num < 15) {
					continue;
				}
				try {
					method.invoke(c.newInstance());
				} catch (IllegalAccessException | IllegalArgumentException
						| InvocationTargetException | InstantiationException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
