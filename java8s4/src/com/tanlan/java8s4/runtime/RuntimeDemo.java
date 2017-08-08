package com.tanlan.java8s4.runtime;

import java.io.IOException;

public class RuntimeDemo {

	public static void main(String[] args) throws Exception {
		Runtime r=Runtime.getRuntime();
		System.out.println(r.maxMemory());
		System.out.println(r.totalMemory());
		System.out.println(r.freeMemory());
		System.out.println(r.availableProcessors());
		r.gc();
		r.exec("notepad").waitFor();
	}

}
