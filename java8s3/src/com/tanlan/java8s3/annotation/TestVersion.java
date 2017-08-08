package com.tanlan.java8s3.annotation;

import com.tanlan.java8s3.enum1.Season;

@Version(big = 1, small = 2, name = "Tom", c = Integer.class, 
    a = @Annotation1, s = Season.SUMMER,
    nums={3},ss=Season.AUTUMN
		)
public class TestVersion {

}
