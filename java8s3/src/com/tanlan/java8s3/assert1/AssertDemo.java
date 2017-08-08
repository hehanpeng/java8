package com.tanlan.java8s3.assert1;

import java.util.Calendar;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AssertDemo {

	public static void m(int num) {
		// if(num<=0){
		// throw new IllegalArgumentException();
		// }
		// assert num > 0 : "参数不合法";
		System.out.println(num);
		String s = "\u0041";
		System.out.println(s);

		final String constStr = "He";
		String varStr = "He";
		String s1 = constStr + "llo";
		String s2 = varStr + "llo";
		System.out.println("Hello" == s2.intern());
		// "Variable is not pooled" == s2
		System.out.println("cat".compareTo("Dog"));
		String reg = "w[abc]s";
		System.out.println("It was the best of times".matches(reg));
	}

	public static void main(String[] args) {
		String reg = "w[abc]s";
		System.out.println("wbs".matches(reg));

		System.out.println("was test wbs wds".replaceAll(reg, "XXX"));
		System.out.println("was test wbs wds".replaceFirst(reg, "XXX"));

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher("waas test wbs wds");
		// while(m.find(1)){
		// System.out.println("aa");
		// }
		if (m.find()) {
			System.out.println(m.start() + "," + m.end());
		}

		// int num = 10;
		// assert num == 10 : "num不是10，num=" + num;
		// System.out.println("Assert");
		// m(-20);
		// System.out.println("End");
		

		Calendar c = Calendar.getInstance();
		System.out.println(c);
		c.add(Calendar.YEAR, 3);
		System.out.println(c.getTimeInMillis());
		c.roll(Calendar.YEAR, true);
		System.out.println(c.getTimeInMillis());

		Calendar calendar = Calendar.getInstance();
		calendar.set(2000, 2, 26);// 代表2002年1月12日
		calendar.roll(Calendar.MONTH, -4);
		System.out.println(calendar.get(Calendar.YEAR) + ","
				+ calendar.get(Calendar.MONTH) + ","
				+ calendar.get(Calendar.DATE));

	}

}
