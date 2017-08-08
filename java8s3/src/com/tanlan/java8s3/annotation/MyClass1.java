package com.tanlan.java8s3.annotation;

import java.lang.annotation.Annotation;

public class MyClass1 implements Annotation1{

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

}
