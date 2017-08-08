package com.tanlan.java8s4.format;

public class PrintfDemo {

	public static void main(String[] args) {
		System.out.printf("%s,%s,%s \n","a","b","c");
		
		System.out.printf("%1$s,%3$s,%3$s","a","b","c");
		
		System.out.printf("%1$s,%<s,%<s \n","a","b","c");
		
		System.out.printf("%-4s\n","a");
		
		System.out.printf("%06d\n",123);
		
		System.out.printf("%(d\n",-123);
		
		System.out.printf("%S\n","a");
		
		System.out.printf("%4.2s\n","abc");
		
		System.out.printf("%o",10);
	}

}
