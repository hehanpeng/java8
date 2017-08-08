package com.tanlan.java8s3.annotation;

import java.lang.annotation.Repeatable;

@Repeatable(Annotation1s.class)
public @interface Annotation1 {
}

@interface Annotation1s{
	Annotation1[] value();
}

@Annotation1s({@Annotation1,@Annotation1})
class MMM{
	
}

