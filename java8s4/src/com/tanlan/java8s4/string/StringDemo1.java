package com.tanlan.java8s4.string;

public class StringDemo1 {

	public static void main(String[] args) {
		String s="\r\"";
		System.out.println(s);
		System.out.println("abc\u0041sde");
		System.out.println("abcsde".length());

		String s1="abc";
		String s4="abc";
		String s2=new String("abc");
		String s3=new String("abc");
		String s5="a"+"bc";
		System.out.println(s1==s2);
		System.out.println(s1==s4);
		System.out.println(s1==s5);
		
		final String s6="He";
		String s7="He";
		
		System.out.println(s6+"llo"=="Hello");
		System.out.println((s7+"llo").intern()=="Hello");
		
	}

}
