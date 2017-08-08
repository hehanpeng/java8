package com.tanlan.java8s3.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

import com.sun.org.apache.xerces.internal.impl.dv.xs.TypeValidator;

class Bird<T> {
	void m(T t){
		System.out.println(t);
	}
}

public class TestReflection {

	Bird<? extends Integer> b = new Bird<>();

	<V> void m() {

	}

	Bird<String>[] bs = new Bird[10];

	public static void main(String[] args) throws Exception {
		Class<TestReflection> c = TestReflection.class;
		Field f1 = c.getDeclaredField("b");
		System.out.println(f1.getType().getName());
		// System.out.println(f1.getGenericType().getName());
		if (f1.getGenericType() instanceof ParameterizedType) {
			System.out.println(((ParameterizedType) f1.getGenericType())
					.getActualTypeArguments()[0].getTypeName());
			if (((ParameterizedType) f1.getGenericType())
					.getActualTypeArguments()[0] instanceof WildcardType) {
				WildcardType wtype = (WildcardType) ((ParameterizedType) f1
						.getGenericType()).getActualTypeArguments()[0];
				System.out.println(wtype.getUpperBounds()[0].getTypeName());
			}
		}
		System.out.println("----------------------");
		Method m = c.getDeclaredMethod("m");
		TypeVariable<Method> t = m.getTypeParameters()[0];
		System.out.println(t.getName());
		System.out.println("----------------");
		Field f2 = c.getDeclaredField("bs");
		if (f2.getGenericType() instanceof GenericArrayType) {
			System.out.println(((GenericArrayType) f2.getGenericType())
					.getGenericComponentType().getTypeName());
		}
		System.out.println("----------------------");
		Bird<String> b1=new Bird<>();
		b1.m("abc");
		//b1.m(1);
		Class<?> c2=b1.getClass();
		Method m2=c2.getDeclaredMethod("m", Object.class);
		m2.invoke(b1, 1);
	}
}
