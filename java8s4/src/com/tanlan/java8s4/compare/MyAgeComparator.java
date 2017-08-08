package com.tanlan.java8s4.compare;

import java.util.Comparator;

public class MyAgeComparator implements Comparator<User> {

	@Override
	public int compare(User o1, User o2) {
		if(o1.age>o2.age){
			return 1;
		}else if(o1.age<o2.age){
			return -1;
		}
		return 0;
	}

}
