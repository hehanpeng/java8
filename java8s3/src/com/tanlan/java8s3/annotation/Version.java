package com.tanlan.java8s3.annotation;

import com.tanlan.java8s3.enum1.Season;

public @interface Version {
	int big();

	int small();

	String name() default "abc"+"def";

	Class c() default String.class;

	Annotation1 a() default @Annotation1;

	Season s() default Season.SPRING;

	int[] nums() default {1,2,3};
	
	Season[] ss();
}
