package com.tanlan.java8s3.enum1;

public class NestedEnum {
	enum Gender {
		MALE,FEMALE
	}
}

interface Interface1{
	void m();
}

enum Enum2 implements Interface1{
	;

	@Override
	public void m() {
		
	}
	
}


