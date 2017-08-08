package com.tanlan.java8s3.generics;

public class WrapperUtil {
	public static void print(ObjectWrapper<?> wrapper){
		
	}
	
	public static void getValue(ObjectWrapper<? extends Number> wrapper){
		int v=wrapper.get().intValue();
		System.out.println(v);
	}
	
	public  static <T> void copy(ObjectWrapper<T> src,ObjectWrapper<? super T> desc){
		T data=src.get();
		desc.set(data);
	}
}
