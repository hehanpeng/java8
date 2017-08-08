package com.tanlan.java8s4.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegDemo1 {

	public static void main(String[] args) {
		String reg = "a[def]c";
		String s = "sadcr";
		System.out.println(s.matches(reg));
		
		System.out.println("cdeabcadcbhafca".replaceAll(reg, "X"));
		System.out.println("cdeabcadcbhafca".replaceFirst(reg, "X"));
		
		Pattern p=Pattern.compile(reg);
		Matcher m=p.matcher("cdeabcadcbhafca");
		//System.out.println(m.find());
		while(m.find()){
			System.out.println(m.start()+","+m.end());
		}
	}

}
