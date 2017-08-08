package com.tanlan.java8s3.generics;

public class TestWrapperUtil {

	public static void main(String[] args) {
//		ObjectWrapper<Object> w1=new ObjectWrapper<>("hello");
//		WrapperUtil.print(w1);
//		
//		ObjectWrapper<Integer> w2=new ObjectWrapper<>(100);
//		w2.set(12);
//		WrapperUtil.print(w2);
//		
//		ObjectWrapper<?> w3=new ObjectWrapper<Integer>(12);
//		w3.set(null);
		
		ObjectWrapper<Short> w4=new ObjectWrapper<>((short)1);
		WrapperUtil.getValue(w4);
		
		ObjectWrapper<Integer> w5=new ObjectWrapper<>(100);
		ObjectWrapper<Object> w6=new ObjectWrapper<>("abc");
		System.out.println(w6.get());
		WrapperUtil.copy(w5, w6);
		System.out.println(w6.get());
	}

}
