package com.tanlan.java8s3.reflection;

import java.io.Serializable;
import java.lang.reflect.Modifier;

abstract class Person extends Thread implements Serializable {

}

public class ClassInfo {

	public static void main(String[] args) {
		Class<Person> c = Person.class;
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		System.out.println(c.getPackage().getName());
		System.out.println(int.class.isPrimitive());
		System.out.println(c.isInterface());
		System.out.println("--------------------");
		Class<?> sc = c.getSuperclass();
		System.out.println(sc.getName());
		Class<?>[] si = c.getInterfaces();
		for (Class<?> class1 : si) {
			System.out.println(class1.getName());
		}
		System.out.println("----------------------");
		int mod=Serializable.class.getModifiers();
		System.out.println(Modifier.toString(mod));

		System.out.println(c.toGenericString());
	}
}
