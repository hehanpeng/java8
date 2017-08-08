package com.tanlan.java8s3.exception;

class MyException4 extends MyException{
	
}

class Parent {
	public void m() throws MyException {

	}
}

class Son extends Parent {
	@Override
	public void m() throws MyException4{
		
	}
}

public class TestOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
