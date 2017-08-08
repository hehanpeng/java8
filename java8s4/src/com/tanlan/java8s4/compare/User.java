package com.tanlan.java8s4.compare;

public class User implements Comparable<User>{
	int age;

	@Override
	public int compareTo(User o) {
		if(age>o.age){
			return 1;
		}else if(age<o.age){
			return -1;
		}
		return 0;
	}

}
