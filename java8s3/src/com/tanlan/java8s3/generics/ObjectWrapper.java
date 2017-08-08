package com.tanlan.java8s3.generics;

public class ObjectWrapper<T> {
	private T data;
	
	public ObjectWrapper(T data){
		this.data=data;
	}
	
	public T get(){
		return data;
	}
	
	public void set(T data){
		this.data=data;
	}
}
