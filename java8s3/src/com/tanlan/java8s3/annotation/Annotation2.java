package com.tanlan.java8s3.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER,
		ElementType.CONSTRUCTOR })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Repeatable(Annotation2s.class)
public @interface Annotation2 {
	String[] value() default { "a", "b" };

	int num() default 1;
}

@Target({ ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER,
	ElementType.CONSTRUCTOR })
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface Annotation2s {
	Annotation2[] value();
}
