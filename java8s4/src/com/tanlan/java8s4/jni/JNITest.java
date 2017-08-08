package com.tanlan.java8s4.jni;

public class JNITest {
	
	static{
		System.loadLibrary("jnitest");
	}
	
	public native void test();
	
	public static void main(String[] args) {
		new JNITest().test();
	}

}
