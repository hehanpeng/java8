package com.tanlan.java8s4.string;

public class StringDemo2 {

	public static void main(String[] args) {
		String s = "abcdefcdefgcdefg";
		System.out.println(s.charAt(2));
		String s1 = new String();
		System.out.println(s1.isEmpty());
		System.out.println(s1 == "");
		System.out.println(s1.equals(""));
		System.out.println("".equals(s1));
		System.out.println(s.indexOf("cd", 3));
		System.out.println(s.lastIndexOf("cd"));
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 5));
		System.out.println("\r  as   \n".trim().length());
		System.out.println(s.replace('c', 'C'));
		System.out.println(s.replace("cd", "XX"));
		System.out.println(s.startsWith("abcd"));
		System.out.println(s.endsWith("efg"));

		String[] result = s.split("c");
		for (String string : result) {
			System.out.println(string);
		}
		
		System.out.println(String.join("-", "a","b","bbb"));
		
		System.out.println(String.valueOf(new char[]{'a','b','c','d'}, 1, 2));
		
		System.out.println("Ebc".compareTo("bcd"));
	}

}
